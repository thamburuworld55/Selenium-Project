package test;


import org.testng.annotations.Test;


import PgeObject.BiblePage5;

public class BibleTest5 extends BibleTest4 {
	  @Test
	  public void EnterDetails5() throws InterruptedException {
		  BiblePage5 obb=new BiblePage5(driver);
		  obb.FillDetails5();
		  
	  }
	} 