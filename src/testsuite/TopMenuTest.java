package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUp(){openBrowser(baseURL);}

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        String expected = "Computers";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);
    }



    @After
    public void tearDown(){closeBrowser();}

}
