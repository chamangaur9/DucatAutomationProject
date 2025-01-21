package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.id("user-name"); 
	By passowrd = By.id("password");
	By loginButton = By.id("login-button");
	By LoginText = By.id("add-to-cart-sauce-labs-backpack");
	
	public void EnterUsername(String Username)
	{
		driver.findElement(username).sendKeys(Username);
	}
	
	public void EnterPassword(String Password)
	{
		driver.findElement(passowrd).sendKeys(Password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void LoginSauceDemo(String Username,String Password ) {
		driver.findElement(username).sendKeys(Username);
		driver.findElement(passowrd).sendKeys(Password);
		driver.findElement(loginButton).click();
	}
	
	public String Logintext()
	{	
		String Title = driver.findElement(LoginText).getText();
		
		return Title;
	}
	
	
}
