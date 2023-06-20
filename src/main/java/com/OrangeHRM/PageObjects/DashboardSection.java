package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.BaseClass.BaseClass;

public class DashboardSection extends BaseClass {
	WebDriver driver;
	@FindBy(xpath = "//a[@class='oxd-main-menu-item active toggle']")
	WebElement Dashboard;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement Dashboardheading;
	@FindBy(xpath = "//p[text()='Quick Launch']")
	WebElement QuickLaunch;
	@FindBy(xpath = "//button[@title='Assign Leave']")
	WebElement AssignLeave;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement LeaveHeading;
	@FindBy(xpath = "//p[text()='Buzz Latest Posts']")
	WebElement BuzzLatestPosts;

	public DashboardSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement DashboardTab() {
		return Dashboard;
	}

	public WebElement DashboardHeading() {
		return Dashboardheading;
	}

	public WebElement QuickLaunchSection() {
		return QuickLaunch;
	}

	public WebElement AssignLeaveOption() {
		return AssignLeave;
	}

	public WebElement LeaveHeadingSection() {
		return LeaveHeading;
	}

	public WebElement BuzzLatestPostsSection() {
		return BuzzLatestPosts;
	}

	public void DashboardFn() {
		// DashboardTab().click();
		DashboardHeading().isDisplayed();
		QuickLaunchSection().isDisplayed();
		// act.scrollByVisibilityOfElement(driver,QuickLaunch);
	}

	public boolean DashboardheadingDisplayed() {
		return act.isDisplayed(driver, DashboardHeading());
	}

	public boolean QuickLaunchSectionDispalyed() {
		return act.isDisplayed(driver, QuickLaunchSection());
	}

	public void AssignLeaveFn() {
		AssignLeaveOption().click();
		LeaveHeadingSection().isDisplayed();
	}

	public boolean LeaveHeadingSectionIsDisplayed() {
		return act.isDisplayed(driver, LeaveHeadingSection());
	}

	public void BuzzLatestPostFn() {
		BuzzLatestPostsSection().isDisplayed();
	}

	public boolean BuzzLatestPostSectionIsDispalyed() {
		return act.isDisplayed(driver, BuzzLatestPostsSection());
	}

}
