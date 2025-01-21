package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Utils.TestBase;

public class ProductPage extends TestBase {

    WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	By product_heading = By.xpath("//span[contains(text(),Products)");
	By add_to_cartbutton1 = By.id("add-to-cart-sauce-labs-backpack");
	By add_to_cartbutton2 = By.id("add-to-cart-sauce-labs-bike-light");
	By Shopping_cart_badge = By.xpath("//span[contains(text(),'Products')]");
	
	public String getProductText()
	{
		return driver.findElement(Shopping_cart_badge).getText();
	}
	
	public void Click_Button1()
	{
		driver.findElement(add_to_cartbutton1).click();
	}
	
	public void Click_Button2()
	{
		driver.findElement(add_to_cartbutton2).click();
	}
	
	public String getShoppingCartCount()
	{
		return driver.findElement(Shopping_cart_badge).getText();
	}
	
}
