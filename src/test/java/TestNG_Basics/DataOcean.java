package TestNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataOcean {
	
	@DataProvider
	public String[][] logincred() throws Exception {
		
	
		//to store the path of file//
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\NewSeleniumSession\\Data.xlsx");
		//to Read the file//
		FileInputStream fis  = new FileInputStream(file);
		//Reading data from excel file//
		XSSFWorkbook workboook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workboook.getSheet("Sheet1");
		int NoOfRows = sheet.getPhysicalNumberOfRows();
		int NoOfCells = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[NoOfRows-1][NoOfCells];
		
	    for (int i =0;i<NoOfRows-1;i++) {
	    	for (int j =0;j<NoOfCells;j++) {
	    		/*will help to format the data as per return object*/
	    		DataFormatter df = new DataFormatter();
	    		data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
	    		
	    	}
	    	
	    	workboook.close();
	    	fis.close();
	    }
		
		return data;
		
	}
		
	
}
