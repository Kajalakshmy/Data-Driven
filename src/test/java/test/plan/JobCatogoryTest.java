package test.plan;

import com.pages.DashboardPage;
import com.pages.admin.EmploymentStatus;
import com.pages.admin.JobCatogoryPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class JobCatogoryTest extends TestBase {
    @Test
    public void employeeTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard Page Not Display");
        softAssert.assertAll();

        JobCatogoryPage.clickMenuJobcatogory();
        JobCatogoryPage.clickJobcatogoryAdd();
        JobCatogoryPage.setTxtjobcatogoryName("IT");
        JobCatogoryPage.clickJobCatogorycancel();
        JobCatogoryPage.clickJobcatogoryAdd();
        JobCatogoryPage.setTxtjobcatogoryName("IT filed");
        JobCatogoryPage.clickJobcatogorySave();
        JobCatogoryPage.clickJobcatCheck();
        JobCatogoryPage.clickJobCatconfirmdelete();
        JobCatogoryPage.clickEmpstatusdelete();






    }
}


