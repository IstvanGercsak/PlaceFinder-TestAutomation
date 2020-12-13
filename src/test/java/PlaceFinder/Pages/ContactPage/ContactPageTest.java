package PlaceFinder.Pages.ContactPage;

import PlaceFinder.DriverFactory.DriverFactory;
import PlaceFinder.Pages.LandingPage.LandingPageTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactPageTest extends ContactPageTestPOM {

    WebDriver driver = new DriverFactory().driver;
    DriverFactory driverFactory = new DriverFactory();
    Logger logger = LogManager.getLogger(LandingPageTest.class);
    LandingPageTest landingPage = new LandingPageTest();

    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void setUp(String browser, String headless) {
        driver = driverFactory.setUpTest(browser, headless);
    }

    @Test
    public void navigateToTheContactPage() {
        landingPage.contactMeIconCSS(driver).click();
        Assert.assertEquals(driver.getCurrentUrl(), contactPageURL);
    }

    @Test
    public void goBackToTheLandingPage() {
        landingPage.contactMeIconCSS(driver).click();
        goBackIconCSS(driver).isEnabled();
        goBackIconCSS(driver).isDisplayed();
        Assert.assertEquals(goBackIconCSS(driver).getAttribute("href"), goBackIconHref);
        goBackIconCSS(driver).click();
    }

    @Test
    public void socialLinksAreVisibleAndHaveTheRightHref() {
        landingPage.contactMeIconCSS(driver).click();
        // Github Icon
        githubIconCSS(driver).isDisplayed();
        githubIconCSS(driver).isEnabled();
        Assert.assertEquals(githubIconCSS(driver).getAttribute("href"), githubIconHref);

        // Linkedin Icon
        linkedinIconCSS(driver).isEnabled();
        linkedinIconCSS(driver).isDisplayed();
        Assert.assertEquals(linkedinIconCSS(driver).getAttribute("href"), linkedinIconHref);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
