package practice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5FluentWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#start button")).click();
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.id("finish")).isDisplayed()) {
				return driver.findElement(By.id("finish"));
				}
			else 
				return null;
			
			}});
		Assert.assertEquals(driver.findElement(By.cssSelector("#finish h4")).getText(), "Hello World!");
		
		
	}

}
