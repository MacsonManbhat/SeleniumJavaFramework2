package config2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class cricinfotest {

	public static void main(String[] args) {

		getValueszfromConfigFile();
		setValueszInPropertiesFile();
		getValueszfromConfigFile();

	}

	public static void getValueszfromConfigFile() {
		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream("C:\\Users\\mmanbhat\\eclipse-workspace\\"
					+ "SeleniumJavaFramework\\src\\test\\java\\config2\\propertiesFile");
			try {
				prop.load(input);
				String engine =	prop.getProperty("browser");
				String urName = prop.getProperty("firstName");
				String lastOne =	prop.getProperty("lastName");
				String Role =	prop.getProperty("jobStatus");
				ExecutionWithTestNG.browser = engine ;

				System.out.println("We are using the browser " + engine +
						" The Persion Performing the Test is " + urName + 
						"" + lastOne + ". I feel this person is a " + Role );
				


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			System.out.println("The Test has Completed. Please validate the results.");

		}
		}
	
	public static void setValueszInPropertiesFile()	{
		
	try {
		Properties prop = new Properties();
		//String projectLocation = System.getProperty("user.dir");	
		OutputStream output = new FileOutputStream("C:\\Users\\mmanbhat\\eclipse-workspace\\"
				+ "SeleniumJavaFramework\\src\\test\\java\\config2\\propertiesFile");
		prop.setProperty("albert", "Einstein");
		prop.setProperty("browser", "IE");
		prop.setProperty("firstName", "Wizard");
		prop.setProperty("lastName", "Oz");
		prop.setProperty("jobStatus","Fulltimer");
		try {
			prop.store(output, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("The New Values are set Please verify/////");
			System.out.println();
		}
	
	    
		
		
		
		
	}
}
