package com.pages.admin;
import org.openqa.selenium.By;
import utils.PageBase;
import java.util.logging.Logger;


public class UserPage  extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(UserPage.class));
    //------------------------------------------------
    private static By Admin = By.id("menu_admin_viewAdminModule");
    private static By UserManagement= By.id("menu_admin_UserManagement");
    private static By User = By.id("menu_admin_viewSystemUsers");
    //  private static By SystemUserHeader = By.id("//*[@id=\"systemUser-information\"]/a");

    // ----------------------- User page -------------------------------
    private static By TxtUsername    = By.id("searchSystemUser_userName");
    private static By UserRole       = By.id("searchSystemUser_userType");
    private static By TxtEmployeeName= By.id("searchSystemUser_employeeName_empName");
    private static By Status         = By.id("searchSystemUser_status");

    private static By btnSearch =By.id("searchBtn");
    private static By btnReset =By.id("resetBtn");

    private static By btnAdd =By.id("btnAdd");
    private static By checkbox = By.id("ohrmList_chkSelectRecord_6");
    private static By btnDelete = By.id("btnDelete");
    private static By btnok = By.id("dialogDeleteBtn");

    //-------------------------- Add user -----------------------------
    private static By TxtUserrole = By.id("systemUser_userType");
    private static By TxtEmpName  = By.id("systemUser_employeeName_empName");
    private static By TxtUname    = By.id("systemUser_userName");
    private static By clickstatus = By.id("systemUser_status");
    private static By TxtPassword = By.id("systemUser_password");
    private static By TxtConPassword = By.id("systemUser_confirmPassword");
    private static By btnclickSave   = By.id("btnSave");



    public static void clickAdmin() {
        getDriver().findElement(Admin).click();
        LOGGER.info("click admin tab ");
    }
    public static void clickUserManagement() {
        getDriver().findElement(UserManagement).click();
        LOGGER.info("click user management tab ");
    }
    public static void clickUser() {
        getDriver().findElement(User).click();
        LOGGER.info("click user tab ");
    }


    public static void setTxtUsername(String username) {
        getDriver().findElement(TxtUsername).sendKeys(username);
        LOGGER.info("pass user name ");
    }
    public static void clickUserRole() {
        getDriver().findElement(UserRole).click();
        LOGGER.info("click user role ");
    }
    public static void setUserRole(String userRole) {
        getDriver().findElement(UserRole).sendKeys(userRole);
        LOGGER.info("pass user role ");
    }
    public static void setTxtEmployeeName(String name) {
        getDriver().findElement(TxtEmployeeName).sendKeys(name);
        LOGGER.info("pass employee name ");
    }
    public static void clickStatus() {
        getDriver().findElement(Status).click();
        LOGGER.info("click status ");
    }
    public static void setStatus(String status) {
        getDriver().findElement(Status).sendKeys(status);
        LOGGER.info("pass status ");
    }


    public static void clickSearch() {
        getDriver().findElement(btnSearch).click();
        LOGGER.info("click search button ");
    }
    public static void clickReset() {
        getDriver().findElement(btnReset).click();
        LOGGER.info("click reset button ");
    }

    public static void clickAdd() {
        getDriver().findElement(btnAdd).click();
        LOGGER.info("click add button ");
    }
  /*  public static void wait(int seconds){
        PageBase.implicitWait(seconds);
    }*/
    public static void clickuserRole() {
        getDriver().findElement(TxtUserrole).click();
        LOGGER.info("click user role ");
    }
    public static void setuserRole(String userRole) {
        getDriver().findElement(TxtUserrole).sendKeys(userRole);
        LOGGER.info("set user role ");
    }
    public static void setEmpName(String empName) {
        getDriver().findElement(TxtEmpName).sendKeys( empName);
        LOGGER.info("pass emp name ");
    }
    public static void clickstatus() {
        getDriver().findElement(clickstatus).click();
        LOGGER.info("click status");

    }
    public static void setstatus(String status) {
        getDriver().findElement(clickstatus).sendKeys(status);
        LOGGER.info("pass status");
    }
    public static void setUname(String Uname) {
        getDriver().findElement(TxtUname).sendKeys(Uname);
        LOGGER.info("pass uname ");
    }
    public static void setTxtPassword(String password) {
        getDriver().findElement(TxtPassword).sendKeys(password);
        LOGGER.info("pass password ");
    }
    public static void  setTxtConPassword(String conpassword) {
        getDriver().findElement(TxtConPassword).sendKeys(conpassword);
        LOGGER.info("pass conform password ");
    }

    public static void clickSave() {
        getDriver().findElement(btnclickSave).click();
        LOGGER.info("click save button ");
    }
    public static void tikcheckbox(){
        getDriver().findElement(checkbox).click();
        LOGGER.info("click textbox ");
    }
    public static void clickDelete(){ // delete method
        getDriver().findElement(btnDelete).click();
        LOGGER.info("delete button ");
    }
    public static void clickOkbtn(){
        getDriver().findElement(btnok).click();
        LOGGER.info("click ok button ");
    }

    public static boolean isHrmUserPageDisplayed() {
        return true;
    }

    public static boolean isHrmAdminPageDisplayed() {
        return true;
    }
}

