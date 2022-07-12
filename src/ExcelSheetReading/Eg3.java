package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile= new File("C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\Excel26MarchB.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		int totalNoOfRows = mySheet.getLastRowNum();
		System.out.println("Total no of rows are "+totalNoOfRows);
		
		short totalNoOfCell = mySheet.getRow(totalNoOfRows).getLastCellNum();
		int count = totalNoOfCell-1;
		System.out.println("Total No Of cells are "+ count);
		
		for(int i=0; i<=totalNoOfRows; i++)
		{
			for(int j=0; j<=count; j++)
				
			{
				Cell CellValue = mySheet.getRow(i).getCell(j);
				System.out.print(CellValue+" ");
			}
			System.out.println();
		}
		
	}
	
}
