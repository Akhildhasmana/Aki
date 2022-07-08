package All_Generic_Methods;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Book_Myshow_Utility.Base_class;

public class ClickElement extends Base_class  {
	public static  WebElement btnClick(WebElement e)  {
	    WebDriverWait wait1=new WebDriverWait(webdriver,Duration.ofSeconds(10));
	    wait1.until(ExpectedConditions.elementToBeClickable(e)).click();
		return e;
	    
		
	   
}
	public static  void impicitwait() {
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
}

