package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadConfig {
	static Properties prop = new Properties();
	public static void loadConfig() throws IOException {
		FileInputStream input = new FileInputStream(new File("src/test/resources/config.properties"));
		prop.load(input);
		
	}

}
