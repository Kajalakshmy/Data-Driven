package test.PIM;

import org.testng.annotations.DataProvider;

import utils.ExcelDataConfig;

public class Empdata extends  ExcelDataConfig {
	// private static final Logger LOGGER = Logger.getLogger( ExcelDataConfig.class);
	    public Empdata () {
	        super("src/test/resources/ExcelSheet/Login.xlsx");
	    }
	    @DataProvider(name = "EmpDataTest")
	    public Object[][] EmpDataTest() {

	        int rows = getRowCount("Empdata");
	        int col = getColumnCount("Empdata");

	      //  LOGGER.info("row = "+ rows + " columns = "+ col);
	        System.out.println("row = "+ rows + " columns = "+ col);

	        Object[][] data = new Object[rows][col];
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 0; j < col; j++) {
	                data[i - 1][j] = getData("Empdata", i, j);
	            }
	        }
	        return data;
	    }
	}

