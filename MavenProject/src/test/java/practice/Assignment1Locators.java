package practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Locators {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("srikanth");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("srikanth123");
	driver.findElement(By.name("chkboxOne")).click();
	driver.findElement(By.cssSelector("label[for='chkboxTwo']")).click();
	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//form/input[1]")).sendKeys("sriaknth");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("srikanth@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("567982762");
	driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
	String password=driver.findElement(By.cssSelector("p.infoMsg")).getText();
	assertEquals(password, "Please use temporary password 'rahulshettyacademy' to Login.");
	String[] passwordarr=password.split("'");
	String actual_password=passwordarr[1];
	driver.findElement(By.className("go-to-login-btn")).click();
	Thread.sleep(1000);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("srikanth");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys(actual_password);
	driver.findElement(By.name("chkboxOne")).click();
	driver.findElement(By.cssSelector("label[for='chkboxTwo']")).click();
	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
