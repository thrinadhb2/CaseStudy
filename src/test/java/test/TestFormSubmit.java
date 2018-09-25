package test;

import org.testng.annotations.Test;

import base.BaseTest;
import page.Page;

public class TestFormSubmit extends BaseTest {
	
	Page page=new Page();

	@Test
	public void test() {
		page.setDriver(BaseTest.driver);
		page.printTitle();
	}
	
}
