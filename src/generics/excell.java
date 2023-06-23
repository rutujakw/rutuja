package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

public class excell implements utility
{ 
	static Workbook wb;
	static Sheet s;
	static Row r;
	static Cell c;
	
	public static void openExcel()
	{
		try
		{
			WorkbookFactory.create(new FileInputStream(excellfilepath));
		}
		catch(Exception e)
		{
			
		}	
	}
	
	public static void identifysheet(String sheetname)
	{
		s=wb.getSheet(sheetname);
	}
	
	public static int totalrowcount()
	{
		return s.getLastRowNum();
	}
	
	public static void identifyrow(int rownum)
	{
		r=s.getRow(rownum);
	}
	
	public static int totalcellcount()
	{
		return r.getLastCellNum();
	}
	
	public static void identifycell(int cellnum)
	{
		c=r.getCell(cellnum);
	}
	
	public static String identifydata()
	{
		return c.toString();
	}
	
}


