package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotTest {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Hai Guys\\eclipse-workspace\\Farith\\Selenium\\driver\\chromedriver.exe");

	
	WebDriver d=new ChromeDriver();

	d.get("https://www.facebook.com/");

	

	Actions a=new Actions(d);

	

	WebElement email = d.findElement(By.name("email"));

	email.sendKeys("nithya");

	

	a.doubleClick(email).perform();

	

	Thread.sleep(3000);

	Robot r=new Robot();

	

	//copy name 

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_X);

	r.keyRelease(KeyEvent.VK_CONTROL);

	r.keyRelease(KeyEvent.VK_X);

	

	r.keyPress(KeyEvent.VK_TAB);

	r.keyRelease(KeyEvent.VK_TAB);

	

	//paste name

	r.keyPress(KeyEvent.VK_CONTROL);

	r.keyPress(KeyEvent.VK_V);

	r.keyRelease(KeyEvent.VK_CONTROL);

	r.keyRelease(KeyEvent.VK_V);

	

	//tab two times to go to login button

	r.keyPress(KeyEvent.VK_TAB);

	r.keyRelease(KeyEvent.VK_TAB);

	r.keyPress(KeyEvent.VK_TAB);

	r.keyRelease(KeyEvent.VK_TAB);

	

	//click login

	r.keyPress(KeyEvent.VK_ENTER);

	r.keyRelease(KeyEvent.VK_ENTER);

								

	Thread.sleep(3000);

	d.quit();

}

}


}
