package utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void SelectOptions(WebElement element, Object data)
	{
		Select select = UtilityObjects.DropDown(element);
		if(data instanceof Integer)
		{
			select.selectByIndex((int)data);
		}
		else if(data instanceof String)
		{
			try 
			{
				select.selectByValue((String)data);
				
			} catch (Exception e) 
			{
				select.selectByVisibleText((String)data);
			}
		}
		
	}
	
	public static void DeselectOptions(WebElement element, Object data)
	{
		Select deselect = UtilityObjects.DropDown(element);
		if(data instanceof Integer)
		{
			deselect.deselectByIndex((int)data);
		}
		else if(data instanceof String)
		{
			try 
			{
				deselect.deselectByValue((String)data);
				
			} catch (Exception e) 
			{
				deselect.deselectByVisibleText((String)data);
			}
		}
		
	}
	
	public static void DeselectAll(WebElement element)
	{
		Select desAll = UtilityObjects.DropDown(element);
		desAll.deselectAll();		
	}
	
	public static List<WebElement> getAllOptions(WebElement element)
	{
		Select getAll = UtilityObjects.DropDown(element);
		List<WebElement> options = getAll.getOptions();
		return options;
	}
}
