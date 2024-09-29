package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import Utils.TestBase;

public class Login extends TestBase{
	 
	@Test
	public void TestCase1(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("standard_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase2() throws InterruptedException{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("standard_user");
		loginPage.EnterPassword("secret_sauce01");
		loginPage.clickLoginButton();
		
		Thread.sleep(2000);
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase3(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("standard");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase4(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("standard");
		loginPage.EnterPassword("secret");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase5(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("locked_out_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase6(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("problem_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase7(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("performance_glitch_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase8(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("error_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@Test
	public void TestCase9(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUsername("visual_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		
	String ActualTitle = driver.getTitle();
	String ExpectedTitle= "Swag Labs";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
}

