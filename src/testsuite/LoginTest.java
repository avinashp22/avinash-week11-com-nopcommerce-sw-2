package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUp(){openBrowser(baseURL);}

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        driver.findElement(By.linkText("Log in")).click();
        String expected = "Welcome, Please Sign In!";
        String actual = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);
    }



    @After
    public void tearDown(){closeBrowser();}

}
