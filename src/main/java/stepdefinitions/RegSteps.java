package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.RegistrationPage;
import pages.landingPage;

import java.time.Duration;

public class RegSteps {
    private WebDriver driver;
    private landingPage landing;
    private RegistrationPage reg;
    private HomePage home;

    @Given("the user is on the landing page")
    public void the_user_is_on_the_landing_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demowebshop.tricentis.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @When("user clicks the register text link")
    public void user_clicks_the_register_text_link() {
        landing = new landingPage(driver);
        landing.clickTextLink();
    }
    @When("selects their gender")
    public void selects_their_gender() {
        reg = new RegistrationPage(driver);
        reg.clicksRadioButton();
    }
    @When("types (.*) and (.*) and (.*)$")
    public void types_test_and_user_and_ontha_gmail_com
            (String firstname, String lastname, String email) {
        reg.userDetails(firstname,lastname,email);
    }
    @When("enters (.*)$")
    public void enters_tsh_mav(String password) {
        reg.password(password);
    }
    @When("confirms (.*)$")
    public void confirms_tsh_mav(String confirm) {
        reg.confirmPassword(confirm);
    }
    @When("clicks register button")
    public void clicks_register_button() {
        reg.registerButton();
    }
    @Then("user gets a registration completed message")
    public void user_gets_a_registration_completed_message() {
        reg.regComplete();
    }
    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        reg.clicksContinue();
    }
    @Then("user is successfully logged in with email on page")
    public void user_is_successfully_logged_in_with_email_on_page() {
        home = new HomePage(driver);
        home.visibleEmail();
    }
}
