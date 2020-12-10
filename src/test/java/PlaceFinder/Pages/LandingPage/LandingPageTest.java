package PlaceFinder.Pages.LandingPage;

import PlaceFinder.DriverFactory.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LandingPageTest extends LandingPagePOM {

    WebDriver driver = new DriverFactory().driver;
    DriverFactory driverFactory = new DriverFactory();
    Logger logger = LogManager.getLogger(LandingPageTest.class);

    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void setUp(String browser, String headless) {
        driver = driverFactory.setUpTest(browser, headless);
    }

    @Test
    public void test() {

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
