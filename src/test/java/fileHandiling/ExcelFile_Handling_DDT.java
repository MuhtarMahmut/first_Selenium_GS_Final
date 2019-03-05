package fileHandiling;

import Ihtibar.Ihtibar;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelFile_Handling_DDT {
    //   public static void main(String[] args) throws Exception {
//        FileInputStream excel=new FileInputStream("Testing1.xlsx");
//
//        XSSFWorkbook Testing1=new XSSFWorkbook(excel);
//        XSSFSheet RAYSA=Testing1.getSheet("IhtibarYasen");
//        String aa=RAYSA.getRow(1).getCell(1).getStringCellValue();
//
//        System.out.println(aa);
//        int rownumbers=RAYSA.getLastRowNum();
//        System.out.println(rownumbers);
//        int cellnumbers=RAYSA.getRow(0).getLastCellNum();
//        //this will return the total cells at first row only;
//        System.out.println(cellnumbers) ;
//        for(int y =0;y<2;y++) {
//            for (int x = 0; x <= 1; x++) {
//                String BB = RAYSA.getRow(y).getCell(x).getStringCellValue();
//                System.out.println(BB);
//            }
//        }    }
    public static void main(String[] args) {


        try {
            FileInputStream Excel = new FileInputStream("Testing1.xlsx");
            //if we did not download the excel sheet we will paste
            //C:\\Users\\fjiaodaiiti\\Documents\\GitHub\\first_Selenium_GS_Final" =>to the ileInputStream
            XSSFWorkbook TestingOne = new XSSFWorkbook(Excel);//we must gave a java file
            XSSFSheet ihtibar = TestingOne.getSheet("IhtibarYasen");
            String AA = ihtibar.getRow(1).getCell(1).getStringCellValue();
            System.out.println(AA);

            int rowNumbers = ihtibar.getLastRowNum();
            System.out.println(rowNumbers);//row counts the index
            int cellNumber = ihtibar.getRow(0).getLastCellNum();
            System.out.println(cellNumber);//cell count the length
            //in order to print all the data
            for (int y = 0; y <= 2; y++) {
                for (int x = 0; x <= 1; x++) {
                    String BB = ihtibar.getRow(y).getCell(x).getStringCellValue();
                    System.out.println(BB);
                }
            }

        } catch (Exception e) {
        }
    }
}
