package com.runTest;

import org.testng.annotations.Test;

import com.browserSetup.BrowserSetup;
import com.homePage.KeyMethodes;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestExecution extends BrowserSetup {
  @Test
  public void test1() throws Exception {
	  KeyMethodes.drawHorrizontalLine();
	  Thread.sleep(2000);
	  KeyMethodes.drawVerticallLine();
	  Thread.sleep(2000);
	  KeyMethodes.drawRectangle();
	  Thread.sleep(2000);
	  KeyMethodes.eraseHorrizontalLine();
	  Thread.sleep(2000);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  BrowserSetup.setup();
	  BrowserSetup.navigate("http://www.htmlcanvasstudio.com/");
  }

  @AfterTest
  public void afterTest() {
	 BrowserSetup.closeWebdriver(); 
  }

}
