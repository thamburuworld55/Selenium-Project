package test;


import org.testng.annotations.Test;


import PgeObject.BiblePage2;

public class BibleTest2 extends BibleTest {
	  @Test
	  public void EnterDetails2() throws InterruptedException {
		  BiblePage2 obb=new BiblePage2(driver);
		  obb.FillDetails2();
		  
	  }
	}
	 
