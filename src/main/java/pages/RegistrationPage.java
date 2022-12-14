package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;
    private By radioBtn = By.xpath(".//input[@id='gender-female']");
    private By Firstname = By.xpath(".//input[@id='FirstName']");
    private By Lastname = By.xpath(".//input[@id='LastName']");
    private By Email = By.xpath(".//input[@id='Email']");
    private By Password = By.xpath(".//input[@id='Password']");
    private By Confirm = By.xpath(".//input[@id='ConfirmPassword']");
    private By regBtn = By.xpath(".//input[@id='register-button']");
    private By complete = By.xpath("//*[contains(text(),'Your registration completed')]");
    private By continueBtn = By.xpath(".//input[@value='Continue']");

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    public void clicksRadioButton(){
        driver.findElement(radioBtn).click();
    }
    public void userDetails(String firstName, String lastName, String email){
        driver.findElement(Firstname).sendKeys(firstName);
        driver.findElement(Lastname).sendKeys(lastName);
        driver.findElement(Email).sendKeys(email);
    }
    public void password(String pass_word){
        driver.findElement(Password).sendKeys(pass_word);
    }
    public void confirmPassword(String con_firm){
        driver.findElement(Confirm).sendKeys(con_firm);
    }
    public void registerButton(){
        driver.findElement(regBtn).click();
    }
    public void regComplete(){
        driver.findElement(complete).isDisplayed();
    }
    public void clicksContinue(){
        driver.findElement(continueBtn).click();
    }
}
