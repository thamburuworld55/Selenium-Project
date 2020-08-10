package test;


import java.awt.AWTException;

import org.testng.annotations.Test;
import PgeObject.BiblePage4;

public class BibleTest4 extends BibleTest3 {
	  @Test
	  public void EnterDetails4() throws InterruptedException, AWTException {
		  BiblePage4 obb=new BiblePage4(driver);
		  obb.FillDetails4();
		  
	  }
	}
