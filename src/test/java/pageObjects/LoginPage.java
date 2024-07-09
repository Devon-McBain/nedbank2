package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://katalon-demo-cura.herokuapp.com/profile.php#login
public class LoginPage {
    @FindBy(xpath = "//*[@id='txt-username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//*[@id='txt-password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id='btn-login']")
    public WebElement buttonLogin;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}