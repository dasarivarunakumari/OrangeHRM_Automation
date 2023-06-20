package com.OrangeHRM.AutomationTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.OrangeHRM.BaseClass.BaseClass;
import com.OrangeHRM.PageObjects.HomePage;
import com.OrangeHRM.PageObjects.LoginPage;
import com.OrangeHRM.Utilities.Log;

public class VerifyUserLoginTest extends BaseClass{
	@Test
	public void VerfiyValidUserLogin()  {
		Log.startTestCase("VerfiyValidUserLogin");
		Log.info("User going to click and enter the Username field");
		LoginPage Lp = new LoginPage(driver);
		Lp.LoginFn();
		Log.info("User successfully entered username and password");
		HomePage Hp = new HomePage(driver);
		Assert.assertTrue(Hp.IsLogoPresent());	
		Log.endTestCase("VerfiyValidUserLogin");
	}
}
