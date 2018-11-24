package Utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataFromExcel {

	static XSSFWorkbook workbook;
	static XSSFSheet excelsheet;

	public static void main(String[] args) {
		getRowCount();
		readCellData();
		// above method is for string type
		readNumericData();
		//above is to read int/double type data from xcel
		
	}

	public static void getRowCount() {

		try {
			workbook = new XSSFWorkbook("C:\\Users\\mmanbhat\\"
					+ "eclipse-workspace\\SeleniumJavaFramework\\excelFiles\\"
					+ "ACT_Xcel.xlsx");
			// the above is the object only works after importing apache POI 
			// to read microsoft office files

			excelsheet = workbook.getSheet("OrderEntry");

			System.out.println(excelsheet.getPhysicalNumberOfRows());
			System.out.println(excelsheet.getColumnWidth(3));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}}

	public static void readCellData()	{

		try {
			workbook = new XSSFWorkbook("C:\\Users\\mmanbhat\\"
					+ "eclipse-workspace\\SeleniumJavaFramework\\excelFiles\\"
					+ "ACT_Xcel.xlsx");
			// the above is the object only works after importing apache POI 
			// to read microsoft office files

			excelsheet = workbook.getSheet("OrderEntry");
		String header0= 	excelsheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(header0);
		String header1= 	excelsheet.getRow(0).getCell(1).getStringCellValue();
		System.out.print(" " +header1);
		String header2= 	excelsheet.getRow(0).getCell(2).getStringCellValue();
		System.out.print(" " +header2);
		String header3= 	excelsheet.getRow(0).getCell(3).getStringCellValue();
		System.out.print(" " +header3);
		String header4= 	excelsheet.getRow(0).getCell(4).getStringCellValue();
		System.out.print(" " +header4);
		
		//next line
		System.out.println("");
		
		String value0= 	excelsheet.getRow(1).getCell(0).getStringCellValue();
		System.out.print(value0);
		String value1= 	excelsheet.getRow(1).getCell(1).getStringCellValue();
		System.out.print(" " +value1);
		String value2= 	excelsheet.getRow(1).getCell(2).getStringCellValue();
		System.out.print(" " +value2);
		String value3= 	excelsheet.getRow(1).getCell(3).getStringCellValue();
		System.out.print(" " +value3);
		String value4= 	excelsheet.getRow(1).getCell(4).getStringCellValue();
		System.out.print(" " +value4);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
public static void readNumericData() {
	try {
		workbook = new XSSFWorkbook("C:\\Users\\mmanbhat\\"
				+ "eclipse-workspace\\SeleniumJavaFramework\\excelFiles\\"
				+ "ACT_Xcel.xlsx");
		// the above is the object only works after importing apache POI 
		// to read microsoft office files

		excelsheet = workbook.getSheet("OrderEntry");
		
		double number0 = excelsheet.getRow(5).getCell(0).getNumericCellValue();
		System.out.println("\n\n\n" +number0);
		
		double number1 = excelsheet.getRow(5).getCell(1).getNumericCellValue();
		System.out.println("\n" +number1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}

	}



