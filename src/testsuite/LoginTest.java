/**
 2. Create the package ‘testsuite’ and create the following classes inside the ‘testsuite’ package.
 1. LoginTest
 2. TopMenuTest
 3. RegisterTest
 3. Write down the following test into ‘LoginTest’ class
 1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
 * Verify the text ‘Welcome, Please Sign In!’
 2. userShouldLoginSuccessfullyWithValidCredentials
 * click on the ‘Login’ link
 * Enter valid username
 * Enter valid password
 * Click on ‘LOGIN’ button
 * Verify the ‘Log out’ text is display
 3. verifyTheErrorMessage
 * click on the ‘Login’ link
 * Enter invalid username
 * Enter invalid password
 * Click on Login button
 * Verify the error message ‘Login was unsuccessful.
 Please correct the errors and try again. No customer account found’
 *
 */

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


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");;
        driver.findElement(By.id("Password")).sendKeys("Prime123");
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expected = "Log out";
        String actual = driver.findElement(By.className("ico-logout")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);
    }

    @Test
    public void verifyTheErrorMessage(){
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("123Prime123@gmail.com");;
        driver.findElement(By.id("Password")).sendKeys("123Prime123");
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actual = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);
    }



    @After
    public void tearDown(){closeBrowser();}

}
