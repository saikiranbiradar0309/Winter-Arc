package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class LoginPage extends BaseTest {
		

	// Locate Object Repository using Page object design pattern with page factory
	
	@FindBy(id="email")
	WebElement username;
	
	
	@FindBy(id ="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	
	// initialize object reposiotry
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Associated method without entering test data 
	public void enterUsername(String uname)
	{
		this.username.sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		this.password.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		this.loginButton.click();
	}
}
