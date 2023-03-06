package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage {
	private WebDriver driver;

@FindBy(id="username")WebElement user;
	
	@FindBy(id="password")WebElement pass;
	
	@FindBy(id="Login")WebElement loginbtn;
	
	@FindBy(id="error")WebElement errortext;
	@FindBy(id="forgot_password_link")WebElement forgotpwd;
	@FindBy(id="rememberUn")WebElement remember;
	
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		 return driver.getTitle();
		 
		
	}
	
	public void enterUserName(String username) throws InterruptedException {
		user.sendKeys(username);
		Thread.sleep(2000);
	}
	
	public void enterPassword(String passWord) throws InterruptedException {
		pass.sendKeys(passWord);
		Thread.sleep(2000);
	}
	
	public void clickLoginbtn() throws InterruptedException {
		loginbtn.click();
		Thread.sleep(2000);
		
	}
	public void enternullPassword(String npassWord) throws InterruptedException {
		pass.clear();
		pass.sendKeys(npassWord);
		Thread.sleep(2000);
	}
	public String get_error_message() {
		String  errormsg = errortext.getText();
		return errormsg;
		
	}
	
	public void selectCheckbox() throws InterruptedException {
		remember.click();
		Thread.sleep(1000);
	}
	public String getUsenamefieldText() {
		return user.getText();
	}
	
	public void clickForgotPassword() throws InterruptedException {
		forgotpwd.click();
		Thread.sleep(1000);
	}
	
	public void enterInvalidUserName(String inusername) throws InterruptedException {
		user.sendKeys(inusername);
		Thread.sleep(2000);
	}
	public void enterinvalidPassword(String inpassWord) throws InterruptedException {
		pass.sendKeys(inpassWord);
		Thread.sleep(2000);
	}
	

	
}
