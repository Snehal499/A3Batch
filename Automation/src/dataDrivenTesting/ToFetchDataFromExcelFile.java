package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f= new File(".\\Properties\\ExcelData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet=workbook.getSheet("RegisterUser");
		int rowCount=sheet.getRow(0).getPhysicalNumberOfCells();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] result=new String[rowCount-1][cellCount];
		
		for(int i=1; i<rowCount;i++) {	
			for (int j = 0; j < cellCount; j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				result[i-1][j]=data;	
			}
		}
	}
}
