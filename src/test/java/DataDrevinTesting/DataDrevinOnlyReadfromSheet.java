package DataDrevinTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrevinOnlyReadfromSheet {

    public static void main(String[] args) {
        
        XSSFWorkbook ExcelWBook = null;
        XSSFSheet ExcelWSheet;
        XSSFRow Row;
        XSSFCell Cell;
        
        // Create an object of file class to open the Excel file
        File excelFile = new File("C:\\Book1DataDraven.xlsx"); // Ensure this path is correct
        FileInputStream inputStream = null;
        
        try {
            // Load the Excel file into FileInputStream
            inputStream = new FileInputStream(excelFile);
            
            // Create an instance of XSSFWorkbook to work with .xlsx files
            ExcelWBook = new XSSFWorkbook(inputStream);
            
            // Get the first sheet from the workbook
            ExcelWSheet = ExcelWBook.getSheetAt(0);
            
            // Iterate through the rows and columns to print data
            for (int i = 0; i < ExcelWSheet.getPhysicalNumberOfRows(); i++) {
                Row = ExcelWSheet.getRow(i); // Get the row at index 'i'
                
                for (int j = 0; j < Row.getPhysicalNumberOfCells(); j++) {
                    Cell = Row.getCell(j); // Get the cell at index 'j'
                    
                    // Print each cell value
                    System.out.print(Cell.toString() + "\t");
                }
                
                // Print a new line after each row
                System.out.println();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the workbook and input stream in the 'finally' block to ensure they are closed
            try {
                if (ExcelWBook != null) {
                    ExcelWBook.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
