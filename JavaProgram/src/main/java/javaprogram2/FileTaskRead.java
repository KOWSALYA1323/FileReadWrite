package javaprogram2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileTaskRead {

	public static void main(String[] args) throws IOException {
		getRowCount();
		
	}
		
		
		public static void getRowCount()
		{
			try
			{
				XSSFWorkbook workbook = new XSSFWorkbook(".//excel/data.XLSX");
				XSSFSheet sheet = workbook.getSheet("sheet1");
				int rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("Number of rows "+rowCount);
			}
			catch(IOException e)
			{
				e.printStackTrace();
		}

	}
		
		
		
		
		
	}


