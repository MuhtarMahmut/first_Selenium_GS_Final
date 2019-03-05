package File_Handilings;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExelFile_Handiling {
    public static void main(String[] args) throws Exception {


        //DDT=> data-driven testing -> it will test multiple data (uses xal)
        //BDT=> behaviour-driven testing -> we will write scenario using this (in cucumber)
        //BDD => Behavior-driven development
        FileInputStream excel = new FileInputStream("/Users/zuhrajawdat/Desktop/Testing1.xlsx");
        XSSFWorkbook Testing1 = new XSSFWorkbook(excel);
        XSSFSheet Zuhra = Testing1.getSheet("Zuhra");
       String AA = Zuhra.getRow(1).getCell(1).getStringCellValue();
        System.out.println(AA);

        int rowNumbers = Zuhra.getLastRowNum();
        System.out.println(rowNumbers);
        int cellNumbers1 = Zuhra.getRow(2).getLastCellNum();
        //it will find where it end at the end
        System.out.println(cellNumbers1);

        for(int y=0; y <= rowNumbers; y++){
            for (int x=0; x < Zuhra.getRow(y).getLastCellNum(); x++){
                String BB = Zuhra.getRow(y).getCell(x).getStringCellValue();
                System.out.println(BB);
            }
        }




    }
}