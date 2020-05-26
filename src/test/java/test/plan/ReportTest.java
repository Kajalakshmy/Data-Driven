package test.plan;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pim.ReportPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class ReportTest extends TestBase {
    @Test
    public void ReportTest(){
    
    	ReportPage.Clickpim();
    	ReportPage.ClickReportPage();
        ReportPage.setUsername("Thusi");
        ReportPage.setSearchbtn("Thusi");
        ReportPage.setReset("Thusi");
        System.out.println("Worked");
       
//        AddEmployee.ClickSave();


    }
}