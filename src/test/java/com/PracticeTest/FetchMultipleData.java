package com.PracticeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

	FileInputStream fi=new FileInputStream("./src/test/resources/ExcelData.xlsx");
	
	Workbook wb = WorkbookFactory.create(fi);		
	
	Sheet sh = wb.getSheet("LoginData");
	Object[][] arr=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
	
	for(int i=0;i<sh.getLastRowNum();i++)
	{
		for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
		{
			arr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(arr[i][j]);
		}
		
	}
	
}
}