package test.plan;

import com.pages.DashboardPage;
import com.pages.admin.PayGrade;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class PayGradeTestPage  extends TestBase {
    @Test
    public void LoginTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard Page Not Display");
        softAssert.assertAll();

        PayGrade.clickMenuPaygrade();
        PayGrade.clickPayAdd();
        PayGrade.setPayTxtName("Athu");
        PayGrade.clickPaySave();
        PayGrade.clickPayAddCurr();
        PayGrade.setPayTxtCurname("LKR - Sri Lanka Rupee");
        PayGrade.setPayTxtcurmin("4500");
        PayGrade.setPayTxtcurmax("15000");
        PayGrade.clickPaycursave();
        PayGrade.clickcheckcurrencydetail();
        PayGrade.clickdeltecurrency();




    }
}
