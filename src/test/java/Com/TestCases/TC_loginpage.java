package Com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.CRM.PageObject.Homepage;
import Com.CRM.PageObject.loginpage;

public class TC_loginpage extends Baseclass {
	
	
	@Test(priority = 1)
	public void login() {
		
		driver.get(Url);
		loginpage logpage= new loginpage(driver);
		logpage.enterusname("admin");
		logpage.enterpass("pass");
		logpage.Clickonloginbtn();}
		
		@Test(priority = 2)
		public void Home() {
		Homepage hp = new Homepage(driver);
		hp.clickonsupporttab();
		hp.clickonhometab();

		String text =hp.gettextofadddashlate();
		
		Assert.assertEquals("Add Dashlets",text);

		
		
		
	
	
	
	
	}
}
