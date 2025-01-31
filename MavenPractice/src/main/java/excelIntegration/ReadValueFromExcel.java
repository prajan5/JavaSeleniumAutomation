package excelIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Step:1 Set the excel workbook path
		XSSFWorkbook wbook=new XSSFWorkbook("./Data/LoginPage.xlsx");
		
		//Step:2 Get the Sheet from the book
		//XSSFSheet sheet=wbook.getSheetAt(0); //index of the sheet
		
		//sheetname
		
		
		XSSFSheet sheet=wbook.getSheet("Sheet1"); //index of the sheet
		
		//Get row count in excel it Excludes header.
		int rowvalue = sheet.getLastRowNum();
		System.out.println("Row count:"+rowvalue);
		
		//include header in the row count
		int rowvaluewithheader = sheet.getPhysicalNumberOfRows();
		System.out.println("Row count with header:"+rowvaluewithheader);
		
		//Get column count in excel
		int columncount = sheet.getRow(1).getLastCellNum();
		System.out.println("Column count :"+columncount);
		
		//read the value from excel 1st row , 2nd column
		String cellvalue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Cellvalue :"+cellvalue);
		
		System.out.println("*************All Values from Excel****************");
		//print all the value from excel sheet
		
		for (int i=1;i<=rowvalue;i++)
		{
			for (int j=0;j<columncount;j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		
		wbook.close();
	}

}
