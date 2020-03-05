package Com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login
{WebDriver driver;
WebElement textbox;

public void url() {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.carwale.com/");

}


public void login_button()
{
	driver.findElement(By.xpath("//*[@id=\"firstLogin\"]/span")).click();;
}

public void username_pass() throws IOException
{
	FileInputStream file = new FileInputStream("C:\\Users\\BLTuser.BLT1227\\Desktop\\pass.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet= workbook.getSheet("Sheet1");
	int count = sheet.getLastRowNum();
	System.out.println(count);
	for (int i=1;i<=count;i++)
	{
		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(0);
		String un = cell.getStringCellValue();
		XSSFCell cell1 =  row.getCell(1);
		String pwd =  cell1.getStringCellValue();
		
		driver.findElement(By.id("txtloginemail")).sendKeys(un);
		driver.findElement(By.id("txtpasswordlogin")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
driver.close();		

}

	
}
}