package eCabs.com.stgautomation.base;

import com.stgautomation.pages.BasePage;
import com.stgautomation.pages.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends BasePage {

    protected WebDriver driver;
    protected BaseTest basePage;
    private String url = "https://cuoriumpanels.ecabsonline.com/";

    @BeforeAll

    public void setup (){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        LoginPage = new LoginPage();
    }

    @AfterAll

    public void tearDown(){
        driver.quit();
    }

}
