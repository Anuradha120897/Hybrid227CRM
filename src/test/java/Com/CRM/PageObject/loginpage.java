package Com.CRM.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory 

public class loginpage {


	WebDriver driver;
	
	public loginpage(WebDriver d){

		this.driver=d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user_name") WebElement username;

	@FindBy(id="user_password") 
	WebElement password;

	@FindBy(id="login_button") 
	WebElement login;


	public void enterusname(String usname) {

		username.sendKeys(usname);
	}

	
	public void enterpass(String pass) {

		password.sendKeys(pass);
	}
	
	
	public void Clickonloginbtn() {

		login.click();
	}
}
