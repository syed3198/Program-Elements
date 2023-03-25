package pe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd_HH:mm");
			Calendar cal = Calendar.getInstance();
			String date_and_time = dateFormat.format(cal.getTime()).replaceAll(":", "-");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name");
			String name = sc.nextLine();
			File fileName = new File("C://Users//user//Desktop//" + name + "_" + date_and_time + ".xls");
			FileOutputStream fos = new FileOutputStream(fileName);
			XSSFWorkbook workbook = new XSSFWorkbook();
			System.out.println("Enter Sheet name");
			String SheetName = sc.nextLine();
			XSSFSheet sheet = workbook.createSheet(SheetName);

			FileInputStream fis = new FileInputStream(fileName);
			Sheet sheet1 = workbook.getSheet(SheetName);
			int row_count = 25;
			System.out.println(row_count);
			int col_count = 25;
			// sheet1.createRow(0).createCell(0).setCellValue("Age");

			Object data[][] = new Object[row_count][col_count];
			for (int i = 0; i <= row_count; i++)// iterate row value
			{
				for (int j = 0; j <= col_count; j++) { // iterate cell value
					sheet1.createRow(i).createCell(j).setCellValue("Age");
					System.out.println(sheet.getRow(i).getCell(j).toString());
					// data[i][j] = sheet.getRow(i).getCell(j).toString();
				}
			}
			workbook.write(fos);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
