package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginEmail = By.xpath("//a[contains(@href,'/customer/info')]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void visibleEmail(){
        driver.findElement(loginEmail).isDisplayed();
        driver.quit();
    }
}
