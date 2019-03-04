package File_Handlings;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelFile_Handlings {
    public static void main(String[] args) throws Exception{

        FileInputStream excel = new FileInputStream("Testing1.xlsx");

        XSSFWorkbook Testing1=new XSSFWorkbook(excel);

        XSSFSheet Muhtar=Testing1.getSheet("Muhtar");
       String AA = Muhtar.getRow(1).getCell(1).getStringCellValue();
        System.out.println(AA);

        int rownumbers=Muhtar.getLastRowNum();
        System.out.println(rownumbers);
        int cellnumbers1=Muhtar.getRow(0).getLastCellNum();
                // this will return the total cells at first row only!
        System.out.println(cellnumbers1);

        // in order to print all the datas in excel.
        for(int y=0; y<=rownumbers; y++){
            for (int x=0; x<Muhtar.getRow(y).getLastCellNum(); x++){
                String BB = Muhtar.getRow(y).getCell(x).getStringCellValue();
                System.out.println(BB);
            }

        }


    }
}
