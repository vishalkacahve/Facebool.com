package com.testpage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.baseclass.BaseClass;
import com.loginpage.HeaderBar;
import com.loginpage.LoginPage;
import com.mylistener.MyListener;
import com.runner.TestRunner;



@Listeners(MyListener.class)
public class TestPage extends BaseClass {
	
	
	LoginPage lPage = null;
	HeaderBar hb = null;
	TestRunner tRunner;
	@BeforeSuite
	public void Setup() throws Exception {
		initialization();
		reportInit();
		lPage = new LoginPage(driver);
	}

	@Test(priority = 1)
	public void VerifyLogin() throws InterruptedException {
		lPage.loginApplication("vishal kachave1 ","22527100");
		//assertEquals(driver.getTitle(), "(20+) Facebook");
		
	}
	@Test(priority = 2)
	public void VerifyHederBar() throws InterruptedException {
		hb=lPage.headerbar1();
		//assertEquals(driver.getTitle(), "(20+) Facebook");
//		assertEquals(driver.getTitle(), "Marketplace|Facebook");
//		assertEquals(driver.getTitle(), "Groups|Facebook");
//		assertEquals(driver.getTitle(), "Gaming|Facebook");
//		assertEquals(driver.getTitle(), "Home|Facebook");
	}
	@Test(priority = 3)
	public void verifyTestCase() {
		tRunner=lPage.testcase();
	}
	
	
	
	

}
