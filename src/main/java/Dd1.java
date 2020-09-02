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

public class Dd1 {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Pushpa Maathu\\eclipse\\Mavv\\Excel\\Exe.xlsx");
		
		FileInputStream f1=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s=w.getSheet("DD1");		
		
		int rows =s.getPhysicalNumberOfRows();
		System.out.println("Available rows:"+rows);
			
			Row r=s.getRow(0);
			
			int Cell =r.getPhysicalNumberOfCells();
			System.out.println("Available cells:"+Cell);
			
		}
	}

