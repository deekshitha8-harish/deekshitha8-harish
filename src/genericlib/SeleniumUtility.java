package genericlib;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility 
{
	public Actions act = null;
	public Select s = null;
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void implicitlyWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public void movingTowordsAnElement(WebDriver driver,WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element)
	{
		act = new Actions(driver);
		act.contextClick(element).perform();
	}
	public void clickOnElement(WebDriver driver,WebElement element)
	{
		act = new Actions(driver);
		act.click(element).perform();
	}
	public void scrollToAParticularElement(WebDriver driver,WebElement element)
	{
		act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	public void dragsrcToDest(WebDriver driver, WebElement src,WebElement dest )
	{
		act = new Actions(driver);
		act.dragAndDrop(src,dest).perform();
	}
	public void dragPointer(WebDriver driver , WebElement src,int x,int y)
	{
		act = new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
	}
	public void clickAndHoldAnElement(WebDriver driver, WebElement element)
	{
		act = new Actions(driver);
		act.clickAndHold(element).perform();
	}
	public void releaseAnElement(WebDriver driver, WebElement element)
	{
		act = new Actions(driver);
		act.release(element).perform();
	}
	public void selectAnElementBasedOnIndex(WebElement element,int indexNo)
	{
		s = new Select(element);
		s.selectByIndex(indexNo);
	}
	public void selectAnElementBasedOnValueAttribute(WebElement element, String value)
	{
		s = new Select(element);
		s.selectByValue(value);
	}
	public void selectAnElementBasedOnselectAnElementBasedVisibleText(WebElement element,String text)
	{
		s = new Select(element);
		s.selectByVisibleText(text);
	}
	public List<WebElement> getAllOptionsFromDropDown(WebElement element)
	{
		s = new Select(element);
		List<WebElement>options = s.getOptions();
		return options;
	}
	public List<WebElement> getAllselectedOptionsFromDropDown(WebElement element)
	{
		s = new Select(element);
		List<WebElement>options = s.getAllSelectedOptions();
		return options;
	}
	public void deselectAnElementBasedOnIndex(WebElement element , int indexNo)
	{
		s = new Select(element);
		s.deselectByIndex(indexNo);
	}
	public void deselectAnElementBasedOnValueAttribute(WebElement element,String value)
	{
		s = new Select(element);
		s.deselectByValue(value);
	}
	public void deselectAnElementBasedOnVisibleText(WebElement element,String text)
	{
		s = new Select(element);
		s.deselectByVisibleText(text);
	}
	public void deselectAlloptions(WebElement element)
	{
		s = new Select(element);
		s.deselectAll();
	}
	public void toAcceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public void toDismissAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public void toPassAlertMsg(WebDriver driver,String msg)
	{
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(msg);
	}
	public String toFetchAlertMsg(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		return alertMsg;
	}
	public void operationWithJs(WebDriver driver,String value)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(value);
	}
	public void captureScreenShot(WebDriver driver,String path) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		Files.copy(src, dest);
	}
	public void ifElementClickFails(WebDriver driver, WebElement element, int time) throws InterruptedException
	{
		int count = 0;
		int reclickCount = 5;
		while (count<=reclickCount)
		{
			element.click();
			Thread.sleep(time);
			break;
		}
	}
		public void windowPopUpHandle(WebDriver driver)
		{
			String parentWindow = driver.getWindowHandle();
			Set<String>allWindow = driver.getWindowHandles();
			
			Iterator<String> itr = allWindow.iterator();
			while(itr.hasNext())
			{
				String values = itr.next();
				String title = driver.switchTo().window(values).getTitle();
				
				if(title.contains(values))
					break;
					
			}
		
	}
	

}
