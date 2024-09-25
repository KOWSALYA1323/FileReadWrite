package javaprogram2;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileTaskWrite {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("PersonalData");
		Object Data[][]= {{"Name","Age","Email"}, {"John Doe", "30", "john@test.com"}, {"John Doe", "28", "john@test.com"}, {"Bob Smith", "35", "jacky@example.com"}, {"Swapnil", "37", "swapnil@example.com"}};
		
int rows = Data.length;
int cols = Data[0].length;
System.out.println(rows);
System.out.println(cols);

String filepath=".\\excel\\PersonalData.XLSX";
FileOutputStream fos=new FileOutputStream(filepath);
workbook.write(fos);
fos.close();
System.out.println("File Written Succesfully...");


	}

}
