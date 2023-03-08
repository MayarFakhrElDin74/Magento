package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	
	protected static WebDriver driver ;
	
	public Select select ;
	public Actions action ;
	public JavascriptExecutor jse ;
	
	
	public PageBase (WebDriver  driver) 
	
	{
	   PageBase.driver = driver ;
	}
	
	
	protected static void clickBtn (WebElement Btn) 
	{
		Btn.click();
	}

	protected static void setTextElementText (WebElement txtBoxElement , String value)
	{
		txtBoxElement.sendKeys(value);
	}
	
	
	public void scrollToBottom ()
	{
		jse.executeScript("window.scroll (0,1000)") ;
	}
			
		
	}
	

