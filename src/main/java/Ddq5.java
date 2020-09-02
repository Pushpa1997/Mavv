import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ddq5 {
	public static void main(String[] args) throws IOException {
		
		File loc=new File("C:\\Users\\Pushpa Maathu\\eclipse\\Mavv\\Excel\\Maven.xlsx");
		FileOutputStream f1=new FileOutputStream(loc);
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("Hotelbooking");
		Row r=s.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Location");
		c.setCellValue("RoomType");
		w.write(f1);
		System.out.println("Sucess");
		
		
	}

}
