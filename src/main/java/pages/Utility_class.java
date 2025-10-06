package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility_class {
	
	public static  String property(String key) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\p.properties";
		
		FileInputStream fs=new FileInputStream(path);
	
		Properties prop=new Properties();
		prop.load(fs);
		
		String value = prop.getProperty(key);
		
	return value;
	}

}
