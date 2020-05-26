package com.pim;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import utils.PageBase;
	
public class EmployeeListPage extends PageBase{
		
		private static final Logger LOGGER = Logger.getLogger(String.valueOf(EmployeeListPage.class));
		private static By employeename = By.id("empsearch_employee_name_empName");
		private static By emId = By.id("empsearch_id");
		private static By emstatus = By.id("empsearch_employee_status");
		private static By include = By.id("empsearch_termination");
		private static By supervisorname = By.id("empsearch_supervisor_name");
		private static By jobtitle = By.id("empsearch_job_title");
		private static By subunit = By.id("empsearch_sub_unit");
		private static By searchbt = By.id("searchBtn");
		private static By resetbt = By.id("resetBtn");
		private static By ClickPim = By.id("menu_pim_viewPimModule");
		private static By ClickEmployeeListPage= By.id("menu_pim_viewEmployeeList");
		
		public static void Clickpim() {
			getDriver().findElement(ClickPim).click();
		}
		
		public static void ClickEmployeeListPage() {
			getDriver().findElement(ClickEmployeeListPage).click();
		}
		
	    public static void setemployeename(String employeeName) {
	        getDriver().findElement(employeename).sendKeys(employeeName);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setemId(String EmId) {
	        getDriver().findElement(emId).sendKeys(EmId);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setemstatus(String emStatus) {
	        getDriver().findElement(emstatus).sendKeys(emStatus);
	        LOGGER.info("Entered Username");
	    }
		    
	    public static void setinclude(String Include) {
	        getDriver().findElement(include).sendKeys(Include);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setsupervisorname(String Supervisorname) {
	        getDriver().findElement(supervisorname).sendKeys(Supervisorname);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setjobtitle(String Jobtitle) {
	        getDriver().findElement(jobtitle).sendKeys(Jobtitle);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setsubunit(String subUnit) {
	        getDriver().findElement(subunit).sendKeys(subUnit);
	        LOGGER.info("Entered Username");
	    }
	    
	    public static void setsearchbt(String Searchbt) {
	        getDriver().findElement(searchbt).sendKeys(Searchbt);
	        LOGGER.info("Entered Searchbtn");
	    }
	    
	    public static void setresetbt(String Resetbt) {
	        getDriver().findElement(resetbt).sendKeys(Resetbt);
	        LOGGER.info("Entered Searchbtn");
	    }
}
