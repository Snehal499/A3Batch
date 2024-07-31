package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\TUF GAMING\\Desktop\\Selenium\\Selenium Projects\\Automation\\src\\Properties\\Config.properties");
		//File f=new File("\\Properties\\Config.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("password"));
		
	}
}
