package testcase;

import java.io.IOException;

import dataeng.ExcelData;
import keyword.ObjDen;

public class DriverScrp 
{
	public static void main(String[] args) throws InterruptedException {
	
		ExcelData da=new ExcelData();
		ExcelData dak=new ExcelData();
		ObjDen idm=new ObjDen();
		try {
			da.Excel("C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\Excel\\tot.xlsx");
			dak.Excel("C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\Excel\\keyword.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0;i<=da.rowco();i++)
		{
		 String SearchString=da.getCellVa(i,0);
		
		for (int j=1;j<=dak.rowco();j++)
		{
		 String keyword1=dak.getCellVa(j,2);
		 if (keyword1.equalsIgnoreCase("OpenBrow"))
		 {
			idm.OpenBrow(); 
		 }
		 else if (keyword1.equalsIgnoreCase("SetUrl"))
			 
		 {
			 idm.SetUrl();
			 Thread.sleep(1000);
		 }
		 else if(keyword1.equalsIgnoreCase("Search"))
		 {
			 idm.Search(SearchString);
			 Thread.sleep(1000);
		 }
		 
		 else if (keyword1.equalsIgnoreCase("closeBrow"))
		 {
			 idm.closeBrow();
		 }
		}
		}
	}

}
