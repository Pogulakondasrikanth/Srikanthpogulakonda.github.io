package bDDframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMLoginPage {
	@Test
public static void Loginpage() throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	try {
		FileInputStream fis=new FileInputStream("src\\test\\resources\\TestData\\LoginCredentials.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			Row row=sheet.getRow(i);
			String username=row.getCell(0).getStringCellValue();
			String password=row.getCell(1).getStringCellValue();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			WebElement userfield=driver.findElement(By.cssSelector("input[name='username']"));
			 WebElement passwordfield=driver.findElement(By.cssSelector("input[name='password']"));
			 WebElement loginbutton=driver.findElement(By.cssSelector("button[type='submit']"));
			 
			 userfield.sendKeys(username);
			 passwordfield.sendKeys(password);
			 Thread.sleep(2000);
			 loginbutton.click();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
