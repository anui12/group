package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readDataexcelTest {

	@Test
	public void demoTest() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("src\\test\\resources\\jenkins.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(1);
		String data = cl.getStringCellValue();
		System.out.println(data);
		
		
		
	}
}
