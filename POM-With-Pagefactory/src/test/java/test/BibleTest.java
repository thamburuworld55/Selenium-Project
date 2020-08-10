package test;


import org.testng.annotations.Test;

import PgeObject.BiblePage;
import utilities.BibleBase;



public class BibleTest extends BibleBase {
  @Test
  public void EnterDetails() throws InterruptedException {
	  BiblePage obb=new BiblePage(driver);
	  obb.FillDetails();
	  
  }
}
 