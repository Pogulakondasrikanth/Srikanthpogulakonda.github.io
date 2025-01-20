package bDDframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Local excel file
		FileInputStream fis=new FileInputStream("src\\test\\resources\\TestData\\LoginCredentials.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		 Sheet sheet=workbook.getSheet("Sheet1");
		
		 //Iterate through rows
		 for(int i=1;i<=sheet.getLastRowNum();i++) {
			 Row row=sheet.getRow(i);
			 String username=row.getCell(0).getStringCellValue();
			 String password=row.getCell(1).getStringCellValue();
			 
			 //perform testing
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
			 Thread.sleep(2000);
			 WebElement userfield=driver.findElement(By.cssSelector("input[name='username']"));
			 WebElement passwordfield=driver.findElement(By.cssSelector("input[name='password']"));
			 WebElement loginbutton=driver.findElement(By.cssSelector("button[type='submit']"));
			 
			 userfield.sendKeys(username);
			 passwordfield.sendKeys(password);
			 Thread.sleep(2000);
			 loginbutton.click();
			
			 
		 }
		 workbook.close();
		 fis.close();
		 driver.quit();
		
		
	}

}
