package PgeObject;


import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BiblePage4 {  //job and attendencies
	
	public WebDriver driver;
	//@FindBy(xpath="//input[@id='loginform-username']")
    //WebElement ob;
	//@FindBy(xpath="//input[@id='loginform-password']")
	//WebElement ob1;
	//@FindBy(xpath="//button[@name='login-button']")
	//WebElement login;
	
	@FindBy(xpath="//i[@class='fa fa-calendar']")
	WebElement ob2;
	@FindBy(xpath="//a[@href='/erp/attendances']")
	WebElement ob3;
	@FindBy(xpath="//input[@id='attendanceform-date']")
	WebElement ob4;
	@FindBy(xpath="//i[@class='glyphicon glyphicon-calendar kv-dp-icon']")
	WebElement ob5;
	@FindBy(xpath="//th[@class='prev']")
	WebElement ob6;
	@FindBy(xpath="//td[@data-date='1591747200000']")
	WebElement ob7;
	@FindBy(xpath="//button[@type='submit']")
	WebElement ob8;
	@FindBy(xpath="//i[@class='fa fa-calendar']")
	WebElement ob9;
	@FindBy(xpath="//a[@href='/erp/jobs']")
	WebElement ob10;
	@FindBy(xpath="//a[@href='/erp/job/create']")
	WebElement ob11;
	@FindBy(xpath="//input[@name='Job[title]']")
	WebElement ob12;
	@FindBy(xpath="//span[@id='select2-job-client_id-container']")
	WebElement ob13;
	@FindBy(xpath="//input[@type='search']")
	WebElement ob18;
	//@FindBy(xpath="//ul[@id='select2-job-client_id-results']") // can do using robert by typeand enter& doneby inspect optionelement
	//WebElement ob18;
	@FindBy(xpath="//select[@id='job-type']")
	WebElement ob15;
	@FindBy(xpath="//input[@id='job-po']")
	WebElement ob14;
	
	@FindBy(xpath="//textarea[@id='job-description']")
	WebElement ob16;
	//@FindBy(xpath="//button[@type='submit']")
	//WebElement ob17;
	
	
	public void FillDetails4() throws InterruptedException, AWTException
	{
    //ob.sendKeys("vinod");
   // ob1.sendKeys("1q2w3e4r");
    //login.click();
    //Thread.sleep(1000);
    ob2.click();
    ob3.click();
    ob4.click();
    Thread.sleep(1000);
    ob5.click();
    Thread.sleep(1000);
    ob6.click();
    Thread.sleep(1000);
    ob6.click();
    Thread.sleep(1000);
    ob7.click();
    Thread.sleep(1000);
    ob8.click();
    Thread.sleep(1000);
    driver.navigate().back();
    driver.navigate().back();
    ob9.click();
    Thread.sleep(1000);
    ob10.click();
    Thread.sleep(1000);
    ob11.click();
    Thread.sleep(3000);
    ob12.sendKeys("Service Assistant");
    ob13.click();
    Thread.sleep(3000);
    //ob18.click();
    ob18.sendKeys("Client1");
    Thread.sleep(3000);
    Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  Select s2=new Select(ob15);
	 s2.selectByVisibleText("Normal");
    ob14.sendKeys("engineer");
    
    ob16.sendKeys("new employer");
    //ob17.click();
    Thread.sleep(1000);
	}
	
	public BiblePage4(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
