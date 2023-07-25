package com.ActiTime.GenericLibrary;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contain all generic methods for read Data From Property and read Data From Excel
 * @author Mohammed Mubeen
 *
 */
public class FileLibrary {
	/**
	 * This method is a non static designed for read Data From Property
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * This method is a non static designed for read Data From Excel
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./Testdata/AutomationTestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
