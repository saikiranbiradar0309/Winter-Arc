package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class contactPage extends BaseTest{
	
	@FindBy(xpath = "//a//span[contains(text(),'Contacts')]")
	WebElement clickContacts;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	private WebElement createButton;
	
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastName;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickSave;
	
	
	
	
	public contactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickContactsLink()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clickContacts)).click();
		//this.clickContacts.click();
	}
	
	public void createButtonLink()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(createButton)).click();
		//this.createButton.click();
	}
	
	public void enterfirstName(String fname)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys(fname);
		//this.firstName.sendKeys(fname);
	}
	
	public void enterlastName(String lname)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(lastName)).click();
		lastName.sendKeys(lname);
		//this.lastName.sendKeys(lname);
	}
	
	public void clickSaveLink()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clickSave)).click();
		//this.clickSave.click();
	}
}
