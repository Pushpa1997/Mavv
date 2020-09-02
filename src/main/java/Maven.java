import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Maven {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Pushpa Maathu\\eclipse\\Mavv\\Excel\\Maven.xlsx");
		FileInputStream f=new FileInputStream(loc);
		FileOutputStream f1=new FileOutputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		
		Sheet s=w.getSheet("Lalith");
		int ro=s.getPhysicalNumberOfRows();
		System.out.println("Available rows:"+ro);
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell ce=r.getCell(j);
				System.out.println(ce);
				
				Row r1=s.createRow(12);
				Cell c=r1.createCell(12);
				c.setCellValue("PRIYA");
				
			}
			
		}
		
		
		
		
			}
	
			
		}
	


