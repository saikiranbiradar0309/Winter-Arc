import {test, expect} from '@playwright/test'

test('Swag Labs Login Functionality using CSS Selectors', async ({page}) =>  {
	
		// Goto the Swag Labs URL 
		await page.goto('https://www.saucedemo.com/');


		// Enter Username
		await page.locator("[id='user-name']").fill("standard_user");

		// Enter Password
		await page.locator("[id='password']").fill("secret_sauce");

		// Click on Login
		await page.locator("[id='login-button']").click();
});