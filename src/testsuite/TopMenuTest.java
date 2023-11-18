package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TopMenuTest extends BaseTest {

    String baseURL = "https://demo.nopcommerce.com/"; // set base url

    @Before
    public void setUP(){openBrowser(baseURL);}

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){


    }



    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){



    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){



    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){



    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){



    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){



    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){



    }

    @After
    public void tearDown(){closeBrowser();}

}
