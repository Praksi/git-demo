package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Testclass {

	public static void main(String[] args) throws IOException {
		
		String userdir=System.getProperty("user.dir"); //system current projectpath
		System.out.println(userdir);  
		String filepath =userdir+"\\src\\main\\java\\congif\\propertites\\config.properties";
		System.out.println(filepath);
		File file=new File(filepath); //to reading create file
		FileReader filereader =new FileReader(file);
		Properties prop =new Properties(); // create object of that property file
		prop.load(filereader); //load the file
	System.out.println(prop.getProperty("Url"));	
	System.out.println(prop.getProperty("UserName"));
	System.out.println(prop.getProperty("browser"));
	
		
	}

}
