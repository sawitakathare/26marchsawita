package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile= new File("C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\Excel26MarchB.xlsx");
		Workbook book = WorkbookFactory.create(myFile);
		Sheet mysheet = book.getSheet("Sheet2");
		Row myRow = mysheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		System.out.println(myCell.getCellType());
		
		//code for reading whole data from excel sheet
		Sheet mySheet2 = book.getSheet("Sheet2");
		
		for(int i=0; i<=1; i++) // outer for loop--> rows
		{
			for(int j=0; j<=2; j++) //inner for loop-->Cells
		
		{
			String value = mySheet2.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
			System.out.println();
		}

	}

}

