package com.pim;

import org.openqa.selenium.By;

import java.util.logging.Logger;

import static utils.PageBase.getDriver;

public class AddEmployee {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddEmployee.class));
    private static By MenuPim = By.id("menu_pim_viewPimModule");
    private static By Addemployee= By.id("menu_pim_addEmployee");
    private static By FirstName = By.id("firstName");
    private static By MiddleName = By.id("middleName");
    private static By LastName = By.id("lastName");
    private static By EmployeeId = By.id("employeeId");
    private static By Photofile = By.id("photofile");
    private static By ChkLogin = By.id("chkLogin");
    private static By BtnSave = By.id("btnSave");

    public static void clickMenuPim() {
        getDriver().findElement(MenuPim).click();
        LOGGER.info("clicked PIM");
    }

    public static void clickAddemployee() {
        getDriver().findElement(Addemployee).click();
        LOGGER.info("clicked on employee details");
    }

    public static void setFirstName(String firstNames) {
        getDriver().findElement(FirstName).sendKeys(firstNames);
        LOGGER.info("Entered FirstName");
    }

    public static void setMiddleName(String middleNames) {
        getDriver().findElement(MiddleName).sendKeys(middleNames);
        LOGGER.info("Entered MiddleName");

    }

    public static void setLastName(String lastNames) {
        getDriver().findElement(LastName).sendKeys(lastNames);
        LOGGER.info("Entered LastName");

    }

    public static void setEmployeeId(String EmployeeIds) {
        getDriver().findElement(EmployeeId).sendKeys(EmployeeIds);
        LOGGER.info("Entered LastName");

    }

    public static void setPhotofile(String photofiles) {
        getDriver().findElement(Photofile).sendKeys(photofiles);
        LOGGER.info("Entered LastName");

    }

    public static void setClickLogin() {
        getDriver().findElement(ChkLogin).click();
        LOGGER.info("Entered LastName");

    }

    public static void setClickSave() {
        getDriver().findElement(BtnSave).click();
        LOGGER.info("Entered LastName");

    }



}
