package test.AdminTest;

import com.pages.admin.UserPage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import test.plan.AddData;
import utils.PageBase;
import utils.TestBase;

public class UserPageTest extends TestBase {

    // admin page
    @Test(priority = 1)
        public void testcase01 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);

            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.setTxtUsername(" ");
            UserPage.clickUserRole();
            UserPage.setUserRole(" ");
            UserPage.setTxtEmployeeName("");
            UserPage.clickStatus();
            UserPage.setStatus(" ");
             /* UserPage.clickSearch();
        UserPage.clickReset();*/

    }

        @Test(priority = 2)
        public void testcase02 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");

            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.setTxtUsername("vinthusha ");
            UserPage.clickUserRole();
            UserPage.setUserRole("Admin ");
            UserPage.setTxtEmployeeName("Dilakshi");
            UserPage.clickStatus();
            UserPage.setStatus(" Enabled");
             /* UserPage.clickSearch();
        UserPage.clickReset();*/

        }
        @Test(priority = 3)
        public void testcase03 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");

            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.setTxtUsername("vinthusha ");
            UserPage.clickUserRole();
            UserPage.setUserRole("Admin ");
            UserPage.setTxtEmployeeName("Dilakshi");
            UserPage.clickStatus();
            UserPage.setStatus(" Disnabled");
              /* UserPage.clickSearch();
        UserPage.clickReset();*/

        }

        @Test(priority = 4)
        public void testcase04 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.setTxtUsername("vinthusha ");
            UserPage.clickUserRole();
            UserPage.setUserRole("ESS ");
            UserPage.setTxtEmployeeName("bala");
            UserPage.clickStatus();
            UserPage.setStatus(" Enabled");
       /* UserPage.clickSearch();
        UserPage.clickReset();*/

        }

        @Test(priority = 5)
        public void testcase05 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.setTxtUsername("vinthusha ");
            UserPage.clickUserRole();
            UserPage.setUserRole("Admin ");
            UserPage.setTxtEmployeeName("Dilakshi");
            UserPage.clickStatus();
            UserPage.setStatus(" Enabled");
         /* UserPage.clickSearch();
        UserPage.clickReset();*/
        }
        @Test(priority = 6)
        public void testcase06 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.setTxtUsername("Nikshala ");
            UserPage.clickUserRole();
            UserPage.setUserRole("ESS ");
            UserPage.setTxtEmployeeName("Banuja");
            UserPage.clickStatus();
            UserPage.setStatus(" Disabled");
         /* UserPage.clickSearch();
        UserPage.clickReset();
        */
        }
// User page add
        @Test(priority = 7)
        public void addtest01 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");

            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            PageBase.implicitWait(20);
            UserPage.clickuserRole();
            UserPage.setuserRole("Admin");
            UserPage.setEmpName("Steven Edwards");
            UserPage.clickstatus();
            UserPage.setstatus("Enabled");
            UserPage.setUname("Nilakshi");
            UserPage.setTxtPassword("gh56ji$#@gh");
            UserPage.setTxtConPassword("gh56ji$#@gh");
            UserPage.clickSave();
        }
        @Test(priority = 8)
        public void addtest02 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");

            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            UserPage.clickuserRole();
            UserPage.setuserRole("Admin");
            UserPage.setEmpName("Robert Craig");
            UserPage.clickstatus();
            UserPage.setstatus("Disabled");
            UserPage.setUname("Nilakshi");
            UserPage.setTxtPassword("gh56ji$#@gh");
            UserPage.setTxtConPassword("gh56ji$#@gh");
            UserPage.clickSave();
        }
        @Test(priority = 9)
        public void addtest03 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            UserPage.clickuserRole();
            UserPage.setuserRole("ESS");
            UserPage.setEmpName("Linda Anderson");
            UserPage.clickstatus();
            UserPage.setstatus("Enabled");
            UserPage.setUname("Nilakshi");
            UserPage.setTxtPassword("gh56ji$#@gh");
            UserPage.setTxtConPassword("gh56ji$#@gh");
            UserPage.clickSave();
        }

        @Test(priority = 10)
        public void addtest04 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            UserPage.clickuserRole();
            UserPage.setuserRole("ESS");
            UserPage.setEmpName("Robert Craig");
            UserPage.clickstatus();
            UserPage.setstatus("Disabled");
            UserPage.setUname("Nilakshi");
            UserPage.setTxtPassword("gh56ji$#@gh");
            UserPage.setTxtConPassword("gh56ji$#@gh");

            UserPage.clickSave();
        }


        // User page delete
        @Test(priority = 11)
        public void addtest05 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            PageBase.implicitWait(20);
            UserPage.clickuserRole();
            UserPage.setuserRole("ESS");
            UserPage.setEmpName("Linda Anderson");
            UserPage.clickstatus();
            UserPage.setstatus("Enabled");
            UserPage.setUname("mathusha");
            UserPage.setTxtPassword("jksjdsd4sxc");
            UserPage.setTxtConPassword("");
            UserPage.clickSave();
        }
        @Test(priority = 12)
        public void addtest06 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            UserPage.clickuserRole();
            UserPage.setuserRole("Admin");
            UserPage.setEmpName("Steven Edwards");
            UserPage.clickstatus();
            UserPage.setstatus("Disabled");
            UserPage.setUname("Nilakshi");
            UserPage.setTxtPassword("gh56ji$#@gh");
            UserPage.setTxtConPassword("bbvdjjb45");
            UserPage.clickSave();
        }
        @Test(priority = 13)
        public void addtest07 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            UserPage.clickuserRole();
            UserPage.setuserRole("Admin");
            UserPage.setEmpName("Steven Edwards");
            UserPage.clickstatus();
            UserPage.setstatus("Disabled");
            UserPage.setUname("Nilakshi");
            UserPage.setTxtPassword("");
            UserPage.setTxtConPassword("bbvdjjb45");
            UserPage.clickSave();
        }
        @Test(priority = 14)
        public void addtest08 () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.clickAdmin();
            UserPage.clickUserManagement();
            UserPage.clickUser();
            PageBase.implicitWait(20);
            UserPage.clickAdd();
            UserPage.clickuserRole();
            UserPage.setuserRole("Admin");
            UserPage.setEmpName("Steven Edwards");
            UserPage.clickstatus();
            UserPage.setstatus("Disabled");
            UserPage.setUname("Nilakshi");
            UserPage.setTxtPassword("");
            UserPage.setTxtConPassword("");
            UserPage.clickSave();
        }
       /* @Test(priority = 15)
        public void delete () {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
            PageBase.implicitWait(20);
            UserPage.tikcheckbox();
            UserPage.clickDelete();
            UserPage.clickOkbtn();
        }*/
// -------------------------------------Data Driven ------------------------------------------------

    @Test(priority = 111,dataProviderClass = AddData.class,dataProvider = "AddTestData")
         public void AddUserData(String Empname, String Uname, String Password, String ConPassword){
//            SoftAssert softAssert = new SoftAssert();
//            softAssert.assertTrue(UserPage.isHrmUserPageDisplayed(), "HrmUser Page Not Display");
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
//          softAssert.assertAll();
    }

}