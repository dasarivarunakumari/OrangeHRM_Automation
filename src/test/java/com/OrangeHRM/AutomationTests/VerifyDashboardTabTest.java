package com.OrangeHRM.AutomationTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.BaseClass.BaseClass;
import com.OrangeHRM.PageObjects.DashboardSection;
import com.OrangeHRM.PageObjects.LoginPage;
import com.OrangeHRM.Utilities.Log;

public class VerifyDashboardTabTest extends BaseClass {
	
	
	  @Test(priority=0)
	  public void VerifytoDashboardSectionIsDispalyed() throws InterruptedException {
	  Log.startTestCase(" VerifytoDashboardSectionIsDispalyed");
	  Log.info("User is in dashboard section"); 
	  LoginPage Lp = new LoginPage(driver); 
	  Lp.LoginFn(); 
	  DashboardSection DS = new DashboardSection(driver); 
	  DS.DashboardFn();
	  Log.info("dashboard header is displayed");
	  Assert.assertTrue(DS.DashboardheadingDisplayed());
	  Log.info("QuickLaunchSection is displayed");
	  Assert.assertTrue(DS.QuickLaunchSectionDispalyed());
	  Log.endTestCase(" VerifytoDashboardSectionIsDispalyed"); 
	  }
		
	  @Test(priority=1) 
	  public void VerifyAssignLeaveOptionIsClickable() throws InterruptedException {
	  Log.startTestCase("VerifyAssignLeaveOptionIsClickable");
	  Log.info("User is going to click on AssignLeaveOption "); 
	  LoginPage Lp = new
	  LoginPage(driver);
	  Lp.LoginFn(); 
	  DashboardSection DS = new DashboardSection(driver); 
	  DS.DashboardFn(); 
	  DS.AssignLeaveFn();
	  Log.info("User is able to navigate to Leave section");
	  Assert.assertTrue(DS.LeaveHeadingSectionIsDisplayed());
	  Log.endTestCase("VerifyAssignLeaveOptionIsClickable"); 
	  }
	  
	  @Test(priority=2) 
	  public void VerifyIfBuzzLatestPostsDisplayed() {
	  Log.startTestCase("VerifyIfBuzzLatestPostsDisplayed");
	  Log.info("User is in dashboard section "); 
	  LoginPage Lp = new
	  LoginPage(driver);
	  Lp.LoginFn(); 
	  DashboardSection DS = new DashboardSection(driver); 
	  DS.DashboardFn(); 
	  DS.BuzzLatestPostFn();
	  Log.info("User is able to see the BuzzLatestPostSection");
	  Assert.assertTrue(DS.BuzzLatestPostSectionIsDispalyed());
	  Log.endTestCase("VerifyIfBuzzLatestPostsDisplayed"); 	 
	  }
}
 
	
	
