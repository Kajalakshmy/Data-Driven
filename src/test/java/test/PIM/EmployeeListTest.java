package test.PIM;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.DashboardPage;
import com.pages.EmployeePage;
import com.pages.LoginPage;

import test.LoginData;
import utils.PageBase;
import utils.TestBase;

public class EmployeeListTest extends TestBase {
	
		  @Test(priority = 1)		 
		  public void EmployeeListTest() {
		        

		softAssert = new SoftAssert();
	    softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(),"Hrm login not disply");

		LoginPage.setUserName("Admin");
		LoginPage.setPass("admin123");
		LoginPage.ClickLogin();
		PageBase.implicitWait(3);
		EmployeePage.clickPim();
		softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"hrm Login page is not display");
		EmployeePage.clickEmployeeLink();
		EmployeePage.setEmpname("Linda Anderson");
		EmployeePage.setEmpid("001");
		EmployeePage.setEmpstatus("Freelance");
		//EmployeeList.setInclude("");
		EmployeePage.setsupervisor_name("");
//		EmployeeList.setjob_title("");
//		EmployeeList.setsub_unit("");
//        EmployeeList.ClickSearch();
//      EmployeeList.ClickReset();
}
		  
		   @Test(priority = 2, dataProviderClass =Empdata.class,dataProvider = "EmployeeListTest")
			public void EmployeeListTest(String empname, String empid, String superviocername){
			   //	SoftAssert softAssert = new SoftAssert();
			   	//softAssert.assertTrue(EmployeePage.isHrmUserPageDisplayed(), "HrmDashboard Page Not Display");
			   EmployeePage.setEmpname(empname);
				EmployeePage.setEmpid(empid);
				EmployeePage.setsupervisor_name(superviocername);


					//softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"Hrm Page is Not Display");
					//softAssert.assertAll();
				}
}

