const {test, expect} =require('@playwright/test');


test ('Home Page', async ({page})=>{

    await page.goto('http://localhost:5173/');

    const pageTitle= await page.title();
    console.log('page title is:', pageTitle);

    await expect(page).toHaveTitle('User Panel');

    const pageURL=page.url();

    console.log('page URL is:', pageURL );

    await expect(page).toHaveURL('http://localhost:5173/');

    await page.close();

})