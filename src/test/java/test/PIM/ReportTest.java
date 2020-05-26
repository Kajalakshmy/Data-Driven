package test.PIM;

import com.pim.ReportPage;
import org.testng.annotations.Test;



import utils.TestBase;

public class ReportTest extends TestBase {
    @Test
    public void PimTest(){
    
    	ReportPage.Clickpim();
    	ReportPage.ClickReportPage();
        ReportPage.setUsername("Thusi");
        ReportPage.setSearchbtn("Thusi");
        ReportPage.setReset("Thusi");
        System.out.println("Worked");



    }
}