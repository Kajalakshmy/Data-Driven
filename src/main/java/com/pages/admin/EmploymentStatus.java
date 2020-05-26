package com.pages.admin;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class EmploymentStatus extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGrade.class));
    private static By Menuemploymentstatus = By.id("menu_admin_employmentStatus");
    private static By Butempstatusadd = By.id("btnAdd");
    private static By Txtemplostatusname = By.id("empStatus_name");
    private static By Butempstatcancel = By.id("btnCancel");
    private static By Butempstatussave = By.id("btnSave");
    private static By CheckEmploymentsatus = By.id("ohrmList_chkSelectRecord_8");
    private static By Butempstatusdelete = By.id("btnDelete");
    private static By ConfirmDelete = By.id("dialogDeleteBtn");
    private static By EmploymentStatusHr = By.xpath("//*[@id=\"search-results\"]/div[1]/h1");


    public static boolean isHrmEmployeeStatusDisplayed() {
        return getDriver().findElement(EmploymentStatusHr).isDisplayed();

    }

    public static void clickMenuempstatus() {
        getDriver().findElement(Menuemploymentstatus).click();
        LOGGER.info("Clicked on the Menu employment status ");


    }

    public static void clickempstatusadd() {
        getDriver().findElement(Butempstatusadd).click();
        LOGGER.info("Clicked on the add button ");


    }


    public static void setEmpstatusNmae(String empstatusnamee) {
        getDriver().findElement(Txtemplostatusname).sendKeys(empstatusnamee);
        LOGGER.info("Entered the employee status name");


    }


    public static void clickEmpstatuscancel() {
        getDriver().findElement(Butempstatcancel).click();
        LOGGER.info("Clicked on the Employee status cancel ");


    }
    public static void clickEmpstatussave() {
        getDriver().findElement(Butempstatussave).click();
        LOGGER.info("Clicked on the Employee status save ");


    }
    public static void clickEmpstatuscheck() {
        getDriver().findElement(CheckEmploymentsatus).click();
        LOGGER.info("Clicked on the Employee status selected check box ");


    }
    public static void clickEmpstatusdelete() {
        getDriver().findElement(Butempstatusdelete).click();
        LOGGER.info("Clicked on the Employee status delete ");


    }

    public static void clickEmpstatusconfirmdelete() {
        getDriver().findElement(ConfirmDelete).click();
        LOGGER.info("Clicked on the Employee status Confirm dialogbox ");


    }



}
