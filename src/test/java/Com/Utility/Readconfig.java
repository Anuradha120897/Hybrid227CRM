package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {


	Properties properties;
//path of properties file where we save it
	String path="D:\\JBK\\Anu-Eclipse\\Anu-Eclipse\\Maven Project\\Com.HybridFramework.Project.Advsel\\Configuration\\config.properties";

//paramatized constructor
	
	public Readconfig(){ 
//intialized the object of properties
		properties = new Properties();
		
		try {
//reading the properties file
			FileInputStream fis = new FileInputStream(path);
//load the file			
			properties.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


//check keys in properties file and for every key we have to write the method here
//properties file conatin 2 keys are created so we had write the two method here
	
	public String getUrl() {
		//properties contain get property method 

		String value=properties.getProperty("Url");
		if (value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("Url are not specified");
		}
	}


	public String getBrowser() {

		String value=properties.getProperty("Browser");
		if (value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("Browser are not specified in config file");
		}
	}}




