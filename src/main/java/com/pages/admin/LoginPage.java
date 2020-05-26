package com.pages.admin;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import utils.PageBase;

public class LoginPage extends PageBase {


    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
        private static By TxtUsername= By.id("txtUsername");
        private static By TxtPassworld= By.id("txtPassword");
        private static By btnLogin= By.id("btnLogin");
        private static By HrmLoginHeader =By.id("logInPanelHeading");
        private static By clickwelcom =By.id("welcome");
        private static By logout =By.xpath("//a[@href=\"/index.php/auth/logout\"]");


    public static boolean isHrmLoginPageDisplayed() {
            return getDriver().findElement(HrmLoginHeader).isDisplayed();

        }
        public static void setUserName(String username) {
            getDriver().findElement(TxtUsername).sendKeys(username);
            LOGGER.info("Entered Username");

        }

        public static void setPass(String pass) {
            getDriver().findElement(TxtPassworld).sendKeys(pass);
            LOGGER.info("Entered Pass");

        }
        public static void ClickLogin() {
            getDriver().findElement(btnLogin).click();
            LOGGER.info("Click Login");

        }
        public static void ClickLogout() {
            getDriver().findElement(logout).click();
            LOGGER.info("Clicked Logout");

        }
        public static void Clickwelcom() {
            getDriver().findElement(clickwelcom).click();
            LOGGER.info("Clicked Welcome");

        }

        public static void login(String user,String pw){
            LoginPage.setUserName(user);
            LoginPage.setPass(pw);
            LoginPage.ClickLogin();

        }
    }
