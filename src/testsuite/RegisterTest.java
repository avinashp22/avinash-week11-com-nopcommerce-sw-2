package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUP(){openBrowser(baseURL);}

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){


    }



    @Test
    public void userShouldRegisterAccountSuccessfully(){



    }

    @After
    public void tearDown(){closeBrowser();}

}
