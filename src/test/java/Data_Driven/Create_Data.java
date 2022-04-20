package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Data {
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet createSheet = w.createSheet("data");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("email");
		w.getSheet("data").getRow(0).createCell(1).setCellValue("naveen@1212gmail.com");
		w.getSheet("data").getRow(0).createCell(2).setCellValue("status");
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		w.close();
		System.out.println("done");
		

}
}
