package pe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws IOException {
		
		DateFormat dateFormat = new SimpleDateFormat("dd_HH:mm");
		Calendar cal = Calendar.getInstance();
		String date_and_time = dateFormat.format(cal.getTime()).replaceAll(":", "-");
	
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter name");
		String name = sc.nextLine();
		File fileName = new File("C://Users//user//Desktop//" +name+"_"+date_and_time+".xls");
		FileOutputStream fos = new FileOutputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook();
		System.out.println("Enter Sheet name");
		String SheetName = sc.nextLine();
		XSSFSheet sheet = workbook.createSheet(SheetName);
		workbook.write(fos);
		fos.close();
		 
	}
}
