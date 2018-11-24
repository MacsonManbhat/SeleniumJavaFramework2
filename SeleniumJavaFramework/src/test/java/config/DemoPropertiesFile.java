package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;



public class DemoPropertiesFile {

	static String ProjectLocation = System.getProperty("user.dir");
	static Properties prop = new Properties();
	
	
	public static void main(String[] args) {
		getproperties();
		setproperties();

	}

	public static void getproperties() {

		try {
			Properties prop = new Properties();
			
			InputStream input = new FileInputStream(ProjectLocation + "/src/test/java/config/config.properties");
			prop.load(input);
			String Browser =	prop.getProperty("browser");
			String Result =	prop.getProperty("result");
			System.out.println(Browser);
			System.out.println(Result);
			
		
		
			

		} 

		catch (Exception exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		}


	}

	public static void setproperties() {
		
		try {
			
			OutputStream output = new FileOutputStream(ProjectLocation + "/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			//prop.setProperty("Religion", "Sanatan");
			prop.setProperty("Result", "Failed but passed");
			testDemo.browserName = "firefox";
			
			
			prop.store(output, null);
			
			
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		}
		}



	}

