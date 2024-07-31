package framework;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/*
	 * this method is used to fetch the data from Excel sheet
	 * @param sheet - sheet name
	 * @param row - row index
	 * @param cell - cell index
	 * @return - data in the form of string
	 */
	
	public String readDataFromExcel(String sheet, int row,int cell) {
	
		File file = new File("");
		FileInputStream fis=null;
		Workbook workbook = null;
		
		try 
		{
			fis=new FileInputStream(file);
			 workbook= WorkbookFactory.create(fis);
			
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		
		String data=Workbook(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
}
