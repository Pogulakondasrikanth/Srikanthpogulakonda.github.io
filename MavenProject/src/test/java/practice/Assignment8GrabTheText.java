package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8GrabTheText {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement option=driver.findElement(By.id("checkBoxOption2"));
	//selecting option 2 from the check box
	String text=driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
	System.out.println(text);
	option.click();
	
	Select sc=new Select(driver.findElement(By.id("dropdown-class-example")));
	sc.selectByVisibleText(text);
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("alertbtn")).click();
	Alert a=driver.switchTo().alert();
	String alertText=a.getText();
	a.accept();
	if(alertText.contains(text)) {
		System.out.println("The selected option validated successfully");
	}
	else
		System.out.println("The selectd option is not validated successfully");
	driver.close();
	
	

}}



