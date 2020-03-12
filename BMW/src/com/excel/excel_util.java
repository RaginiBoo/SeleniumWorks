package com.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_util {

	public void requirements(String detail) throws IOException
	{
		File file = new File("Excelfile\\myrequirements.xlsx");                 
		XSSFWorkbook wb=new XSSFWorkbook();                                    
		XSSFSheet sheet = wb.createSheet("My requirements");                    
		sheet.createRow(0).createCell(0).setCellValue(detail);                  
		
		try {
			FileOutputStream fileos = new FileOutputStream(file);              
			wb.write(fileos);                                                 
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			
		}
		
	}
	
}
