package Book_myshow_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Book_Myshow_Utility.Base_class;

public class Landing_Page extends Base_class {

	public static WebElement List_Your_Show() {
		
		WebElement element1 =webdriver.findElement(By.xpath(("//a[@href='/list-your-show']")));
		return element1;
		
	  }
	public static WebElement List_Btn() {
	WebElement element1 =webdriver.findElement(By.xpath(("(//button[@class='sc-1y2oebh-1 iRpfzT   'and @type='default'])[1]")));
   return element1;

	
	}
	public static WebElement List_Popup_Btn() {
		WebElement element1 =webdriver.findElement(By.xpath(("//div[contains(@class,'sc-7silkt-1 kTfyez')]//p[contains(@class,'sc-1pz8rb6-1 ebjpiw')][normalize-space()='List your show']")));
	   return element1;
}
}