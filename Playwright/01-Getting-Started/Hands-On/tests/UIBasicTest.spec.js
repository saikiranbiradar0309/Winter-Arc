const {test, expect} = require('@playwright/test');

test('first playwright test', async ({page})=> {

    // Goto the URL 
    await page.goto('https://playwright.dev/');

    // Get the title 
    console.log(await page.title());
    
    
    // To have Title assertion
    await expect(page).toHaveTitle(/Playwright/);
})


test('Google website title test', async ({page})=> {

    // Goto Google URL 
    await page.goto('https://www.google.com');

    console.log(await page.title());

    await expect(page).toHaveTitle(/Google/);
})