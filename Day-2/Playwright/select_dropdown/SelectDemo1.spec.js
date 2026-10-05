import {test, expect} from '@playwright/test';

test('Select Dropdown', async ({page})=>{
    
    await page.goto("https://practice.expandtesting.com/dropdown");


    // Select by value
    //await page.locator("#country").selectOption({value: "BH"});


    // Select by index
    //await page.locator("#country").selectOption({index: 6});


    // Select by label
    await page.locator("#country").selectOption({label: "India"});

    await page.waitForTimeout(2000);
})  