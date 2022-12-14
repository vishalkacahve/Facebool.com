package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import com.baseclass.BaseClass;
import com.mylistener.MyListener;
import com.runner.TestRunner;

@Listeners(MyListener.class)
public class LoginPage extends BaseClass {

	WebDriver driver = null;
	
	
	@FindBy(id="email")
	public WebElement user;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(xpath="//button")
	public WebElement Button;
	
	@FindBy(xpath="//a[@aria-label='Watch']//parent::div")
	public WebElement watch;
	
	@FindBy(xpath="//a[@aria-label='Marketplace']//parent::div")
	public WebElement marketplace;
	
	@FindBy(xpath="//a[@aria-label='Groups']//parent::div")
	public WebElement group;
	
	@FindBy(xpath="//a[@aria-label='Gaming']//parent::div")
	public WebElement gaming;
	
	@FindBy(xpath="//a[@aria-label='Home']//parent::div")
	public WebElement home;

	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    public void loginApplication(String username,String Password) throws InterruptedException {
		user.sendKeys(username);
		password.sendKeys(Password);
		Button.click();
		Thread.sleep(20000);
		
	}
	
	public HeaderBar headerbar1() throws InterruptedException {
		watch.click();
		Thread.sleep(3000);
		marketplace.click();
		Thread.sleep(3000);
		group.click();
		Thread.sleep(3000);
		gaming.click();
		Thread.sleep(3000);
		home.click();
	    return new HeaderBar(driver);
	}
	public TestRunner testcase() {
		return new TestRunner();
		
	}
	


	
   
	
}
