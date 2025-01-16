package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6WindowHandles {
	@Test
	public void WIndowHandles() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		driver.close();
	}

}
