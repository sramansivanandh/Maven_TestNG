package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_DataDriven {

	public static void read_dataInput() throws Throwable {

		File f = new File("C:\\Users\\ACER\\eclipse-workspace\\ja\\Maven_Project\\InputData\\Input Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String stringCell = cell.getStringCellValue();

			System.out.println(stringCell);
		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCell = cell.getNumericCellValue();

			int numericValue = (int) numericCell;

			System.out.println(numericValue);

		}

	}

	public static void getAllData() throws Throwable {

		File f = new File("C:\\Users\\ACER\\eclipse-workspace\\ja\\Maven_Project\\InputData\\Input Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < NumberOfRows; i++) {
		
			Row row = sheetAt.getRow(i);
			
			int NumberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < NumberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String stringValue = cell.getStringCellValue();
					
					System.out.print(stringValue);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					
					double numericValue = cell.getNumericCellValue();
					
					int value = (int) numericValue;
					
					System.out.println(value);
					
				}
				
				
			}
		}

	}



	public static void main(String[] args) throws Throwable {
		
		System.out.println("*******Particular Value*************");

		read_dataInput();
		
		System.out.println("********AllData*************");
		
		getAllData();
	}

}
