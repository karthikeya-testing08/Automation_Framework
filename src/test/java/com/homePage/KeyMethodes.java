package com.homePage;

import org.openqa.selenium.interactions.Actions;
import com.browserSetup.BrowserSetup;
import com.locaters.Locaters;

public class KeyMethodes extends BrowserSetup {
	static Actions a =new Actions(driver);
	public static void drawHorrizontalLine() throws Exception 
	{
		Locaters.lineButton().click();
		Thread.sleep(2000);
		a.moveToElement(Locaters.lineButtonClicked(), 50, 175).clickAndHold().moveByOffset(250,0).release().click().perform();
	}
	public static void drawVerticallLine() 
	{
		a.moveToElement(Locaters.lineButtonClicked(), 175,60).clickAndHold().moveByOffset(0,240).release().click().perform();
	}
	public static void drawRectangle() throws Exception 
	{
		Locaters.rectangleButton().click();
		Thread.sleep(2000);
		a.moveToElement(Locaters.rectangleButtonClicked(), 0, 320).clickAndHold().moveByOffset(250,100).release().click().perform();
	}
	public static void eraseHorrizontalLine() throws Exception 
	{
		Locaters.eraserButton().click();
		Thread.sleep(2000);
		a.moveToElement(Locaters.eraserButtonClicked(), -100, 175).clickAndHold().moveByOffset(255,0).release().click().perform();
	}
	
}