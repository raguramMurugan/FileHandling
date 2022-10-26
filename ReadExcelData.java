package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		
		String file="C:\\Users\\HAI\\Training\\java\\datafiles\\Studentdata.xlsx";
		FileInputStream inputfile=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(inputfile);
		XSSFSheet sheet=workbook.getSheet("studentdata.xlsx");
		
		int rows=sheet.getLastRowNum();
		int columns=sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r<rows; r++)
		{
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0; c<columns; c++)
			{
				XSSFCell col=row.getCell(c);
				switch(col.getCellType())
				{
				case STRING : System.out.print(col.getStringCellValue()); break;
				case BOOLEAN: System.out.print(col.getBooleanCellValue()); break;
				case NUMERIC: System.out.print(col.getNumericCellValue()); break;
				}
			}
			System.out.print(" | ");
		}
		System.out.println();
	}

}
