package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.contactPage;

public class ContactPageTest {
	
	
	@Test(priority = 2)
	public void validateCreateContactFunctionality()
	{
		contactPage contactPages = new contactPage();
		
		contactPages.clickContactsLink();
		contactPages.createButtonLink();
		contactPages.enterfirstName("Niranjan");
		contactPages.enterlastName("Shinde");
		contactPages.clickSaveLink();
	}

}
