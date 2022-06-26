package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    String filePath = "SampleExcel.xlsx";

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @Test
    public void excel_write() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet= workbook.getSheet("Sheet1");

        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(20000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(30000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(50000);

        FileOutputStream outputStream = new FileOutputStream(filePath);

        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
        fileInputStream.close();




    }
}
