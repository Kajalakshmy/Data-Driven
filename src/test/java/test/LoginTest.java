package test;

import com.pages.DashboardPage;


import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;


import com.pages.admin.HrmJob;
import com.pages.admin.LoginPage;

import utils.TestBase;

import java.util.logging.Logger;


public class LoginTest extends TestBase {


    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginTest.class));

    @Test(priority = 1,dataProviderClass = LoginData.class, dataProvider = "LoginTestData")
    public void LoginTest(String username,String Password) {
        softAssert = new SoftAssert();

        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "Hrm Login Page Not Display");
        LoginPage.setUserName(username);
        LoginPage.setPass(Password);
        LoginPage.ClickLogin();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard Page Not Display");
        softAssert.assertAll();
    }
    @Test(priority = 122)
    public void LoginTestcaseone() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");

        LoginPage.setUserName("");
        LoginPage.setPass("");
        LoginPage.ClickLogin();
        LOGGER.info("Entered the user name and password in fields ");
    }


    @Test(priority = 2)
    public void LoginTestcasetwo() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");

        LoginPage.setUserName("");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        LOGGER.info("Entered the user name ");
    }

    @Test(priority = 3)
    public void LoginTestcasethree() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");

        LoginPage.setUserName("");
        LoginPage.setPass("656+0");
        LoginPage.ClickLogin();
        LOGGER.info("Entered the user name and password ");
    }

    @Test(priority = 4)
    public void LoginTestcasefour() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");

        LoginPage.setUserName("jkllhgfd");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        LOGGER.info("Entered the user name and password ");
    }


    @Test(priority = 4)
    public void LoginTestcasefive() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");

        LoginPage.setUserName("Admin");
        LoginPage.setPass("jkkk");
        LoginPage.ClickLogin();
        LOGGER.info("Entered the valid password ");
    }


    @Test(priority = 5)
    public void LoginTestcasesix() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");

        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        LOGGER.info("Entered the valid password ");
    }


   /* @Test(priority = 2)
        public void HrmTest () {
            softAssert = new SoftAssert();


            HrmJob.clickAdminPanel();
            HrmJob.clickJobTab();
            //AdminPage.implicitWait(3000);
            HrmJob.clickJobTitles();
            HrmJob.clickButAdd();
            HrmJob.setjobtitle("scientist");
            HrmJob.setJobdesc("do practical");
            HrmJob.chooseJobSpeci("Desktop/New Text Document.txt");
            HrmJob.setNote("Noted their wrk");
            HrmJob.clickJobSave();

            // Login Panel Test


//       softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(),"HrmLogin Page Not Display") ;
//        LoginPage.setUserName("Admin");
//        LoginPage.setPass("admin123");
//        LoginPage.ClickLogin();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"Hrm Dashboard Page Not Display") ;
        softAssert.assertAll();




            // AdminPage.isAdminPageHeaderDisplayed();
            // softAssert.assertAll();
            // Company General Information Test*/


        }



