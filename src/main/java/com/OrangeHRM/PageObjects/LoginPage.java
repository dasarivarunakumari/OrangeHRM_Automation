package com.OrangeHRM.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OrangeHRM.BaseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	    WebDriver driver;
	
	//PageObjectModelWithPageObjectFactory
		@FindBy(xpath = "//input[@name='username']")
		WebElement Username;

		@FindBy(xpath = "//input[@name='password']")
		WebElement Password;

		@FindBy(xpath = "//button[@type='submit']")
		WebElement LoginButton;

		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			//this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public WebElement Uname() {
			return Username;
		}

		public WebElement Pwrd() {
			return Password;
		}

		public WebElement Login() {
			return LoginButton;
		}
		public void LoginFn() {
			Uname().click();
			Uname().sendKeys("Admin");
			Pwrd().click();
			Pwrd().sendKeys("admin123");
			Login().click();
			
		}
}
