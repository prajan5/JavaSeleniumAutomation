package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadValueFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//set path for the properties file 
		FileInputStream f = new FileInputStream("src/main/resources/English.properties");
		//create object for properties class 
		Properties p = new Properties();
		//load 
		p.load(f);
		//read the value from property file
		String sname = p.getProperty("userName");
		System.out.println(sname);
		
		String spassword = p.getProperty("password");
		System.out.println(spassword);
		
		
		
		

	}

}
