package test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.admin.UserPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class PageLogin extends TestBase {

    @Test(priority = 1)
    public void sucessfullLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not Display");
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");

    }
    @Test(priority = 2)
    public void rightUserNameWrongPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not  Display");
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin");

    }
    @Test(priority = 3)
    public void rightUserNameBlankPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not Display");
        LoginPage.setUserName("Admin");
        LoginPage.setPass("");

    }
    @Test(priority = 4)
    public void wrongUserNameRightPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not Display");
        LoginPage.setUserName("adminyhu");
        LoginPage.setPass("admin123");

    }
    @Test(priority = 5)
    public void wrongUserNameWrongPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not  Display");
        LoginPage.setUserName("adminfgh");
        LoginPage.setPass("admin569");

    }
    @Test(priority = 6)
    public void wrongUserNameBlankPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not Display");
        LoginPage.setUserName("dbjfbvdjv");
        LoginPage.setPass(" ");

    }

    @Test(priority = 7)
    public void blankUserNameRightPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Display");
        LoginPage.setUserName(" ");
        LoginPage.setPass("admin123");

    }
    @Test(priority = 8)
    public void blankUserNameWrongPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not  Display");
        LoginPage.setUserName(" ");
        LoginPage.setPass("admin896");

    }
    @Test(priority = 9)
    public void blankUserNameBlankPasswordLoginTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmAdminPageDisplayed(), "HrmAdmin Page Not Display");
        LoginPage.setUserName(" ");
        LoginPage.setPass(" ");

    }
}
