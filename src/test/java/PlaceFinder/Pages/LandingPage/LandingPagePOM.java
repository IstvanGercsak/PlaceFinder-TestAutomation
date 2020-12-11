package PlaceFinder.Pages.LandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPagePOM {

    String landingPageURL = "https://istvangercsak.github.io/PlaceFinder-SecondMilestoneProject/";
    String contactMeIconCSS = "body > nav > div > div.col-lg-11.col-md1-11.envelop > a";
    String contactMeIconHref = "https://istvangercsak.github.io/PlaceFinder-SecondMilestoneProject/contact.html";

    String inputID = "search";
    String museumButtonID = "museum";
    String restaurantButtonID = "restaurant";
    String barButtonID = "bar";

    String moreResultButtonID = "more";
    String resetSearchButtonID = "reset";

    String githubIconCSS = "body > footer > div > div.col-lg-6.list-inline.social-links-container > ul > li:nth-child(1) > a";
    String linkedinIconCSS = "body > footer > div > div.col-lg-6.list-inline.social-links-container > ul > li:nth-child(2) > a";

    String githubIconHref = "https://github.com/IstvanGercsak";
    String linkedinIconHref = "https://www.linkedin.com/in/istvangercsak/";


    public WebElement contactMeIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(contactMeIconCSS));
    }

}
