package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	public static void main(String[] args) throws Throwable {
		
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\data.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fi);
	Sheet sheetAt = w.getSheetAt(0);
	int row_Size = sheetAt.getPhysicalNumberOfRows();
	for (int i = 0; i < row_Size; i++) {
		Row row = sheetAt.getRow(i);
		
		int cell_Size = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cell_Size; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int values =(int) numericCellValue;
				System.out.println(values);
			}
		}
	}
	
	
	}
}
