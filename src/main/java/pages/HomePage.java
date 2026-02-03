package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonFiles {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "ul[class='list-inline']>li")
	private List<WebElement> navList;
	@FindBy(css = "ul[class='dropdown-menu dropdown-menu-right']>li")
	private List<WebElement> dropList;

	public void clickSpecificTab(String tabName) {
		navList.stream().filter(p -> p.getText().contains(tabName)).findFirst().orElse(null).click();
	}

	public void clickSpecificTabWithinDropdown(String navBarTabName, String dropdownTabName) {
		clickSpecificTab(navBarTabName);
		dropList.stream().filter(p -> p.getText().contains(dropdownTabName)).findFirst().orElse(null).click();
	}

}
