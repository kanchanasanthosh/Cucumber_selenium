package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	private WebDriver driver;
	
	@FindBy(id="tryLexDialogX")WebElement promptwindow;
	@FindBy(id="userNav")WebElement usermenu;
	@FindBy(xpath="//a[@title='Logout']")WebElement logout;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logoutfromapp() throws InterruptedException {
		promptwindow.click();
		usermenu.click();
		logout.click();
		Thread.sleep(3000);
	}
	

}
