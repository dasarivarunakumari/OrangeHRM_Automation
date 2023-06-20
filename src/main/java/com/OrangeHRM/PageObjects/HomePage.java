package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.BaseClass.BaseClass;

public class HomePage extends BaseClass {
	WebDriver driver;
	@FindBy(xpath = "//img[@alt='client brand banner']")
	WebElement PageLogo;	
    @FindBy(xpath="//span[normalize-space()='Dashboard']")
    WebElement Dashboard;
    @FindBy(xpath="//a[normalize-space()='']")
    WebElement Directory;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement Logo() {
		return PageLogo;
	}
	public WebElement DashboardTab() {
		return Dashboard;
	}
	public WebElement DirectoryTab() {
		return Directory;
	}
	public boolean IsLogoPresent() {
		return act.isDisplayed(driver, Logo());
	}	
	}