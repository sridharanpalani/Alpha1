package pom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static String[][] readData(String filename) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook("./Data/" + filename + ".xlsx");
        XSSFSheet ws = wb.getSheetAt(0);

        int rowcount = ws.getLastRowNum() + 1; // Include header row
        short columncount = ws.getRow(0).getLastCellNum();
        String[][] data = new String[rowcount][columncount];

        for (int i = 0; i < rowcount; i++) { // Start from 0 to include headers
            XSSFRow row = ws.getRow(i);
            for (int j = 0; j < columncount; j++) {
                XSSFCell cell = row.getCell(j);
                data[i][j] = (cell != null) ? cell.getStringCellValue() : null; // Handle null cells
            }
        }
        wb.close();
        return data;
    }

}
