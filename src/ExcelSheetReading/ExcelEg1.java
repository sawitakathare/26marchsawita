package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create excel sheet and pass the path along with name and extension in File Object
		
		File MyFile= new File("C:\\Users\\Mukesh\\Desktop\\26 March B_batch\\Automation Notes\\Excel26MarchB.xlsx");
		
		
		//using WorkBookFactory class read excel sheet
		// how to read String value
		String name = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		String name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(name1);
		String name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(name2);
		String name3 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(name3);
		
		String Mychar = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(Mychar);
		boolean value = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(value);
		double number = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue();
		System.out.println(number);
	}

}
