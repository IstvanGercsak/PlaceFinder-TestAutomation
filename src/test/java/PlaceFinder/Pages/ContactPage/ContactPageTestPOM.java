package PlaceFinder.Pages.ContactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPageTestPOM {

    String goBackIconCSS = "body > nav > div > div.col-lg-11.col-md1-11.envelop > a";
    String goBackIconHref = "https://istvangercsak.github.io/PlaceFinder-SecondMilestoneProject/index.html";
    String contactPageURL = "https://istvangercsak.github.io/PlaceFinder-SecondMilestoneProject/contact.html";

    String nameInputID = "name";
    String nameInputEmailID = "emailaddress";
    String phoneNumberID = "phonenumber";
    String messageInputID = "description";
    String sendMessageButtonCSS = "body > section > div > div.col-lg-12.form-container > form > button";

    String githubIconCSS = "body > footer > div > div.col-lg-6.list-inline.social-links-container > ul > li:nth-child(1) > a";
    String linkedinIconCSS = "body > footer > div > div.col-lg-6.list-inline.social-links-container > ul > li:nth-child(2) > a";
    String githubIconHref = "https://github.com/IstvanGercsak";
    String linkedinIconHref = "https://www.linkedin.com/in/istvangercsak/";

    WebElement goBackIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(goBackIconCSS));
    }

    WebElement nameInputID(WebDriver driver) {
        return driver.findElement(By.id(nameInputID));
    }

    WebElement nameInputEmailID(WebDriver driver) {
        return driver.findElement(By.id(nameInputEmailID));
    }

    WebElement phoneNumberID(WebDriver driver) {
        return driver.findElement(By.id(phoneNumberID));
    }

    WebElement messageInputID(WebDriver driver) {
        return driver.findElement(By.id(messageInputID));
    }

    WebElement sendMessageButtonCSS(WebDriver driver) {
        return driver.findElement(By.id(sendMessageButtonCSS));
    }

    WebElement githubIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(githubIconCSS));
    }

    WebElement linkedinIconCSS(WebDriver driver) {
        return driver.findElement(By.cssSelector(linkedinIconCSS));
    }
}
