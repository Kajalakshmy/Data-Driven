package com.pages.admin;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import utils.PageBase;

public class HrmConfiger extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(com.pages.admin.HrmConfiger.class));
    private static By MenuAdmin = By.id("menu_admin_viewAdminModule");
    private static By MenuAddConfig = By.id("menu_admin_Configuration");
    private static By MenuAddEmailConfig = By.id("menu_admin_listMailConfiguration");
    private static By TxtMailSentAs = By.id("emailConfigurationForm_txtMailAddress");
    private static By TxtSendingMethod = By.id("emailConfigurationForm_cmbMailSendingMethod");
    //private static By TxtPath =
    private static By CheckSendTestEmail = By.id("emailConfigurationForm_chkSendTestEmail");
    private static By TxtTestEmailAddress = By.id("emailConfigurationForm_txtTestEmail");
    private static By BtnSave = By.id("editBtn");
    private static By BtnRest = By.id("resetBtn");



    public static void clickMenuAdmin() {
        getDriver().findElement(MenuAdmin).click();
        LOGGER.info("Clicked the Admin");
    }

    public static void clickMenuAddConfig() {
        getDriver().findElement(MenuAddConfig).click();
        LOGGER.info("Clicked the configration");
    }

    public static void clickMenuAddEmailConfig() {
        getDriver().findElement(MenuAddEmailConfig).click();
        LOGGER.info("Clicked the email configration");
    }

    public static void setTxtMailSentAs(String sendmail) {
        getDriver().findElement(TxtMailSentAs).sendKeys(sendmail);
        LOGGER.info("Enter the send mail address");
    }

    public static void setTxtSendingMethod(String sendmethod) {
        getDriver().findElement(TxtSendingMethod).sendKeys(sendmethod);
        LOGGER.info("Enter the sending method");
    }

    public static void clickTxtSendTestEmail() {
        getDriver().findElement(CheckSendTestEmail).click();
        LOGGER.info("Check the sending method");
    }

    public static void setTxtTestEmailAddress(String testemail) {
        getDriver().findElement(TxtTestEmailAddress).sendKeys(testemail);
        LOGGER.info("Enter the testing email");
    }

    public static void clickBtnSave() {
        getDriver().findElement(BtnSave).click();
        LOGGER.info("Save the details");
    }

    public static void clickBtnRest() {
        getDriver().findElement(BtnRest).click();
        LOGGER.info("Rest details");
    }
}