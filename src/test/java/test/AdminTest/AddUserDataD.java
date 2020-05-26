package test.AdminTest;

import com.pages.admin.UserPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import test.plan.AddData;
import utils.PageBase;
import utils.TestBase;

public class AddUserDataD extends TestBase {
    @Test(priority = 111,dataProviderClass = AddData.class,dataProvider = "AddTestData")
    public void addPagedata(String Empname, String Uname, String Password, String ConPassword){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
        PageBase.implicitWait(20);
        UserPage.clickAdmin();
        PageBase.implicitWait(20);
        UserPage.clickUserManagement();
        PageBase.implicitWait(20);
        UserPage.clickUser();
        PageBase.implicitWait(20);
        UserPage.clickAdd();
        PageBase.implicitWait(20);
        UserPage.setEmpName(Empname);
        UserPage.setUname(Uname);
        UserPage.setTxtPassword(Password);
        UserPage.setTxtConPassword(ConPassword);
        UserPage.clickSave();
    }
}
