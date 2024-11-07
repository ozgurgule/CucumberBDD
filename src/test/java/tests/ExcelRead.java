package tests;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void excelRead() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("SampleData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        int rowNum = sheet.getLastRowNum();
        for (int i = 0; i < rowNum; i++) {
            if (sheet.getRow(i).getCell(0).toString().equals("Vinod")) {
                System.out.println(sheet.getRow(i).getCell(2));
            }

        }


    }
}
