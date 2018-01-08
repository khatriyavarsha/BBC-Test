package BbcTest.StepDefs;


import BbcTest.pageObjects.environment;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "../BBCRadioTest/src/test/java/BbcTest/featureFiles",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        glue={"../BBCRadioTest/src/test/java/BbcTest/StepDefs"}

)

public class RunTest {
    public static WebDriver driver;
    static boolean ci = false;


    @BeforeClass
    public static void start() {
        System.out.println("Starting browser ...... " );

        System.setProperty("webdriver.firefox.driver", "../BBCRadioTest/src/test/java/BbcTest/browsers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("Firefox");


        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("Opening the home page...... " + environment.homeURL);
        driver.get(environment.homeURL);
        System.out.println("Checking the home page is shown......");
    }

    @AfterClass
    public static void stop()
    {
        //driver.close();
        //driver.quit();
    }

}
