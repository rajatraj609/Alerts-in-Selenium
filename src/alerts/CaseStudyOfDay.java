package alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudyOfDay {
	@Test
	public void LinkDemo() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\DXC Selenium Automation\\Locator in Selenium(Name-Chrome)\\SeleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");
		
		driver.findElement(By.id("googleSearchId")).sendKeys("Banglore");
		driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/span[2]/button")).click();
		//Counting No of Links in Easycalculation.
		List<WebElement> Links= driver.findElements(By.xpath("//a"));
		int Nolinks = Links.size();
		System.out.println("Number of Links in calculaion " + Nolinks);
	}
}
