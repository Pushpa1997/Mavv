import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dd2 {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Pushpa Maathu\\eclipse\\Mavv\\Excel\\Exe.xlsx");
		
		FileInputStream f1=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("DD1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c=r.getCell(j);
				System.out.println(c);
				
				
			}
			
			
		}
		
	}
	
	
}
