package Com.CRM.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	

	WebDriver driver;
	public Homepage(WebDriver d){

		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='grouptab_2']")
	WebElement clickonsupport;

	@FindBy(xpath="//a[@id='moduleTab_2_Home']")
	WebElement clickonhome;
	
	@FindBy(id="add_dashlets")
	WebElement gettextofdashlate;
	

 public void clickonsupporttab() {
	 clickonsupport.click();	   
	   }
	
   public void clickonhometab() {
	   clickonhome.click();	   
   } 
  
   public String gettextofadddashlate() {
	  String Text=gettextofdashlate.getText();	  
          return Text ;
	   
   }
  
  

}
