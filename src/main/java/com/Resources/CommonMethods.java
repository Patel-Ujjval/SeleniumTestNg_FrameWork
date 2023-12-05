package com.Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void handleAssertions(String actualUrl, String expectedUrl) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualUrl, expectedUrl);
		sa.assertAll();
	}

	public static void putExplicitWait(WebDriver driver, int sec, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
}
