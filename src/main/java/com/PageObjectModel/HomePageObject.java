package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	
	private By myAccount = By.xpath("//i[@class='fa fa-user']");
	private By Register = By.xpath("(//a[contains(text(),'Register')])[1]");
	private By Login = By.xpath("(//a[contains(text(),'Login')])[1]");
	
	
	public HomePageObject(WebDriver driver2) {
		
		this.driver = driver2;
		
	}

	public WebElement ClickOnmyAccount() {

		return driver.findElement(myAccount);

	}
	
	public WebElement ClickOnRegister() {

		return driver.findElement(Register);

	}
	
	public WebElement ClickOnLogin() {

		return driver.findElement(Login);

	}

}

