package com.pages.admin;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class JobCatogoryPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGrade.class));
    private static By MenuJobcatogory = By.id("menu_admin_jobCategory");
    private static By ButJobCatogoryAdd = By.id("btnAdd");
    private static By TxtJobCatogoryName = By.id("jobCategory_name");
    private static By ButJobCatogoryCancel = By.id("btnCancel");
    private static By ButJobCatogorySave = By.id("btnSave");
    private static By CheckJobCatogory = By.id("ohrmList_chkSelectRecord_9");
    private static By ButJobCatogoryDelete = By.id("btnDelete");
    private static By JobcatConfirmDelete = By.id("dialogDeleteBtn");



    public static void clickMenuJobcatogory() {
        getDriver().findElement(MenuJobcatogory).click();
        LOGGER.info("Clicked on the Menu Job Catogory ");


    }

    public static void clickJobcatogoryAdd() {
        getDriver().findElement(ButJobCatogoryAdd).click();
        LOGGER.info("Clicked on the Job catogory add ");


    }

    public static void setTxtjobcatogoryName(String jobcatname) {
        getDriver().findElement(TxtJobCatogoryName).sendKeys();
        LOGGER.info("Entered the job catogory Name");


    }




    public static void clickJobCatogorycancel() {
        getDriver().findElement(ButJobCatogoryCancel).click();
        LOGGER.info("Clicked on the Job catogory cancel ");


    }
    public static void clickJobcatogorySave() {
        getDriver().findElement(ButJobCatogorySave).click();
        LOGGER.info("Clicked on the Job catogory save ");


    }
    public static void clickJobcatCheck() {
        getDriver().findElement(CheckJobCatogory).click();
        LOGGER.info("Clicked on the Job catogory check box ");


    }
    public static void clickEmpstatusdelete() {
        getDriver().findElement(ButJobCatogoryDelete).click();
        LOGGER.info("Clicked on the Job catogory  delete ");


    }

    public static void clickJobCatconfirmdelete() {
        getDriver().findElement(JobcatConfirmDelete).click();
        LOGGER.info("Clicked on the Job catogory  Confirm dialogbox ");


    }



}



