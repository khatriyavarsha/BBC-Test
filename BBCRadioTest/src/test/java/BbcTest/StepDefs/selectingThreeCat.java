package BbcTest.StepDefs;

import BbcTest.pageObjects.categories;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectingThreeCat {

    WebDriver driver = new FirefoxDriver();

    @When("^I select \"([^\"]*)\" in the radio nav$")
    public void iSelectSectionInTheRadioNav(String arg1) throws Throwable {
        WebElement element = driver.findElement(By.className(categories.allCategories));
        element.click();
        throw new PendingException();
    }


    @Then("^the \"([^\"]*)\" drawer is open and the other drawers are closed$")
    public void theSectionDrawerIsOpenAndTheOtherDrawersAreClosed() throws Throwable {
        WebElement element = driver.findElement(By.className(categories.allCategories));
        element.click();
        throw new PendingException();
    }
}
