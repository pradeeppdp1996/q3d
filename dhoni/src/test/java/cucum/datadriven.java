package cucum;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {
	public static String retr(int q,int w) throws Throwable {
		File a=new File("D:\\eclipse dir\\dhoni\\excel\\pdp.xlsx");
		FileInputStream b=new FileInputStream(a);
		Workbook c =new XSSFWorkbook(b);
		Sheet sheet = c.getSheetAt(0);//getting through index
//		Sheet sheet = c.getSheet("kumar");//getting through name
			Row row = sheet.getRow(q);
			Cell cell = row.getCell(w);
			
		CellType cellType = cell.getCellType();
		String valueof=null;
		if (cellType.equals(cellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();	
		long l=(long)numericCellValue;
		valueof = String.valueOf(l);
		}
		else if (cellType.equals(cellType.STRING)) {
			valueof=cell.getStringCellValue();
		}
		System.out.println(valueof);
		return valueof;
		
	}
	public static void main(String[] args) throws Throwable {
		int q=1;
		int w=0;
		retr( q, w);
		retr(0, 0);
}
}
