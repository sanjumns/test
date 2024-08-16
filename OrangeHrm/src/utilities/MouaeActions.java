package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouaeActions 
{
	public static void RightClick(WebDriver driver, WebElement element)
	{
		Actions click= UtilityObjects.mouseActions(driver);
		click.contextClick(element).perform();
	}
	
	public static void DoubleClick(WebDriver driver, WebElement element)
	{
		 Actions click = UtilityObjects.mouseActions(driver);
		click.doubleClick(element).perform();
	}
	
	public static void MouseHover(WebDriver driver, WebElement element)
	{
		Actions click = UtilityObjects.mouseActions(driver);
		click.moveToElement(element).perform();
	}
	
	public static void DragandDrop(WebDriver driver, WebElement src, WebElement dst)
	{
		Actions click = UtilityObjects.mouseActions(driver);
		click.dragAndDrop(src, dst).perform();
	}
	
	public static void Hol(WebDriver driver, WebElement element)
	{
		Actions click = UtilityObjects.mouseActions(driver);
		click.clickAndHold(element).perform();
	}
	
	

}
