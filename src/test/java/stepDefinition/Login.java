package stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Login {

    WebDriver driver;

    @Given("Navigate to {string}")
    public void navigate_to(String URL) {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/firefox.geckodriver");
        driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @When("login using the {string} and {string}")
    public void login_using_the_and(String string1, String string2) {

        driver.findElement(By.xpath("//*[@id='txt-username']")).sendKeys(string1);
        driver.findElement(By.xpath("//*[@id='txt-password']")).sendKeys(string2);
        driver.findElement(By.xpath("//*[@id='btn-login']")).click();

    }

    @Then("Select the Hong Kong Centre")
    public void select_the_hong_kong_centre() {
        driver.findElement(By.xpath("//*[@id='combo_facility']")).click();
        driver.findElement(By.xpath("//option[contains(@value, 'Hongkong')]")).click();
    }
    @And("Tick the apply checkbox")
    public void tick_the_apply_checkbox() {
        driver.findElement(By.xpath("//*[@id='chk_hospotal_readmission']")).click();

    }
    @And("Select none radio button")
    public void select_none_radio_button() {
        driver.findElement(By.xpath("//*[@id='radio_program_none']")).click();

    }
    @And("Enter todays date")
    public void enter_todays_date() {
        driver.findElement(By.xpath("//*[@id='txt_visit_date']")).sendKeys("09/07/2024");

    }
    @And("Enter a comment")
    public void enter_a_comment() {
        driver.findElement(By.xpath("//*[@id='txt_comment']")).sendKeys("A comment has been addded");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileLocation = "src/test/resources/screenshots/screenshot.png";
        try
        {
            Path targetPath = Path.of(fileLocation);
            Files.move(screenshot.toPath(),targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot saved successfully at: " + fileLocation);
        } catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Failed to save screenshot.");
        }
    }
    @And("Click Book Appointment button")
    public void click_book_appointment_button() {
        driver.findElement(By.xpath("//*[@id='btn-book-appointment']")).click();


    }
    @And("return and print facility name")
    public void return_and_print_facility_name() {
        String facility = driver.findElement(By.xpath("//*[@id='facility']")).getText();
        System.out.println(facility);
        driver.quit();
    }

}
