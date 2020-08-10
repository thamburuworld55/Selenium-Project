package PgeObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BiblePage3 {  //Create supplier
	public WebDriver driver;
	//@FindBy(xpath="//input[@id='loginform-username']")
	//WebElement ob;
	//@FindBy(xpath="//input[@id='loginform-password']")
	//WebElement ob1;
	//@FindBy(xpath="//button[@name='login-button']")
	//WebElement login;
	
	@FindBy(xpath="//a[@title='Inventory']")
	WebElement ob2;
	@FindBy(xpath="//a[@href='/erp/suppliers']")
	WebElement ob3;
	@FindBy(xpath="//a[text()='Create Supplier']")
	WebElement ob4;
	@FindBy(xpath="//input[@id='supplier-name']")
	WebElement ob5;
	@FindBy(xpath="//input[@id='supplier-address1']")
	WebElement ob6;
	@FindBy(xpath="//input[@id='supplier-address2']")
	WebElement ob7;
	@FindBy(xpath="//input[@id='supplier-phone']")
	WebElement ob8;
	@FindBy(xpath="//input[@id='supplier-mobile']")
	WebElement ob9;
	@FindBy(xpath="//input[@id='supplier-email']")
	WebElement ob10;
	@FindBy(xpath="//input[@id='supplier-gstno']")
	WebElement ob11;
	@FindBy(xpath="//input[@id='supplier-city']")
	WebElement ob12;
	@FindBy(xpath="//input[@id='supplier-state']")
	WebElement ob13;
	@FindBy(xpath="//input[@id='supplier-zip']")
	WebElement ob14;
	@FindBy(xpath="//input[@id='supplier-account_name']")
	WebElement ob15;
	@FindBy(xpath="//input[@id='supplier-ac_no']")
	WebElement ob21;
	@FindBy(xpath="//input[@id='supplier-re_ac_no']")
	WebElement ob22;
	@FindBy(xpath="//input[@id='supplier-ifsc']")
	WebElement ob16;
	@FindBy(xpath="//input[@id='supplier-bank_name']")
	WebElement ob17;
	@FindBy(xpath="//input[@id='supplier-bank_branch']")
	WebElement ob18;
	@FindBy(xpath="//input[@id='supplier-status']")
	WebElement ob19;
	@FindBy(xpath="//button[@type='submit']")
	WebElement ob20;
	
	
	
	public void FillDetails3() throws InterruptedException
	{
    //ob.sendKeys("vinod");
    //ob1.sendKeys("1q2w3e4r");
    //login.click();
    //Thread.sleep(1000);
    ob2.click();
    ob3.click();
    ob4.click();
    ob5.sendKeys("redmi");
    ob6.sendKeys("Radha nilayam");
    ob7.sendKeys("trivandrum");
    ob8.sendKeys("9442258369");
    ob9.sendKeys("9442258369");
    ob10.sendKeys("radhamenon@gmail.com");
    ob11.sendKeys("32AABCT3518Q1ZV");
    ob12.sendKeys("trivandrum");
    ob13.sendKeys("kerala");
    ob14.sendKeys("695583");
    ob15.sendKeys("Radha11");
    ob21.sendKeys("325897458");
    ob22.sendKeys("325897458");
    ob16.sendKeys("SBIN0070262");
    ob17.sendKeys("State bank of india");
    ob18.sendKeys("trivandrum");
    ob19.click();
    ob20.click();
    Thread.sleep(5000);
    
	}
	
	public BiblePage3(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
