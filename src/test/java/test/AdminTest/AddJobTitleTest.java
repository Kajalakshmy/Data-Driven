package test.AdminTest;

import com.pages.admin.HrmJob;
import com.pages.admin.JobCatogoryPage;
import org.testng.annotations.Test;
import test.LoginData;
import utils.PageBase;
import utils.TestBase;

public class AddJobTitleTest extends TestBase {

    @Test(priority = 1,dataProviderClass = AddEmployeeData.class, dataProvider = "AddEmpTestData")
    public void HrmTestone(String jobtitle ,String  descprition, String specification,String note){


        HrmJob.clickAdminPanel();
        HrmJob.clickJobTab();
        //AdminPage.implicitWait(3000);
        HrmJob.clickJobTitles();
        HrmJob.clickButAdd();
        HrmJob.setjobtitle(jobtitle);
        HrmJob.setJobdesc(descprition);
        HrmJob.chooseJobSpeci(specification);
        HrmJob.setNote(note);
        HrmJob.clickJobSave();


    }


    @Test(priority = 2)
    public void HrmTestTwo() {


        HrmJob.clickAdminPanel();
        HrmJob.clickJobTab();
        //AdminPage.implicitWait(3000);
        HrmJob.clickJobTitles();
        HrmJob.clickButAdd();
        HrmJob.setjobtitle("mechanic");
        HrmJob.setJobdesc("");
        HrmJob.chooseJobSpeci("");
        HrmJob.setNote("");
        HrmJob.clickJobSave();


    }


    @Test(priority = 3)
    public void HrmTestThree() {


        HrmJob.clickAdminPanel();
        HrmJob.clickJobTab();
        //AdminPage.implicitWait(3000);
        HrmJob.clickJobTitles();
        HrmJob.clickButAdd();
        HrmJob.setjobtitle("mechanic");
        HrmJob.setJobdesc("repair hardware");
        HrmJob.chooseJobSpeci("");
        HrmJob.setNote("");
        HrmJob.clickJobSave();


    }


    @Test(priority = 4)
    public void HrmTestFour() {


        HrmJob.clickAdminPanel();
        HrmJob.clickJobTab();
        //AdminPage.implicitWait(3000);
        HrmJob.clickJobTitles();
        HrmJob.clickButAdd();
        HrmJob.setjobtitle("mechanic");
        HrmJob.setJobdesc("repair hardware");
        HrmJob.chooseJobSpeci("txt file");
        HrmJob.setNote("");
        HrmJob.clickJobSave();

    }

    @Test(priority = 4)
    public void HrmTestFive() {


        HrmJob.clickAdminPanel();
        HrmJob.clickJobTab();
        //AdminPage.implicitWait(3000);
        HrmJob.clickJobTitles();
        HrmJob.clickButAdd();
        HrmJob.setjobtitle("mechanic");
        HrmJob.setJobdesc("repair hardware");
        HrmJob.chooseJobSpeci("txt file");
        HrmJob.setNote("doing wrk");
        HrmJob.clickJobSave();

    }
}

