package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\meniv\\eclipse-automationWorkspace\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
	}

}
