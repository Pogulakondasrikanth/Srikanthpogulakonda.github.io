package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3AngularPracticeWebSite {
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Srikanth");
		driver.findElement(By.name("email")).sendKeys("Srikanth@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Srikanth123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement select=driver.findElement(By.id("exampleFormControlSelect1"));
		Select sc=new Select(select);
		sc.selectByVisibleText("Male");
		System.out.println(sc.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("10-08-2014");
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		String success=driver.findElement(By.xpath("//div/strong")).getText();
		Assert.assertEquals(success, "Success!");
		driver.close();
		
				
	}

}
