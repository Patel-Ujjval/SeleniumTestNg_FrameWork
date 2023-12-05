package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPageObject {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By EmailID = By.xpath("//input[@name='email']");
	private By Telephone = By.xpath("//input[@name='telephone']");
	private By Password = By.xpath("//input[@name='password']");
	private By PasswordConfrm = By.xpath("//input[@name='confirm']");
	private By SubscribeButton = By.xpath("(//input[@name='newsletter'])[1]");
	private By PolicyButton = By.xpath("//input[@name='agree']");
	private By RegisterContinueButton = By.xpath("//input[@type='submit']");
	private By FirstnameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");
	private By LastnameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");

	// driver2 took the scope of driver from register test cases class

	public RegisterationPageObject(WebDriver driver2) {
		
		this.driver = driver2;

	}

	public WebElement enterFirstName() {

		return driver.findElement(firstname);

	}

	public WebElement enterLastName() {

		return driver.findElement(lastname);

	}

	public WebElement enterEmailID() {

		return driver.findElement(EmailID);

	}

	public WebElement enterTelephone() {

		return driver.findElement(Telephone);

	}

	public WebElement enterPassword() {

		return driver.findElement(Password);

	}

	public WebElement enterPasswordConfrm() {

		return driver.findElement(PasswordConfrm);

	}

	public WebElement clickOnSubscribeButton() {

		return driver.findElement(SubscribeButton);

	}

	public WebElement agreePolicyButton() {

		return driver.findElement(PolicyButton);

	}
	
	public WebElement capturedFirstnameErrorMsg() {

		return driver.findElement(FirstnameErrorMsg);

	}
	
	public WebElement capturedlastnameErrorMsg() {

		return driver.findElement(LastnameErrorMsg);

	}
	
	public WebElement clickOnRegisterContinueButton() {

		return driver.findElement(RegisterContinueButton);

	}

}
