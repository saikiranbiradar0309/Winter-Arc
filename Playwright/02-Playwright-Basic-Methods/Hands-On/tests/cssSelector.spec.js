import{test, expect} from '@playwright/test';

test('Playwright CSS Selector test', async ({page}) =>{
	
		await page.goto('https://www.naukri.com/');
		
		// Using CSS ID Selector
		await page.locator("#login_Layer").click();

        // CSS Tag(Button) Selector
		await page.locator("Login").click();
	
});