package com.OrangeHRM.AutomationTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.OrangeHRM.BaseClass.BaseClass;
import com.OrangeHRM.PageObjects.LoginPage;
import com.OrangeHRM.PageObjects.PerformanceSection;
import com.OrangeHRM.Utilities.Log;

public class VerifyPerformanceTabTest extends BaseClass {
	
	  @Test(priority=1) public void VerifytoClickonPerformanceTab() {
	  Log.startTestCase("VerifytoClickonPerformanceTab");
	  Log.info("User going to click on Performance Tab"); LoginPage Lp = new
	  LoginPage(driver); Lp.LoginFn(); PerformanceSection PS = new
	  PerformanceSection(driver); PS.PerformanceFn(); Log.info("User Cliked");
	  Assert.assertTrue(PS.PerformancePresent());
	  Log.endTestCase("VerifytoClickonPerformanceTab"); }
	 
	  
	 
	
	
	  @Test(priority=2) 
	  public void VerifytoClickonEmployeeNameTab() throws InterruptedException  { 
	  Log.startTestCase("VerifytoClickonEmployeeNameTab"); 
	  Log.info("User going to click on EmployeeNameTab"); 
	  LoginPage Lp = new 
	  LoginPage(driver);
	  Lp.LoginFn(); 
	  PerformanceSection PS = new PerformanceSection(driver); 
	  PS.PerformanceFn(); 
	  PS.EmployeeNameFn(); 
	  Log.info("User Clicked on EmployeeTab, entered the Text-Varun and searched");
	  Assert.assertTrue(PS.EmployeeNamePresent()); 
	 SoftAssert softAssert =new SoftAssert();  
	 softAssert.assertEquals(PS.displayedText,
	  PS.expectedText, "Text verification failed"); 
	 softAssert.assertAll(); 
	  Log.endTestCase("VerifytoClickonEmployeeNameTab");
	  }
	
	
	
	  @Test(priority=3) 
	  public void VerifyReviewStatusTab() throws InterruptedException { 
		  Log.startTestCase("VerifyReviewStatusTab");
	  Log.info("User going to click on ReviewStatusTabsection"); 
	  LoginPage Lp = new
	  LoginPage(driver); 
	  Lp.LoginFn(); 
	  PerformanceSection PS = new
	  PerformanceSection(driver); 
	  PS.PerformanceFn(); 
	  PS.ReviewStatusFn();
	  Log.info("User click on ReviewStatus and slected an option from dropdrown");
	  Assert.assertTrue(PS.ReviewStatusdropdown());
	  Log.endTestCase("VerifyReviewStatusTab"); }
	 
	 
	 		
		
		
	
	  @Test(priority=4) public void VerifyMyTrackerTab() throws InterruptedException {
	  Log.startTestCase("VerifyMyTrackerTab");
	  Log.info("User going to click on MyTracker section"); LoginPage Lp = new
	  LoginPage(driver); Lp.LoginFn(); PerformanceSection PS = new
	  PerformanceSection(driver); PS.PerformanceFn(); PS.MyTrackerFn();
	  Log.info("User clicked on My Tracker" );
	  Assert.assertTrue(PS.MyPerformaceSectionPresent());
	  Log.endTestCase("VerifyMyTrackerTab"); }
	 
	 		 	
	
	  @Test(priority=5) public void VerifyClickingViewButton() {
	  Log.startTestCase("VerifyClickingViewButton");
	  Log.info("User going to click on ViewButton section"); LoginPage Lp = new
	  LoginPage(driver); Lp.LoginFn(); PerformanceSection PS = new
	  PerformanceSection(driver); PS.PerformanceFn(); PS.MyTrackerFn();
	  PS.MyTrackerViewButtonFn();
	  Log.info("User Clicked on ViewButton and navigated to TrackerLogsSection" );
	  Assert.assertTrue(PS.TrackerLogsSectionPresent());
	  Log.endTestCase("VerifyClickingViewButton");
	  
	  }
	 
	
	  @Test(priority=6) public void VerifyClickingAddLogButton() throws
	  InterruptedException { Log.startTestCase("VerifyClickingAddLogButton");
	  Log.info("User going to click on AddLogButton section"); LoginPage Lp = new
	  LoginPage(driver); Lp.LoginFn(); PerformanceSection PS = new
	  PerformanceSection(driver); PS.PerformanceFn(); PS.MyTrackerFn();
	  PS.MyTrackerViewButtonFn(); PS.AddLogFn();
	  Log.info("User Clicked on AddLogButton and AddTrackerLog popup is shown" );
	  Assert.assertTrue(PS.AddLogButtonPresent());
	  Log.endTestCase("VerifyClickingAddLogButton");
	  
	  }
	 		
}