package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	public String readDataFromProperties(String key) throws IOException {
		// step 1-->get the object of properties file
		FileInputStream fis = new FileInputStream("./commondata/A2Commondata.properties");
		// step 2-->load the properties file
		Properties prop = new Properties();
		prop.load(fis);
		// step 3-->read the data
		String data = prop.getProperty(key);
		return data;
	}

}
