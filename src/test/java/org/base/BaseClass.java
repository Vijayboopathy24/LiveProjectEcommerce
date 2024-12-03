package org.base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static   JavascriptExecutor js;
	
	public static void openBrowser() {
		driver = new ChromeDriver();
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void minWindow() {
		driver.manage().window().minimize();
	}
	public static void fillText(WebElement ref,String Value) {
		ref.sendKeys(Value);
	}
	public static  void implictWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void scrollDown(WebElement ref) {
	   js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true)", ref);
	}
	
	
	
}
