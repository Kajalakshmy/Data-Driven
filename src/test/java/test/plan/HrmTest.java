package test.plan;

import com.pages.admin.HrmConfiger;
import org.testng.annotations.Test;
import utils.TestBase;

public class HrmTest extends TestBase {
    @Test
    public void HrmTest(){
        HrmConfiger.clickMenuAdmin();
        System.out.println("Click Admin Menu");
        HrmConfiger.clickMenuAddConfig();
        System.out.println("Click MenuAddConfig");
        HrmConfiger.clickMenuAddEmailConfig();
        System.out.println("Click MenuAddEmailConfig");
        HrmConfiger.clickBtnSave();
        HrmConfiger.setTxtMailSentAs("abcd@gmail.com");
        HrmConfiger.setTxtSendingMethod("Sendmail");
        HrmConfiger.clickTxtSendTestEmail();
        HrmConfiger.setTxtTestEmailAddress("xyz@yahoo.com");
        HrmConfiger.clickBtnSave();

    }


}
