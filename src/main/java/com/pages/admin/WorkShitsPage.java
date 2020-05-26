package com.pages.admin;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class WorkShitsPage  extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGrade.class));
    private static By MenuWorkShift = By.id("menu_admin_workShift");
    private static By ButWorkShiftyAdd = By.id("btnAdd");

    private static By TxtWorkshiftname = By.id("workShift_name");
    private static By TxtWorkshifthoursfrom = By.id("workShift_workHours_from");
    private static By TxtWorkshifthoursTo = By.id("workShift_workHours_to");
    private static By TxtWokshiftDuration = By.id("time_range_duration ");
    private static By DropAvilableEmployeeone = By.id("Hannah Flores");
    private static By DropAvilableEmployeeTwo = By.id("Jasmine Morgan");
    private static By DropAvilableEmployeeThree = By.id("Steven Edwards");

    private static By DropAvilableEmployeeFour= By.id("Linda Anderson");

    private static By ButAssignEmployee = By.id("btnAssignEmployee");

    private static By ButRmeoveEmployee= By.id("btnRemoveEmployee");

    private static By ButWorkshiftsave = By.id("btnSave");
    private static By CheckWkshift = By.id("ohrmList_chkSelectRecord_3");
    private static By ButWrkShiftdel = By.id("btnDelete");
    private static By ConfirmdialWrkShift = By.id("dialogDeleteBtn");












    public static void clickMenuWorkShift() {
        getDriver().findElement(MenuWorkShift).click();
        LOGGER.info("Clicked on the Menu Work Shift ");


    }

    public static void clickWorkShiftAdd() {
        getDriver().findElement(ButWorkShiftyAdd).click();
        LOGGER.info("Clicked on the Work Shift add ");


    }

    public static void setWorkShiftname(String workShiftname) {
        getDriver().findElement(TxtWorkshiftname).sendKeys();
        LOGGER.info("Entered the work shift name");


    }

    public static void clickWorkFrom() {
        getDriver().findElement(TxtWorkshifthoursfrom).click();
        LOGGER.info("clicked the work shift from");


    }


    public static void selectedtWorkFrom(String wrkfrom) {
        getDriver().findElement(TxtWorkshifthoursfrom).sendKeys(wrkfrom);
        LOGGER.info("Entered the work shift from");


    }

    public static void clickWorkTo() {
        getDriver().findElement(TxtWorkshifthoursTo).click();
        LOGGER.info("clicked the work shift To");


    }


    public static void selectedWorkTo(String wrkto) {
        getDriver().findElement(TxtWorkshifthoursTo).sendKeys(wrkto);
        LOGGER.info("Entered the work shift To");


    }

    public static void setTimeDuration(String duration) {
        getDriver().findElement(TxtWokshiftDuration).sendKeys(duration);
        LOGGER.info("Entered the work shift Duration");


    }

    public static void setAvailableEmployeeone(String empone) {
        getDriver().findElement(DropAvilableEmployeeone).sendKeys(empone);
        LOGGER.info("Entered the employee one");


    }

    public static void setAvailableEmployeetwo(String emptwo) {
        getDriver().findElement(DropAvilableEmployeeTwo).sendKeys(emptwo);
        LOGGER.info("Entered the employee two");


    }

    public static void setAvailableEmployeeThree(String empthree) {
        getDriver().findElement(DropAvilableEmployeeThree).sendKeys(empthree);
        LOGGER.info("Entered the employee three");


    }

    public static void setAvailableEmployeeFour(String empfour) {
        getDriver().findElement(DropAvilableEmployeeFour).sendKeys(empfour);
        LOGGER.info("Entered the employee four");


    }

    public static void clickAvailableEmployeeFour() {
        getDriver().findElement(DropAvilableEmployeeFour).click();
        LOGGER.info("Removed the employee four");


    }

    public static void clickAdavilableemployee() {
        getDriver().findElement(ButWorkShiftyAdd).click();
        LOGGER.info("clicked the work shift ADD");


    }

    public static void clickAdavilableemployeeRemove() {
        getDriver().findElement(ButRmeoveEmployee).click();
        LOGGER.info("clicked the work shift Remove");


    }

    public static void clickSaveWorkshift() {
        getDriver().findElement(ButWorkshiftsave).click();
        LOGGER.info("clicked the work shift Save");


    }




    public static void clickWorkShiftcheck() {
        getDriver().findElement(CheckWkshift).click();
        LOGGER.info("Clicked on the work shift check box ");


    }
    public static void clickWrkshiftinfodel() {
        getDriver().findElement(ButWrkShiftdel).click();
        LOGGER.info("Clicked on the work shift  delete ");


    }

    public static void clickWrkshiftconfirmdelete() {
        getDriver().findElement(ConfirmdialWrkShift).click();
        LOGGER.info("Clicked on the Work shift  Confirm dialogbox ");


    }








}





