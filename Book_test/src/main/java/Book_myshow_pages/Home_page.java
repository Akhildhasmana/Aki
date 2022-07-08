package Book_myshow_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Book_Myshow_Utility.Base_class;


public class Home_page extends Base_class  {
	public static boolean invisiblePop = false;
	
	public static WebElement City_selection() {
		WebDriverWait wait= new WebDriverWait(webdriver, Duration.ofMillis(4000));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='sc-crNyjn dqNCYo']")));
		WebElement element1 =webdriver.findElement(By.xpath(("//img[@class='sc-crNyjn dqNCYo']")));
		return element1;
		
	  }
	public static WebElement Sign_in() {
		WebDriverWait wait= new WebDriverWait(webdriver, Duration.ofMillis(4000));
		
		
		WebElement element1 =webdriver.findElement(By.xpath(("//div[text()='Sign in']")));
		return element1;
	} 	
	
   public static WebElement Entermob() {
		
		WebElement element1 =webdriver.findElement(By.xpath(("//input[@id='mobileNo']")));
		return element1;
	   
   }
   
   public static WebElement Continue_button() {
		
		WebElement element1 =webdriver.findElement(By.xpath("//button[text()='Continue']"));
		return element1;
	   
  }
 public static WebElement Otp_popup() {
	 
	 WebElement element1 =webdriver.findElement(By.xpath("//div[@class='sc-jwKygS kSBlmq']"));
	invisiblePop =new WebDriverWait(webdriver, Duration.ofSeconds(80)).until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOf(element1));
		
	 return element1;
 }
}



