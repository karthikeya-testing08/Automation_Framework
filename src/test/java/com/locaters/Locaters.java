package com.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.browserSetup.BrowserSetup;

public class Locaters extends BrowserSetup {
	
		public static WebElement element;
		public static WebElement lineButton()
		{
			element=driver.findElement(By.xpath("//div[@id='editor']//input[@class='button line']"));
			return element;
		}
		public static WebElement lineButtonClicked()
		{
			element=driver.findElement(By.xpath("//div[@id='editor']//input[@class='button line clicked']"));
			return element;
		}
		public static WebElement rectangleButton()
		{
			element=driver.findElement(By.xpath("//div[@id='editor']//input[@class='button rectangle']"));
			return element;
		}
		public static WebElement rectangleButtonClicked()
		{
			element=driver.findElement(By.xpath("//div[@id='editor']//input[@class='button rectangle clicked']"));
			return element;
		}
		public static WebElement eraserButton()
		{
			element=driver.findElement(By.xpath("//div[@id='editor']//input[@class='button eraser']"));
			return element;
		}
		public static WebElement eraserButtonClicked()
		{
			element=driver.findElement(By.xpath("//div[@id='editor']//input[@class='button eraser clicked']"));
			return element;
		}
}
