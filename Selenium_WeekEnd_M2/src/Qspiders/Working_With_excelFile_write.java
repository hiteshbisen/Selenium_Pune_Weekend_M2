package Qspiders;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_With_excelFile_write {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./files/excelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell = wb.getSheet("Sheet1").getRow(1).getCell(1);
		
		cell.setCellValue("Hello");
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		FileOutputStream fos=new FileOutputStream("./files/excelData.xlsx");
		wb.write(fos);
		wb.close();

	}

}
