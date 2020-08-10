package PgeObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class BiblePage {  //Create product
	public WebDriver driver;
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement ob;
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement ob1;
	@FindBy(xpath="//button[@name='login-button']")
	WebElement login;
	
	@FindBy(xpath="//a[@title='Inventory']")
	WebElement ob2;
	@FindBy(xpath="//a[@href='/erp/products']")
	WebElement ob3;
	@FindBy(xpath="//a[text()='Create Product']")
	WebElement ob4;
	
	@FindBy(xpath="//input[@id='product-name']")
	WebElement ob5;
	@FindBy(xpath="//input[@id='product-stock']")
	WebElement ob6;
	@FindBy(xpath="//input[@id='product-code']")
	WebElement ob7;
	
	@FindBy(xpath="//select[@id='product-unit']")
	WebElement ob8;
	
	
	@FindBy(xpath="//select[@id='product-type']")
	WebElement ob9;
	
	
	@FindBy(xpath="//input[@id='product-yom']")
	WebElement ob10;
	@FindBy(xpath="//input[@id='product-tax']")
	WebElement ob11;
	@FindBy(xpath="//input[@id='product-price']")
	WebElement ob12;
	@FindBy(xpath="//button[@type='submit']")
	WebElement ob13;
	
	public void FillDetails() throws InterruptedException
	{
    ob.sendKeys("vinod");
    ob1.sendKeys("1q2w3e4r");
    login.click();
    Thread.sleep(1000);
    ob2.click();
    Thread.sleep(1000);
    ob3.click();
    ob4.click();
    ob5.sendKeys("Radha");
    ob6.sendKeys("20");
    ob7.sendKeys("20");
    Select s=new Select(ob8);
    s.selectByVisibleText("Meter");
    Select s1=new Select(ob9);
    s1.selectByVisibleText("Consumable");
    ob10.sendKeys("200");
    ob11.sendKeys("10000");
    ob12.sendKeys("20000");
    ob13.click();
    Thread.sleep(1000);
    
		
	}
	
	public BiblePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
