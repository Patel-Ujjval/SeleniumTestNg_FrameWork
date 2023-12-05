package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PageObjectModel.HomePageObject;
import com.PageObjectModel.RegisterationPageObject;
import com.Resources.Base_Class;
import com.Resources.CommonMethods;
import com.Resources.Constants;

public class Register_TestCases extends Base_Class {

	public static String randomEmail="";
	
	@Test
	public void VerifyRegistrationWithBlankData() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);
		
		CommonMethods.putExplicitWait(driver, 5, hpo.ClickOnmyAccount());
		
		hpo.ClickOnmyAccount().click();
		hpo.ClickOnRegister().click();
		// Thread.sleep(5000);

		// This driver have scope---> because its coming from base class

		RegisterationPageObject rpo = new RegisterationPageObject(driver);
		rpo.enterFirstName().sendKeys("");
		// rpo.enterFirstName().clear();
		rpo.enterLastName().sendKeys("");
		// rpo.enterlastName().clear();
		//rpo.enterEmailID().sendKeys("");
		// rpo.enterEmailID().clear();
		rpo.enterTelephone().sendKeys("");
		// rpo.enterTelephone().clear();
		rpo.enterPassword().sendKeys("");
		// rpo.enterPassword().clear();
		rpo.enterPasswordConfrm().sendKeys("");
		// rpo.enterPasswordConfrm().clear();
		rpo.clickOnSubscribeButton().click();
		// rpo.clickOnSubscribeButton().clear();
		//rpo.agreePolicyButton().clear();
		//rpo.agreePolicyButton().click();
		rpo.clickOnRegisterContinueButton().click();

	/*  SoftAssert sa = new SoftAssert();
		String firstnameErrorMsg = Constants.FirstNameErroMsg;
		String lastnameErrorMsg = Constants.LastNameErrorMsg;

		sa.assertEquals(rpo.capturedFirstnameErrorMsg().getText(), firstnameErrorMsg);
		sa.assertEquals(rpo.capturedlastnameErrorMsg().getText(), lastnameErrorMsg);
		sa.assertAll();
	*/
		
		CommonMethods.handleAssertions(rpo.capturedFirstnameErrorMsg().getText(), Constants.FirstNameErroMsg);
		CommonMethods.handleAssertions(rpo.capturedlastnameErrorMsg().getText(), Constants.LastNameErrorMsg);
		
	}
	
		

	@Test(dependsOnMethods = "VerifyRegistrationWithBlankData")
	public void VerifyRegistrationWithvalidData() throws IOException, InterruptedException {

		// This driver have scope---> because its coming from base class
		
		randomEmail=generateRandomEmailID();

		RegisterationPageObject rpo = new RegisterationPageObject(driver);
		
		CommonMethods.putExplicitWait(driver, 10, rpo.enterFirstName());
		
		rpo.enterFirstName().clear();
		rpo.enterFirstName().sendKeys(Constants.Firstname);
		//rpo.enterlastName().clear();
		rpo.enterLastName().sendKeys(Constants.Lastname);
		rpo.enterEmailID().sendKeys(randomEmail);	
		//rpo.enterTelephone().clear();
		rpo.enterTelephone().sendKeys(Constants.Telephone);
		//rpo.enterPassword().clear();
		rpo.enterPassword().sendKeys(Constants.Password);
		//rpo.enterPasswordConfrm().clear();
		rpo.enterPasswordConfrm().sendKeys(Constants.ConfirmPassword);
		//rpo.clickOnSubscribeButton().clear();
		rpo.clickOnSubscribeButton().click();
		CommonMethods.putExplicitWait(driver, 2, rpo.agreePolicyButton());
		//rpo.agreePolicyButton().clear();
		rpo.agreePolicyButton().click();
		rpo.clickOnRegisterContinueButton().click();
		
	/*	SoftAssert sa = new SoftAssert();
		String successUrl=Constants.SuccessUrl;
		sa.assertEquals(driver.getCurrentUrl(), successUrl);
		sa.assertAll();
	*/
		
		CommonMethods.handleAssertions(driver.getCurrentUrl(),Constants.SuccessUrl);

	}

}
