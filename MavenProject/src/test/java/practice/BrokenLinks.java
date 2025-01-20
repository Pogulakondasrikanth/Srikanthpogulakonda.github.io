package practice;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--head");//execute script in headless mode
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement footer=driver.findElement(By.cssSelector("#gf-BIG"));
		List<WebElement> links=footer.findElements(By.tagName("a"));
		SoftAssert softassert=new SoftAssert();
		for(WebElement a:links) {
		String url=a.getAttribute("href");
		HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
		conn.connect();
		int respocode=conn.getResponseCode();
		softassert.assertTrue(respocode<400, "The link "+a.getText()+" is failed with status code "+respocode);
		
		
		}
		softassert.assertAll();
	}

}
