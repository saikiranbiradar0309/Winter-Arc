package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginPageTest {
	
	@BeforeMethod
	@BeforeTest
	public void setUp()
	{
		BaseTest.initialization();
	}
	
	
	@Test
	public void validateLoginFunctionality()
	{
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.enterUsername("biradarsaikiran4@gmail.com");
		loginPage.enterPassword("8050@#Sai");
		loginPage.clickOnLogin();
	}
	
	/*
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		BaseTest.driver.quit();
	}
	*/
}
