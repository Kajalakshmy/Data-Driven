package test.Pim;

import org.testng.annotations.Test;
import com.pim.AddEmployeePage;
import utils.TestBase;

public class AddEmployeeTest extends TestBase{

	   @Test
	    public void PimTest(){
	    
		   AddEmployeePage.Clickpim();
//		   AddEmployeePage.ClickAddEmployeePage();
		   AddEmployeePage.setfirstname("Thusi");
		   AddEmployeePage.setmiddlename("Kannan");
		   AddEmployeePage.setlastname("Thusi");
		   AddEmployeePage.setEmployeeId("001");
		   AddEmployeePage.setphotoFile("Thusi");
		   AddEmployeePage.setchklogin("Thusi");
		   AddEmployeePage.setbtnsave("Thusi");
	        System.out.println("Worked");
	       
//	        AddEmployee.ClickSave();


	    }
}
