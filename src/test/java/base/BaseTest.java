package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import page.Page;

public class BaseTest extends Page {

	public static WebDriver driver;

	static Properties prop = new Properties();

	@BeforeMethod
	public void intializeDriver() throws IOException {
		FileInputStream input = new FileInputStream(new File("src/test/resources/config.properties"));
		prop.load(input);
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
