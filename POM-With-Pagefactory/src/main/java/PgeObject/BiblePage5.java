package PgeObject;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiblePage5 {   //Deduction
	public WebDriver driver;
	//@FindBy(xpath="//input[@id='loginform-username']")
	//WebElement ob;
	//@FindBy(xpath="//input[@id='loginform-password']")
	//WebElement ob1;
	//@FindBy(xpath="//button[@name='login-button']")
	//WebElement login;
	
	@FindBy(xpath="//a[@title='Employees']")
	WebElement ob2;
	@FindBy(xpath="//a[@href='/erp/deductions']")
	WebElement ob3;
	@FindBy(xpath="//a[@href='/erp/deduction/create']")
	WebElement ob4;
	@FindBy(xpath="//span[@id='select2-deduction-worker_id-container']")
	WebElement ob5;
	
	@FindBy(xpath="//ul[@id='select2-deduction-worker_id-results']")
	WebElement ob12;
	
	@FindBy(xpath="//input[@id='deduction-type']")
	WebElement ob6;
	@FindBy(xpath="//input[@id='deduction-amount']")
	WebElement ob7;
	@FindBy(xpath="//i[@class='glyphicon glyphicon-calendar kv-dp-icon']")
	WebElement ob8;
	@FindBy(xpath="//th[@class='prev']")
	WebElement ob9;
	@FindBy(xpath="//td[@data-date='1591747200000']")
	WebElement ob10;
	@FindBy(xpath="//button[@type='submit']")
	WebElement ob11;
	
	public void FillDetails5() throws InterruptedException
	{
    //ob.sendKeys("vinod");
    //ob1.sendKeys("1q2w3e4r");
    //login.click();
    //Thread.sleep(1000);
    
	ob2.click();
    ob3.click();
    ob4.click();
    Thread.sleep(1000);
    ob5.click();
    Thread.sleep(1000);
    ob12.click();
    ob6.sendKeys("selection");
    ob7.sendKeys("20000");
    ob8.click();
    Thread.sleep(1000);
    ob9.click();
    Thread.sleep(1000);
    ob9.click();
    Thread.sleep(1000);
    ob10.click();
    Thread.sleep(1000);
    ob11.click();
    Thread.sleep(1000);
    
    }
	
	public BiblePage5(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
