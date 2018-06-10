package leaf.Lead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream(new File("C:\\Selenium Testleaf\\Selenium\\data\\Login.xlsx"));
XSSFWorkbook wBook  = new XSSFWorkbook(fis);
XSSFSheet sheet = wBook.getSheetAt(0);

int lastRowNum = sheet.getLastRowNum();
System.out.println(lastRowNum);
int lastCellNum = sheet.getRow(0).getLastCellNum();
System.out.println(lastCellNum);
System.out.println("row count : "+lastRowNum+" Cell Count : "+lastCellNum);
for(int i=1; i<=lastRowNum; i++) {
	XSSFRow row = sheet.getRow(i);
for(int j=0; j<lastCellNum;j++) {
	String value= row.getCell(j).getStringCellValue();
	System.out.println(value);
}	
}
/*XSSFRow row = sheet.getRow(1);
String value= row.getCell(1).getStringCellValue();
System.out.println(value);
*/
wBook.close();

	}

}
