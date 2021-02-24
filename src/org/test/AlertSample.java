package org.test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertSample {
	
	public static void main(String[] args) throws AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hai Guys\\eclipse-workspace\\Farith\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		// Simple Alert
//		
//		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		
//		Alert a2 = driver.switchTo().alert();
//		
//
//		a2.accept();
//		
		
		// Confirm Alert
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'display a confirm box')]")).click();
		
		Alert a1 = driver.switchTo().alert();
		String s1 = a1.getText();
		System.out.println(s1);
		a1.dismiss();
		
		// Prompt Alert
		
//		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
//		
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
//		
//		Alert a = driver.switchTo().alert();
//		
//		
//		
//		a.sendKeys("Roshin");
//		a.accept();
//		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement txtUser = driver.findElement(By.name("email"));
//		js.executeScript("arguments[0].setAttribute('value','Salman')", txtScript);
//		
//		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtScript);
//		System.out.println(executeScript);
//		
//		
//		WebElement element = driver.findElement(By.name("login"));
//		Object loginbutton = js.executeScript("arguments[0].setAttribute('style','background:yellow;font-size:40px')", element);
//		
//		System.out.println(element.getCssValue("line-height"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement txtUser = driver.findElement(By.name("email"));
//		
//		WebElement click1 = driver.findElement(By.name("login"));
//		
//		WebElement click2 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
//		Object btnClick = js.executeScript("alert(confirm('Hello im Salman'))");
//		Thread.sleep(3000);
//		Alert s = driver.switchTo().alert();
//		s.accept();
//		s.accept();
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Robot r = new Robot();
//		
//		driver.findElement(By.name("email")).click();
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
		
//		TakesScreenshot t = (TakesScreenshot)driver;
//		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
//		System.out.println(screenshotAs);
		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_C);
//		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V );
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
//		WebElement des1 = driver.findElement(By.id("amt8"));
//		
//		Actions a = new Actions (driver);
//		
//		a.dragAndDrop(src1, des1).perform();
		
		
		
		
		
		

		
		

}
