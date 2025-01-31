package opportunityMarathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration {
	
	//step4 change main method into normal method 
		//retain the static keyword
	
	public static String[][] readExcel(String fileName,String sheetName) throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sh= wb.getSheet(sheetName);
		//get row count
		int rowcount = sh.getLastRowNum();
		//get column count 
	    int columcount = sh.getRow(1).getLastCellNum();
	    //declare string array
	  //step 1 -- [5][4]
		String[][] data = new String[rowcount][columcount];
		for (int i=1;i<=rowcount;i++)
		{
			for (int j=0;j<columcount;j++)
			{
				String cellvalue = sh.getRow(i).getCell(j).getStringCellValue();
				//tep 2 read value from excel and pass it to dataprovider
				data[i-1][j]=cellvalue;
				System.out.println(data);
			}
		
		
	    }
		wb.close();
		return data;
}

	}

	

