package com.pim;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import utils.PageBase;

	public class AddEmployeePage extends PageBase{
		
		private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddEmployeePage.class));
		private static By firstname = By.id("firstName");
		private static By middlename = By.id("middleName");
		private static By lastname = By.id("lastName");
		private static By EmployeeId = By.id("employeeId");
		private static By photoFile = By.id("photofile");
		private static By chklogin = By.id("chkLogin");
		private static By btnsave = By.id("btnSave");
		private static By ClickPim = By.id("menu_pim_viewPimModule");
		private static By ClickAddEmployeePage= By.id("menu_pim_addEmployee");
		
		public static void Clickpim() {
			getDriver().findElement(ClickPim).click();
		}
		
		public static void ClickReportPage() {
			getDriver().findElement(ClickAddEmployeePage).click();
		}
		
	    public static void setfirstname(String firstName) {
	        getDriver().findElement(firstname).sendKeys(firstName);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setmiddlename(String middleName) {
	        getDriver().findElement(middlename).sendKeys(middleName);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setlastname(String lastName) {
	        getDriver().findElement(lastname).sendKeys(lastName);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setEmployeeId(String employeeId) {
	        getDriver().findElement(EmployeeId).sendKeys(employeeId);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setphotoFile(String photofile) {
	        getDriver().findElement(photoFile).sendKeys(photofile);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setchklogin(String chkLogin) {
	        getDriver().findElement(chklogin).sendKeys(chkLogin);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setbtnsave(String btnSave) {
	        getDriver().findElement(btnsave).sendKeys(btnSave);
	        LOGGER.info("Entered Searchbtn");
	    }


	}
