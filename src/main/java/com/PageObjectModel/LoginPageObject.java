package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By EmailID = By.xpath("//input[@name='email']");
	private By Password = By.xpath("//input[@name='password']");
	private By LoginButton = By.xpath("//input[@value='Login']");
	


	public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement enterEmailID() {

		return driver.findElement(EmailID);

	}
	
	public WebElement enterPassword() {

		return driver.findElement(Password);

	}
	
	public WebElement clickOnLoginButton() {

		return driver.findElement(LoginButton);

	}

}
