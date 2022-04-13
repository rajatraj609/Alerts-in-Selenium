package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemoValidationDismiss {
	@Test
	public void AlertDemo() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DXC Selenium Automation\\Locator in Selenium(Name-Chrome)\\SeleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//Case Study 1 Information Alert
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(8000);
		alert.accept();
		String result = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked an alert", result);
//Case Study 2 Confirmation Alert		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(8000);
		alert1.dismiss();
		String result1 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result1);
		Assert.assertEquals("You clicked: Cancel", result1);
//Case Study 3 Prompt Alert
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		driver.switchTo().alert().sendKeys("Hello Rajat");
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
		String result2 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You entered: Hello Rajat", result2);
	}
}
