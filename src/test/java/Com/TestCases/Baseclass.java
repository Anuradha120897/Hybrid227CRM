package Com.TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.Utility.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static WebDriver driver;
	public static ExtentReports report=null;
	public static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	//reusability code is write n base class 
	
	//make the object of Readconfig class to get the url and browser
	Readconfig readconfig = new Readconfig();
	String Url=readconfig.getUrl();
	String browser=readconfig.getBrowser();

	
	
	
@BeforeClass
@Test
public void setup() throws InterruptedException {
	if(browser=="Chrome")
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

    if (browser=="Firefox") {
    	WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    
//    here we get the logger present in below project
    
}

public static String getScreenshot(String name) {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	SimpleDateFormat sdf= new SimpleDateFormat("ddMMyyyyhhmmss");
	String date=sdf.format(new Date());
	String path=System.getProperty("user.dir")+"/src/test/resources/screenshots/"+name+"_"+date+".jpg";
	File dest= new File(path);
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return path;
}


}







	
	



// we can also write implicity wait here this wait will applicable on all webelement