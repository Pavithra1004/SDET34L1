package com.PracticeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/ExcelData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);		
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row r = sheet.getRow(0);
		
		Cell c = r.getCell(0);
		
		String data = c.getStringCellValue();
		System.out.println(data);
	}

}


