package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonFiles {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "#input-firstname")
	private WebElement fname;
	@FindBy(css = "#input-lastname")
	private WebElement lname;
	@FindBy(css = "#input-email")
	private WebElement email;
	@FindBy(css = "#input-telephone")
	private WebElement telephone;
	@FindBy(css = "#input-password")
	private WebElement password;
	@FindBy(css = "#input-confirm")
	private WebElement confirmPassword;
	@FindBy(css = "input[type='radio']")
	private List<WebElement> radios;
	@FindBy(css = "input[name='agree']")
	private WebElement policy;
	@FindBy(css = "input[class='btn btn-primary']")
	private WebElement continueBtn;
	@FindBy(css = "label[class='radio-inline']>input")
	private List<WebElement> radioBtns;

	public void login(String firstName, String lastname, String emailid, String telephoneNum, String actualPassword,
			String confirmedPassword, String indexValue) {

	}
}
