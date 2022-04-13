package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemoValidationNew {
	@Test
	public void AlertDemo() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DXC Selenium Automation\\Locator in Selenium(Name-Chrome)\\SeleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(8000);
		alert.accept();
		String result = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You clicked: Ok", result);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(8000);
		alert1.accept();
		String result1 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result1);
		Assert.assertEquals("You entered:", result1);
	}
}
