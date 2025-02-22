import {test, expect} from '@playwright/test'

test('Locators', async({page})=>{

    await page.goto("http://localhost:5173/");

    await page.click('id=expolre');

    await page.fill('id=email', 'mani@gmail.com');

    await page.fill('id=password','123456');

    await page.click('id=login');

    const logoutlink=await page.locator('id=logout')

    await expect(logoutlink).toBeVisible();

    await page.click('id=logout');

    await page.close();

})