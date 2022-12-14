package com.page;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	


	public class PageObject  {
		
		WebDriver driver;

		@FindBy(id="email")
		WebElement uname;
		
		@FindBy(id="pass")
		WebElement pass;
		
		@FindBy(xpath="//button")
		WebElement loginBtn;
		
		public  PageObject(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void loginToApplication(String username, String password) {
			uname.sendKeys(username);
			pass.sendKeys(password);
			loginBtn.click();
		}

		
}



