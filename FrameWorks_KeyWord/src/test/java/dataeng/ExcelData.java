package dataeng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	File fil;
	XSSFWorkbook wb;
	XSSFSheet sh;
	int rowc;
	public void Excel(String path) throws IOException
	{
		fil=new File(path);
		FileInputStream fs=new FileInputStream(fil);
		wb=new XSSFWorkbook(fs);
	}
	public int rowco()
	{
		sh=wb.getSheetAt(0);
		rowc=sh.getLastRowNum();	
		return rowc;	
	}
	
	public String getCellVa(int rv,int cv)
	{
		sh=wb.getSheetAt(0);
		String cellv=sh.getRow(rv).getCell(cv).getStringCellValue();
		return cellv;
		
	}
	
	//export value to excel cell
	
	public void setdata(int sheetno ,int rowno,int coloumnno,String str)
	{
		sh=wb.getSheetAt(sheetno);
		sh.getRow(rowno).createCell(coloumnno).setCellValue(str);
		try {
			FileOutputStream fos=new FileOutputStream(fil);
			wb.write(fos);
			fos.close();
			} 
		
		catch (Exception e)
			{
				System.out.println(e.getMessage());
			} 
	}
}
		