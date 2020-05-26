package com.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;

import utils.PageBase;

public class EmployeePage  extends PageBase{
	 private static final Logger LOGGER = Logger.getLogger(String.valueOf(EmployeePage.class));
	    private static By MenuPi= By.id("menu_pim_viewPimModule");
	    private static By employeelistlink = By.id("menu_pim_viewEmployeeList");
	    private static By employeename= By.id("empsearch_employee_name_empName");
	    private static By employeeid= By.id("empsearch_id");
	    private static By employeestatus= By.id("empsearch_employee_status");
	    private static By employeeinclude= By.id("empsearch_termination");
	    private static By supervisiorname= By.id("empsearch_supervisor_name");
	    private static By jobtitle= By.id("empsearch_job_title");
	    private static By subunit= By.id("empsearch_sub_unit");
	    private static By butsearch= By.id("searchBtn");
	    private static By butreset= By.id("resetBtn");
	    
	    
	    public static void clickPim() {
	        getDriver().findElement(MenuPi).click();
	        LOGGER.info("clicked on menu pim");
	    }

	    
	    public static void clickEmployeeLink() {
	        getDriver().findElement(employeelistlink).click();
	        LOGGER.info("clicked on employee link");
	        
	        
	    }
	    
	    public static void setEmpname(String empname) {
	        getDriver().findElement(employeename).sendKeys(empname);
	        LOGGER.info("clicked on menu pim");
	    }

	    public static void setEmpid(String empid) {
	        getDriver().findElement(employeeid).sendKeys(empid);
	        LOGGER.info("clicked on menu pim");
	    }
	    
	    
	    public static void clickEmpstatus() {
	        getDriver().findElement(employeestatus).click();
	        LOGGER.info("clicked on menu pim");
	    }
	    
	    
	    public static void setEmpstatus(String empstatus) {
	        getDriver().findElement(employeestatus).sendKeys(empstatus);
	        LOGGER.info("clicked on menu pim");
	    }
	    

	    public static void clickinclude() {
	        getDriver().findElement(employeeinclude).click();
	        LOGGER.info("clicked on menu pim");
	    }


		public static void setsupervisor_name(String superviocername) {
			// TODO Auto-generated method stub
			 getDriver().findElement(supervisiorname).sendKeys(superviocername);
		        LOGGER.info("clicked on menu pim");
		    }
		    
			
		}
	   
	     
	    
	    

