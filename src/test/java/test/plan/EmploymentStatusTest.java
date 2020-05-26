package test.plan;

import com.pages.DashboardPage;
import com.pages.admin.EmploymentStatus;
import com.pages.admin.PayGrade;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;

public class EmploymentStatusTest  extends TestBase {
    @Test
    public void employeeTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard Page Not Display");
        EmploymentStatus.clickMenuempstatus();
        PageBase.implicitWait(3);
//        softAssert.assertTrue(EmploymentStatus.isHrmEmployeeStatusDisplayed(),"Not show This Page Not Display");
        EmploymentStatus.clickempstatusadd();
        EmploymentStatus.setEmpstatusNmae("Abimaaran");
        EmploymentStatus.clickEmpstatuscancel();
        EmploymentStatus.clickempstatusadd();
        EmploymentStatus.setEmpstatusNmae("Abimaa");
        EmploymentStatus.clickEmpstatussave();
        EmploymentStatus.clickEmpstatuscheck();
        EmploymentStatus.clickEmpstatusdelete();
        EmploymentStatus.clickEmpstatusconfirmdelete();
       softAssert.assertAll();





    }
}




