package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class landingPage {

    private WebDriver driver;
    private By regTextLink = By.xpath("//a[contains(@href,'/register')]");

    public landingPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickTextLink(){
        driver.findElement(regTextLink).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
