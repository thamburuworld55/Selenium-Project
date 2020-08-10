package PgeObject;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiblePage2 {  //profile
	
	public WebDriver driver;
	//@FindBy(xpath="//input[@id='loginform-username']")
	//WebElement ob;
	//@FindBy(xpath="//input[@id='loginform-password']")
	//WebElement ob1;
	//@FindBy(xpath="//button[@name='login-button']")
	//WebElement login;
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement ob2;
	@FindBy(xpath="//a[@href='/erp/user/profile']")
	WebElement ob5;
	@FindBy(xpath="//input[@id='profileform-phone']")
	WebElement ob3;
	@FindBy(xpath="//input[@type='checkbox']")
	List<WebElement>ob4;
	
	public void FillDetails2() throws InterruptedException
	{
    //ob.sendKeys("vinod");
    //ob1.sendKeys("1q2w3e4r");
    //login.click();
    //Thread.sleep(1000);
    ob2.click();
    ob5.click();
    ob3.clear();
    ob3.sendKeys("9947074521");
    
    ob4.get(6).click();
    Thread.sleep(1000);
	}
	
	public BiblePage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
