package test.plan;

import org.testng.annotations.Test;

import com.pages.EmployeePage;
import com.pages.LoginPage;

import utils.PageBase;
import utils.TestBase;

public class EmployeeListTest extends TestBase {
	
	@Test
	public void EmployeeListTest(){
		LoginPage.setUserName("Admin");
		LoginPage.setPass("admin123");
		LoginPage.ClickLogin();
		PageBase.implicitWait(3);
		EmployeePage.clickPim();
		EmployeePage.clickEmployeeLink();
		EmployeePage.setEmpname("Linda Anderson");
		EmployeePage.setEmpid("001");
		EmployeePage.setEmpstatus("Freelance");
		//EmployeeList.setInclude("");
//		EmployeeList.setsupervisor_name("");
//		EmployeeList.setjob_title("");
//		EmployeeList.setsub_unit("");
//        EmployeeList.ClickSearch();
//      EmployeeList.ClickReset();
}
}

