package pom;
import java.io.IOException;
import org.testng.annotations.DataProvider;


public class SpecificMethod {
	
	public String excelFile;

    @DataProvider(name = "fetchData")
    public Object[][] getData() throws IOException {
        String[][] readData = ReadData.readData(excelFile);
        Object[][] data = new Object[1][1];
        data[0][0] = readData; 

        return data;
    }
}
