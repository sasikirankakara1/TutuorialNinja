package baseFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NinjaTutorialsBase {
	public static WebDriver driver;
	public static Properties properties;
	public static File file;
	public static FileInputStream fileInputStream;
	public static Properties getPropDetails(String name) {
		try {
			properties = new Properties();
			System.out.println(System.getProperty("user.dir"));
			file = new File(System.getProperty("user.dir")+"\\src\\resources\\java\\props\\"+name+".properties");
			fileInputStream  = new FileInputStream(file);
			properties.load(fileInputStream);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	return properties;	
	}
	public static WebDriver optBrowser(String fileName) {
		if (getPropDetails(fileName).getProperty("browser").toLowerCase().equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(getPropDetails(fileName).getProperty("browser").toLowerCase().equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(getPropDetails(fileName).getProperty("browser").toLowerCase().equals("msedge")) {
			driver = new EdgeDriver();
		}
		driver.get(getPropDetails(fileName).getProperty("url").toLowerCase());
		driver.manage().window().maximize();
		return driver;
	}
	public static String takeScreenShot(String name) {
		File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File ds = new File(System.getProperty("user.dir")+"\\src\\resources\\java\\images\\"+name+".png");
		try {
			FileUtils.copyFile(ts, ds);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	@Test
	public void testName() throws Exception {
		System.out.println(getPropDetails("one").getProperty("url"));
		optBrowser("one");
	}
}
