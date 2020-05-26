package com.pages.admin;


import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class PayGrade extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGrade.class));
    private static By MenuPayGrades = By.id("menu_admin_viewPayGrades");

    private static By ButtonPayAdd = By.id("btnAdd");
    private static By Txtpayname = By.id("payGrade_name");
    private static By ButPaysave = By.id("btnSave");
    private static By ButAddCurdetail = By.id("btnAddCurrency");
    private static By ButAddCurrencydetail = By.id("btnAddCurrency");
    private static By Txtcurrencyname = By.id("payGradeCurrency_currencyName");
    private static By Txtcurrencymin = By.id("payGradeCurrency_minSalary");
    private static By Txtcurrencymax = By.id("payGradeCurrency_maxSalary");
    private static By Butsavecurrency = By.id("btnSaveCurrency");
    private static By Checkcurtable = By.name("delCurrencies[]");
    private static By Butdelcurrencydetails = By.id("btnDeleteCurrency");




    public static void clickMenuPaygrade() {
        getDriver().findElement(MenuPayGrades).click();
        LOGGER.info("Clicked on the pay grade pannel");


    }

    public static void clickPayAdd() {
        getDriver().findElement(ButtonPayAdd).click();
        LOGGER.info("Clicked on the pay add button");


    }

    public static void setPayTxtName(String payeusername) {
        getDriver().findElement(Txtpayname).sendKeys(payeusername);
        LOGGER.info("Entered the pay user");


    }
    public static void clickPaySave() {
        getDriver().findElement(ButPaysave).click();
        LOGGER.info("Clicked on the pay save ");


    }

    public static void clickPayAddCurr() {
        getDriver().findElement(ButAddCurrencydetail).click();
        LOGGER.info("Clicked on the Add Currency");


    }

    public static void setPayTxtCurname(String currencyname) {
        getDriver().findElement(Txtcurrencyname).sendKeys(currencyname);
        LOGGER.info("Entered the currency name");


    }

    public static void setPayTxtcurmin(String currencymin) {
        getDriver().findElement(Txtcurrencymin).sendKeys(currencymin);
        LOGGER.info("Entered the currency minimum");


    }

    public static void setPayTxtcurmax(String currencymax) {
        getDriver().findElement(Txtcurrencymax).sendKeys(currencymax);
        LOGGER.info("Entered the currency maximum");


    }
    public static void clickPaycursave() {
        getDriver().findElement(Butsavecurrency).click();
        LOGGER.info("Clicked on the Save button to save currency");


    }

    public static void clickcheckcurrencydetail() {
        getDriver().findElement(Checkcurtable).click();
        LOGGER.info("Clicked on the Check box currency details");


    }

    public static void clickdeltecurrency() {
        getDriver().findElement(Butdelcurrencydetails).click();
        LOGGER.info("Clicked on the delete button to delete currency");


    }


}
