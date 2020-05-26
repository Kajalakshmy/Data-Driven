package com.pages;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import utils.PageBase;

public class ReportPage extends PageBase{
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(ReportPage.class));
	private static By Username = By.id("search_search");
	private static By Searchbtn = By.id("searchBtn");
	private static By Reset = By.id("reset");
	private static By ClickPim = By.id("menu_pim_viewPimModule");
	private static By ClickReportPage= By.id("menu_core_viewDefinedPredefinedReports");
	
	public static void Clickpim() {
		getDriver().findElement(ClickPim).click();
	}
	
	public static void ClickReportPage() {
		getDriver().findElement(ClickReportPage).click();
	}
	
    public static void setUsername(String UserName) {
        getDriver().findElement(Username).sendKeys(UserName);
        LOGGER.info("Entered Username");
    }
    
    public static void setSearchbtn(String searchbtn) {
        getDriver().findElement(Searchbtn).sendKeys(searchbtn);
        LOGGER.info("Entered Searchbtn");
    }
    
    public static void setReset(String reset) {
        getDriver().findElement(Reset).sendKeys(reset);
        LOGGER.info("Entered Reset");
    }

   
    
}
