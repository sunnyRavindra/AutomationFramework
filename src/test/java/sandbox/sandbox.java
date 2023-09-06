package sandbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sandbox {

	public static void main(String[] args) throws IOException {
	
		//Initializing base Config Properties 
		Properties BaseConfig = new Properties();
//		FileInputStream BaseConfigInputFile = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//config.properties");
//		BaseConfig.load(BaseConfigInputFile);
//		
//		//Initializing OR Config Properties 
//		Properties ORConfig = new Properties();
//		FileInputStream ORConfigInputFile = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//OR.properties");
//		ORConfig.load(ORConfigInputFile);
//
		
	
		System.out.println(BaseConfig.getProperty("browser"));
//		System.out.println(ORConfig.getProperty("usernameinput"));
	}

}
