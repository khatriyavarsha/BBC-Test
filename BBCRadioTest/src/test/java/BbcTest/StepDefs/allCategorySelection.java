package BbcTest.StepDefs;

import BbcTest.pageObjects.categories;
import BbcTest.pageObjects.stations;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertTrue;


public class allCategorySelection {

    WebDriver driver = new FirefoxDriver();


    @Given("^I can see the radio nav$")
    public void iCanSeeTheRadioNav() throws Throwable {
        WebElement element = driver.findElement(By.className(categories.catTab));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Categories", strng);
        throw new PendingException();
    }

    @When("^I select Categories in the radio nav$")
    public void iSelectCategoriesInTheRadioNav() throws Throwable {
        WebElement element = driver.findElement(By.className(categories.catTab));
        element.click();
        throw new PendingException();
    }

    @And("^I select the all categories link$")
    public void iSelectTheAllCategoriesLink() throws Throwable {
        WebElement element = driver.findElement(By.className(categories.catTab));
        element.click();
        throw new PendingException();
    }

    @Then("^I am on the all categories page$")
    public void iAmOnTheAllCategoriesPage() throws Throwable {
        WebElement element = driver.findElement(By.className(categories.allCategories));
        element.click();
        throw new PendingException();
    }

    @Then("^I can see the following categories$")
    public void iCanSeeTheFollowingCategories() throws Throwable {
        boolean element = driver.findElement(By.className("categories.categories--header")).getText().equals("");
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
