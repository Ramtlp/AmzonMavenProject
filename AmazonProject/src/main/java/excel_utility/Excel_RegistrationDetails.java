package excel_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel_RegistrationDetails 
{
	public static String fname;
	public static String mo_number;
	
	public static String pwd;
	
	public static void userData() throws EncryptedDocumentException, IOException
	{
		String path="E:\\AmazonProject\\UserDetails\\RegistraitonDetails.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(file);
		fname=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		mo_number=NumberToTextConverter.toText(wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue());
		pwd=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	}


}



