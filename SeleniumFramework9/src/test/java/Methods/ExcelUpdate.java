package Methods;


	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUpdate {

	    public static void main(String[] args) {

	        String filePath = "C:\\Selenium\\DemoWebShop1\\DemoWebShop1\\SeleniumFramework9\\Excels\\DataSheet5.xlsx";

	        try {
	            // Open existing workbook
	            FileInputStream fis = new FileInputStream(filePath);
	            XSSFWorkbook workbook = new XSSFWorkbook(fis);

	            XSSFSheet sheet = workbook.getSheet("Sheet1");

	            // Find next available row
	            int lastRowNum = sheet.getLastRowNum();
	            Row row = sheet.createRow(lastRowNum + 1);

	            // Add data
	            row.createCell(0).setCellValue("John");
	            row.createCell(1).setCellValue("Developer");
	            row.createCell(2).setCellValue("New York");

	            fis.close();

	            // Save changes
	            FileOutputStream fos = new FileOutputStream(filePath);
	            workbook.write(fos);

	            fos.close();
	            workbook.close();

	            System.out.println("Data appended successfully.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

