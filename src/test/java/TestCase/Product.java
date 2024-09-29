package TestCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.ProductPage;
import Utils.TestBase;

public class Product extends TestBase {
	
	@Test
	public void TestCase1() throws InterruptedException
	{
		
		LoginPage loginPage = new LoginPage(driver);
		ProductPage productPage = new ProductPage(driver);
		loginPage.LoginSauceDemo("standard_user", "secret_sauce");
		Thread.sleep(2000);
		
		String actualText = productPage.getProductText();
		String expectedText = "Product";
		
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test
	public void TestCase2() throws InterruptedException
	{
		
		LoginPage loginPage = new LoginPage(driver);
		ProductPage productPage = new ProductPage(driver);
		loginPage.LoginSauceDemo("standard_user", "secret_sauce");
		
		Thread.sleep(2000);
		
		productPage.Click_Button1();
		productPage.Click_Button2();
		
		String ActualResult = productPage.getShoppingCartCount();
		Thread.sleep(1000);
		String ExpectedResult = "2";
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
	

}
