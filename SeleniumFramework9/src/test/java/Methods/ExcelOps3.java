package Methods;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import java.util.Iterator;


public class ExcelOps3 {  
        public static void main(String[] args) throws Exception{
        	
        		String path = System.getProperty("user.dir");
                 
                FileInputStream fsIP= new FileInputStream(new File(path+"\\Excels\\DataSheet4.xlsx")); //Read the spreadsheet that needs to be updated
                  
                XSSFWorkbook wb = new XSSFWorkbook(fsIP); //Access the workbook
                  
                XSSFSheet worksheet = wb.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
                  
                Cell cell = null; // declare a Cell object
                
                cell = worksheet.getRow(1).getCell(0);   // Access the second cell in second row to update the value
                  
                cell.setCellValue("0001");  // Get current cell value value and overwrite the value
                  
                
cell=worksheet.getRow(0).createCell(5); 
//Set Result is pass in that cell number
cell.setCellValue("Produc-export");
                cell=worksheet.getRow(1).createCell(5); 
//Set Result is pass in that cell number
cell.setCellValue("yes");
                
                cell = worksheet.getRow(1).getCell(1);
                
                cell.setCellValue("pants");
                
                
                cell = worksheet.getRow(1).getCell(2);
                
                cell.setCellValue("pants-description");
                
                cell = worksheet.getRow(1).getCell(3);
                
                cell.setCellValue("pants-sku009");
                
                cell = worksheet.getRow(1).getCell(4);
                
                cell.setCellValue("pantstype");
                
                fsIP.close(); //Close the InputStream
                 
                FileOutputStream output_file =new FileOutputStream(new File(path+"\\Excels\\DataSheet4.xlsx"));  //Open FileOutputStream to write updates
                  
                wb.write(output_file); //write changes
                  
                output_file.close();  //close the stream    
        }
}
