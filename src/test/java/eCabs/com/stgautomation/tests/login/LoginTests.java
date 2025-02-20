package eCabs.com.stgautomation.tests.login;

import com.stgautomation.pages.LoginPage;
import eCabs.com.stgautomation.base.BaseTest;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

    @Test

    public void testLoginErrorMessage(){
        LoginPage.setUsername("luisbernal@ecabs.com.mt");
        LoginPage.setPassword("123");
        LoginPage.ClickLoginButton();
        String actualMessage = LoginPage.getErrorMessage();
        assert(actualMessage.contains("Unable to authenticate"));
        //assert.assertTrue(actualMessage.contains("Unable to authenticate"));
    }
}
