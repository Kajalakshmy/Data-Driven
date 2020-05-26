package test.plan;


import com.pages.LoginPage;
import com.pim.AddEmployee;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class AddEmployeeTest extends TestBase {
    @Test
    public void AddEmployeeTest(){
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        AddEmployee.clickMenuPim();
        AddEmployee.clickAddemployee();
        AddEmployee.setFirstName("Nive");
        AddEmployee.setMiddleName("Ruby");
        AddEmployee.setLastName("Nive");
        AddEmployee.setEmployeeId("0054");
        AddEmployee.setPhotofile("");
        AddEmployee.setClickLogin();
         AddEmployee.setClickSave();



    }
}
