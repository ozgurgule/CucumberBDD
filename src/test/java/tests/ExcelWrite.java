package tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    @Test
    public void excelWrite() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("SampleData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");
        System.out.println(sheet.getRow(4).getCell(0));
        XSSFCell keerthi = sheet.getRow(4).getCell(1);
        keerthi.setCellValue("Shayle");
        System.out.println(keerthi);
        FileOutputStream fileOutputStream = new FileOutputStream("SampleData.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        fileInputStream.close();
        workbook.close();


    }


}
