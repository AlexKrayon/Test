package com.xfleet.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static void sleep(int seconds)  {

        try {
            Thread.sleep(seconds*1000);
        }catch(InterruptedException e){
            System.out.println("static sleep issue");
        }
    }

    public static void openNewTab(String url){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('"+url+"','_blank');");
    }

    public static void closeSpecificTab(String pageTitle){
        String newTab = "";
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getTitle().equals(pageTitle)){
                Driver.getDriver().close();
            }else{
                newTab = each;
            }
        }
        Driver.getDriver().switchTo().window(newTab);
    }


    public static List<String> truckDriversUserName() {

        String path = "credentials.xlsx";

        List<String> truckDrivers = new ArrayList<>();


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowNumber; i++) {

                truckDrivers.add(sheet.getRow(i).getCell(0).toString());
            }


            file.close();
            workbook.close();


        } catch (Exception e) {

            e.printStackTrace();
        }


        return truckDrivers;
    }

    public static List<String> storeManagersUserName() {

        String path = "credentials.xlsx";


        List<String> storeManagers = new ArrayList<>();


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowNumber; i++) {

                storeManagers.add(sheet.getRow(i).getCell(1).toString());
            }

            file.close();
            workbook.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return storeManagers;
    }

    public static List<String> salesManagersUserName() {

        String path = "credentials.xlsx";


        List<String> salesManagers = new ArrayList<>();


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            int rowNumber = sheet.getPhysicalNumberOfRows();


            for (int i = 1; i < rowNumber; i++) {

                salesManagers.add(sheet.getRow(i).getCell(2).toString());
            }
            file.close();
            workbook.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return salesManagers;
    }

    public static String password() {
        String path = "credentials.xlsx";
        String password = "";


        try {
            FileInputStream file = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            XSSFSheet sheet = workbook.getSheet("data");

            password = sheet.getRow(1).getCell(3).toString();

            file.close();
            workbook.close();

        } catch (Exception e) {

        }
        return password;

    }


}
