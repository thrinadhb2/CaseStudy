package page;

import org.openqa.selenium.WebDriver;

public class Page {

	WebDriver driver = null;

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void printTitle() {
		System.out.println(driver.getTitle());
	}
}
