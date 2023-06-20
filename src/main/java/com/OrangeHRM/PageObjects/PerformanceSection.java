package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OrangeHRM.BaseClass.BaseClass;


public class PerformanceSection extends BaseClass {
	WebDriver driver;
	public String expectedText;
    public String displayedText;
    
	@FindBy(xpath = "//span[text()='Performance']")
	WebElement Performance;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement EmployeeName;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Search;
	@FindBy(xpath = "//div[@clear='false']")
	WebElement ReviewStatus;
	@FindBy(xpath = "//a[text()='My Trackers']")
	WebElement MyTacker;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	WebElement MyPerformancedetails;
	@FindBy(xpath = "//button[@name='view']")
	WebElement View;
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-employee-tracker-list-header']")
	WebElement TrackerLogsdetails;
	@FindBy(xpath = "//button[normalize-space()='Add Log']")
	WebElement AddLog;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-title']")
	WebElement AddTrackerLog;
	@FindBy(xpath = "//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']")
	WebElement x;

	public PerformanceSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement PerformanceTab() {
		return Performance;
	}

	public WebElement EmployeeNameTab() {
		return EmployeeName;
	}

	public WebElement SearchTab() {
		return Search;
	}

	public WebElement ReviewStatusTab() {
		return ReviewStatus;
	}

	public WebElement MyTackerTab() {
		return MyTacker;
	}

	public WebElement MyPerfromanceSection() {
		return MyPerformancedetails;
	}

	public WebElement ViewButton() {
		return View;
	}

	public WebElement TrackerLogsSection() {
		return TrackerLogsdetails;
	}

	public WebElement AddLogButton() {
		return AddLog;
	}

	public WebElement AddTrackerLogPopup() {
		return AddLog;
	}

	public WebElement Closex() {
		return x;
	}

	public void PerformanceFn() {
		PerformanceTab().click();
	}

	public boolean PerformancePresent() {
		return act.isDisplayed(driver, PerformanceTab());
	}

	public void EmployeeNameFn() throws InterruptedException {
		EmployeeNameTab().click();		
		act.type(EmployeeName, "Varuna");
		String expectedText = "Varuna";
		System.out.println("expectedText" +expectedText);
        String displayedText = EmployeeNameTab().getAttribute("value");
        System.out.println("Displayed code is" +displayedText);        
		Thread.sleep(2000);	
		SearchTab().click(); 
	}
	public void setExpectedText(String expectedText) {
        this.expectedText = expectedText;
    }
    public void setDisplayedText(String displayedText) {
        this.displayedText = displayedText;
    }
	public boolean EmployeeNamePresent() {
		return act.isDisplayed(driver, EmployeeNameTab());
	}

	public void SearchFn() {
		SearchTab().click();
	}

	public void ReviewStatusFn() throws InterruptedException {
		ReviewStatusTab().click();
		Thread.sleep(3000);
		// act.selectByVisibleText("Completed",ReviewStatus);
		act.selectByIndex(ReviewStatusTab(),1);
	}

	public boolean ReviewStatusdropdown() {
		return act.isDisplayed(driver, ReviewStatusTab());
	}

	public void MyTrackerFn() {
		MyTackerTab().click();
		MyPerfromanceSection().isDisplayed();
	}

	public boolean MyPerformaceSectionPresent() {
		return act.isDisplayed(driver, MyPerfromanceSection());
	}

	public void MyTrackerViewButtonFn() {
		ViewButton().click();
		// act.explicitWait(driver, View, 10);
		TrackerLogsSection().isDisplayed();
	}

	public boolean TrackerLogsSectionPresent() {
		return act.isDisplayed(driver, TrackerLogsSection());
	}

	public void AddLogFn() {
		AddLogButton().click();
		AddTrackerLogPopup().isDisplayed();
		Closex().click();
	}

	public boolean AddLogButtonPresent() {
		return act.isDisplayed(driver, AddTrackerLogPopup());
	}
}
