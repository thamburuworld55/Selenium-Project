package utilities;

//import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BibleBase {
	public WebDriver driver;
  
	//@Test
  //public void test() {
  //}
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\THAMBURU\\Downloads\\Testing\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://qabible.in/erp/login");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
