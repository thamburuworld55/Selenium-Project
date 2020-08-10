package test;


import org.testng.annotations.Test;


import PgeObject.BiblePage3;

public class BibleTest3 extends BibleTest2 {
	  @Test
	  public void EnterDetails3() throws InterruptedException {
		  BiblePage3 obb=new BiblePage3(driver);
		  obb.FillDetails3();
		  
	  }
	}
	  