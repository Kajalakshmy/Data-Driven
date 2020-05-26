package test.plan;

import com.pages.DashboardPage;
import com.pages.admin.EmploymentStatus;
import com.pages.admin.WorkShitsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class WorkShiftTest extends TestBase {

    @Test
    public void wrkShiftTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard Page Not Display");
        softAssert.assertAll();

        WorkShitsPage.clickMenuWorkShift();
        WorkShitsPage.clickWorkShiftAdd();
        WorkShitsPage.setWorkShiftname("Day time");
        WorkShitsPage.clickWorkFrom();
        WorkShitsPage.selectedtWorkFrom("08:00");
        WorkShitsPage.clickWorkTo();
        WorkShitsPage.selectedWorkTo("14:00");
        WorkShitsPage.setTimeDuration("6");
        WorkShitsPage.setAvailableEmployeeone("Hannah Flore");
        WorkShitsPage.setAvailableEmployeetwo("Jasmine Morgan");
        WorkShitsPage.setAvailableEmployeeThree("Steven Edwards");
        WorkShitsPage.setAvailableEmployeeFour("Linda Anderson");
        WorkShitsPage.clickAdavilableemployee();
        WorkShitsPage.clickAvailableEmployeeFour();
        WorkShitsPage.clickAdavilableemployeeRemove();
        WorkShitsPage.clickSaveWorkshift();

        WorkShitsPage.clickWorkShiftcheck();
        WorkShitsPage.clickWrkshiftinfodel();
        WorkShitsPage.clickWrkshiftconfirmdelete();






    }
}
