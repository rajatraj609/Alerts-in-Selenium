package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo {
	@Test
	public void NameDemo() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DXC Selenium Automation\\Locator in Selenium(Name-Chrome)\\SeleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		driver.switchTo().alert().accept();
	}

}
