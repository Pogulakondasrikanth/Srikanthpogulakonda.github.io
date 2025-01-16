package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment10AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement searchbox=driver.findElement(By.id("autocomplete"));
		searchbox.sendKeys("ind");
		Thread.sleep(2000);
		searchbox.sendKeys(Keys.DOWN);
		searchbox.sendKeys(Keys.DOWN);
		System.out.println(searchbox.getAttribute("value"));
	}

}
