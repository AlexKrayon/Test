package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel() throws IOException {

        String path = "SampleExcel.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        System.out.println(sheet.getRow(2).getCell(0));

        System.out.println(sheet.getRow(1).getCell(0));

    }
}
