package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelUtility {

	public String readDataFromExcel(String sheetname, int rowno, int cellno) throws EncryptedDocumentException, IOException {
		// step 1--->get the obj of excel file
		FileInputStream fis = new FileInputStream("./testscriptdata/logindata.xlsx");
		// step 2--->open excel in read mode
		Workbook workbook = WorkbookFactory.create(fis);
		// step 3--->get the sheet control
		Sheet sheet = workbook.getSheet(sheetname);
		// step 4--->get row control
		Row row = sheet.getRow(rowno);
		// step 5--->get cell control
		Cell cell = row.getCell(cellno);
		// step 6--->read the data
		String data = cell.getStringCellValue();
		return data;
	}

}
