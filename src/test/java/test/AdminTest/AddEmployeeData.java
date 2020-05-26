package test.AdminTest;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class AddEmployeeData extends ExcelDataConfig {



        //  private static final Logger LOGGER = Logger.getLogger(LoginData.class);
        public AddEmployeeData () {
            super("src/test/resources/ExcelSheet/AddJobTitle.xlsx");
        }
        @DataProvider(name = "AddEmpTestData")
        public Object[][] AddEmpTestData() {

            int rows = getRowCount("empdetail");
            int col = getColumnCount("empdetail");

            //  LOGGER.info("row = "+ rows + " columns = "+ col);
            System.out.println("row = "+ rows + " columns = "+ col);

            Object[][] data = new Object[rows][col];
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < col; j++) {
                    data[i - 1][j] = getData("empdetail", i, j);
                }
            }
            return data;
        }
    }

