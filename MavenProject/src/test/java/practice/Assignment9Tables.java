package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment9Tables {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		int norows=driver.findElements(By.cssSelector("div.left-align table tr")).size();
		int nocol=driver.findElements(By.cssSelector("div.left-align table tr th")).size();
		System.out.println("Number of rows present in the table are: "+norows+"\n Number of colomns present in the table are: "+nocol);
		List<WebElement> text=driver.findElements(By.cssSelector("div.left-align table tr:nth-child(3) td"));
		for(WebElement e:text) {
			System.out.println(e.getText());
		}
	}

}
