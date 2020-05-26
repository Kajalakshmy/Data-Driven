package test.plan;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddData extends ExcelDataConfig {
    //  private static final Logger LOGGER = Logger.getLogger(LoginData.class);
    public AddData () {
        super("src/test/resources/ExcelSheet/Login.xlsx");
    }
    @DataProvider(name = "AddTestData")
    public Object[][] AddTestData() {

        int rows = getRowCount("AddData");
        int col = getColumnCount("AddData");

        //  LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddData", i, j);
            }
        }
        return data;
    }
}
