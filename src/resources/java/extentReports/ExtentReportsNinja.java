package extentReports;
import java.io.File;
import java.io.FileInputStream;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNinja {

	public static ExtentReports extentReports;
	public static FileInputStream fileInputStream;
	public static ExtentSparkReporter extentSparkReporter;
	public static File file;
	public static ExtentReports getReports() {
		try {
			extentReports = new ExtentReports();
			String src = System.getProperty("user.dir")+"\\src\\resources\\java\\reports\\one.html";
			System.out.println(src);
			fileInputStream = new FileInputStream(new File(src));
			extentSparkReporter = new ExtentSparkReporter(file);
			extentReports.attachReporter(extentSparkReporter);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return extentReports;
		
	}
}
