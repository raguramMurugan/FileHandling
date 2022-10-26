package filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

final class ExcelRead {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		String path=".\\datafiles\\Studentdata.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<rows; r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0; c<cols; c++)
			{
				XSSFCell column=row.getCell(c);
				
				switch(column.getCellType())
				{
				case STRING: System.out.print(column.getStringCellValue()); break;
				case NUMERIC: System.out.print(column.getNumericCellValue());break;
				case BOOLEAN: System.out.print(column.getBooleanCellValue()); break;
				}
			}
			System.out.print(" | ");
		}
		System.out.println();
	}

}

 