package PlaceFinder.Pages.LandingPage;

import PlaceFinder.DriverFactory.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
    public void contactMeButtonIsVisibleAndClickable() {
        Assert.assertEquals(driver.getCurrentUrl(), landingPageURL);
        contactMeIconCSS(driver).isDisplayed();
        contactMeIconCSS(driver).isEnabled();
        Assert.assertEquals(contactMeIconCSS(driver).getAttribute("href"), contactMeIconHref);
    }

    @Test
    public void socialLinksAreVisibleAndHaveTheRightHref() {
        // Github Icon
        githubIconCSS(driver).isDisplayed();
        githubIconCSS(driver).isEnabled();
        Assert.assertEquals(githubIconCSS(driver).getAttribute("href"), githubIconHref);

        // Linkedin Icon
        linkedinIconCSS(driver).isEnabled();
        linkedinIconCSS(driver).isDisplayed();
        Assert.assertEquals(linkedinIconCSS(driver).getAttribute("href"), linkedinIconHref);
    }

    @Test
    public void interestButtonsAreVisibleAndClickable() {
        museumButtonID(driver).isDisplayed();
        museumButtonID(driver).isEnabled();

        restaurantButtonID(driver).isEnabled();
        restaurantButtonID(driver).isDisplayed();

        barButtonID(driver).isEnabled();
        barButtonID(driver).isDisplayed();
    }

    @Test
    public void inputFieldIsUsable() {
        inputID(driver).click();
        inputID(driver).clear();
        inputID(driver).sendKeys("Dublin");
        museumButtonID(driver).click();

        moreResultButtonID(driver).isEnabled();
        moreResultButtonID(driver).isDisplayed();
        resetSearchButtonID(driver).isEnabled();
        resetSearchButtonID(driver).isDisplayed();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
