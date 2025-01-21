package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import Utils.TestBase;

public class Login extends TestBase{
	 
	@DataProvider(name="LoginData")
	public String[][] GetData() 
	{
		String loginData[][] = {
				{"standard_user","secret_sauce"},
					{"locked_out_user","secret_sauce"},
					{"problem_user","secret_sauce"},
					{"performance_glitch_user","secret_sauce"},
					{"error_user","secret_sauce"},
					{"visual_user","secret_sauce"},
					{"chaman_user","secret_sauce"},
					{"Test_user","secret_sauce"}		
		};
		
		return loginData;
	}
	@Test(dataProvider="LoginData")
	public void TestCase1(String Username, String Password){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); 
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername(Username);
		loginPage.EnterPassword(Password);
		loginPage.clickLoginButton();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-backpack")));
		
		
	String ActualTitle = loginPage.Logintext();
	String ExpectedTitle= "Add to cart";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
}

