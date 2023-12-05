package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.PageObjectModel.HomePageObject;
import com.PageObjectModel.LoginPageObject;

import com.Resources.Base_Class;
import com.Resources.Constants;

public class Login_TestCases extends Base_Class {
	
	@Test
	public void InValidLoginTest() throws IOException {
	
		HomePageObject hpo = new HomePageObject(driver);
		hpo.ClickOnmyAccount().click();
		hpo.ClickOnLogin().click();
		
		//This driver have scope---> because its coming from base class
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.enterEmailID().sendKeys(Register_TestCases.randomEmail);
		
		lpo.enterPassword().sendKeys("");
		lpo.clickOnLoginButton().click();
		
	}

	@Test(dependsOnMethods="InValidLoginTest")
	public void ValidLoginTest() throws IOException {
	
		HomePageObject hpo = new HomePageObject(driver);
		hpo.ClickOnmyAccount().click();
		hpo.ClickOnLogin().click();
		
		//This driver have scope---> because its coming from base class
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.enterEmailID().sendKeys(Register_TestCases.randomEmail);
		
		lpo.enterPassword().sendKeys(Constants.Password);
		lpo.clickOnLoginButton().click();
		
	}

}