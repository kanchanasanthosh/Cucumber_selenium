package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_passwordpage {
	
	
	@FindBy(id="un")WebElement uname;
	@FindBy(id="continue")WebElement continuefield;
	
	public Forgot_passwordpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void provideUsername(String fnname) throws InterruptedException {
		uname.sendKeys(fnname);
		Thread.sleep(1000);
		continuefield.click();
		Thread.sleep(1000);
	}

}
