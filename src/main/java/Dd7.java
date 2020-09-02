import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dd7 {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Pushpa Maathu\\eclipse\\Mavv\\Excel\\Exe.xlsx");
		FileInputStream ff=new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(ff);
		Sheet s=w.createSheet("Facebook");
		Row r=s.createRow(0);
		
		Cell c=r.createCell(0);
		c.setCellValue("puspam2397@gmail.com");
		Cell c1=r.createCell(1);
		c1.setCellValue("Skybirds");	
		FileOutputStream f=new FileOutputStream(loc);
		w.write(f);
		System.out.println("Success");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pushpa Maathu\\eclipse\\Mavv\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("puspam2397@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Skybirds");
		driver.findElement(By.id("u_0_b")).click();
	}

}
