package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

public static Properties property;
	
	static {
		try {
			File file = new File("./src/test/resources/TestData/env_variables.properties");
			FileInputStream input = new FileInputStream(file);
			property = new Properties();
			property.load(input);
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		return property.getProperty(key);
	}
	
}
