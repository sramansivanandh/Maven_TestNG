 package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Datadriven {
	
	public static void write_Data() throws Throwable {
		
		File f = new File("C:\\Users\\ACER\\eclipse-workspace\\ja\\Maven_Project\\InputData\\Input Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Data1").createRow(0).createCell(0).setCellValue("students");
		wb.getSheet("Data1").getRow(0).createCell(1).setCellValue("Marks");
		wb.getSheet("Data1").createRow(1).createCell(0).setCellValue("Rishi");
		wb.getSheet("Data1").getRow(1).createCell(1).setCellValue(98);
		wb.getSheet("Data1").createRow(2).createCell(0).setCellValue("Swaara");
		wb.getSheet("Data1").getRow(2).createCell(1).setCellValue(99);
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
	}

	public static void main(String[] args) throws Throwable {
		
		write_Data();
	}
}
