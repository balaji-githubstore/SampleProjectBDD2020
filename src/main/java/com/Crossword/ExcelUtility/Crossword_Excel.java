package com.Crossword.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Crossword_Excel 
{
	//To read and return the username
	public  String excel_username(int a) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\testdata.xlsx")); //Create an object of File class to open xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fil);  //Create an object of FileInputStream class to read excel file
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //Read excel sheet by sheet name  
		int count=sheet.getLastRowNum(); //Get the current count of rows in excel file
		System.out.println(count);	
		XSSFRow row =sheet.getRow(a); //Get the first row from the sheet
		XSSFCell cell=row.getCell(0); //Get the first column from the sheet
		String un=cell.getStringCellValue();
							  
		return un;
	}
					
	//To read and return the password
	public  String excel_password(int b) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\testdata.xlsx")); //Create an object of File class to open xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fil); //Create an object of FileInputStream class to read excel file
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //Read excel sheet by sheet name
		int count=sheet.getLastRowNum(); //Get the current count of rows in excel file
		System.out.println(count);
		XSSFRow row =sheet.getRow(b); //Get the second row from the sheet
		XSSFCell cell1=row.getCell(1); //Get the second column from the sheet
		String pwd=cell1.getStringCellValue();
				          
		return pwd;
	}
}
