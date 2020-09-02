import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dd3 {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Pushpa Maathu\\eclipse\\Mavv\\Excel\\Exe.xlsx");
		
		FileInputStream f1=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("DD1");
		
		Row r=s.createRow(0);
			
		Cell c=r.createCell(0);
		c.setCellValue("Name");
		
		
		Cell c1=r.createCell(1);
		c1.setCellValue("Course");
		
		
		FileOutputStream f2=new FileOutputStream(loc);
		w.write(f2);
		System.out.println("success");
		
		
		
	}

}
