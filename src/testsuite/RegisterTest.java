/**
 * 5. Write down the following test into ‘RegisterTest’ class
 * 1. userShouldNavigateToRegisterPageSuccessfully
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userShouldRegisterAccountSuccessfully * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration completed’
 */

package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUP(){openBrowser(baseURL);}

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        driver.findElement(By.linkText("Register")).click();
        String expected = "Register";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);
    }


    @Test
    public void userShouldRegisterAccountSuccessfully(){
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.xpath("//input[@id = 'gender-male']")).click();
        driver.findElement(By.xpath("//input[@id = 'FirstName']")).sendKeys("Iindiannaa");
        driver.findElement(By.xpath("//input[@id = 'LastName']")).sendKeys("Jjonees");
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']//option[text() = '30']")).click();
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']//option[text() = 'January']")).click();
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']//option[text() = '1913']")).click();
        driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("IindianajJjonesss@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'Company']")).sendKeys("Prime");
        driver.findElement(By.xpath("//input[@id = 'Newsletter']")).click();
        driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("Prime123!");
        driver.findElement(By.xpath("//input[@id = 'ConfirmPassword']")).sendKeys("Prime123!");
        driver.findElement(By.xpath("//button[@id = 'register-button']")).click();
        String expected = "Your registration completed";
        String actual = driver.findElement(By.xpath("//div[text() = 'Your registration completed']")).getText();
        Assert.assertEquals("Correct Message not Displayed",expected,actual);

    }

    @After
    public void tearDown(){closeBrowser();}

}
