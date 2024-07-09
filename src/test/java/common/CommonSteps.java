//package common;
//
//import io.cucumber.java.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class CommonSteps {
//public WebDriver driver;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/firefox.geckodriver");
//        driver = new FirefoxDriver();
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }
//
//    public WebDriver driver(){
//        return driver;
//    }
//}