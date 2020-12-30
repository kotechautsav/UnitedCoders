package com.testing.Parabank.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterSuite;


public class ReadingExcel {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
    
    
	public static XSSFSheet getDataFromExcel()   {
   	 
	try {	
   	 File file=new File(System.getProperty("user.dir")+"\\Input data\\InputData.xlsx");
   	 FileInputStream fis = new FileInputStream(file);
   	 workbook = new XSSFWorkbook(fis);
   	 sheet= workbook.getSheet("Registration");
  	 
	}catch(Exception e) {
		e.printStackTrace();
	}
	return sheet;
    }
    
    @AfterSuite
    public static void closeWorkbook() {
    	try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}