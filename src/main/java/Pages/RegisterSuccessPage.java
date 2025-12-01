package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {

    WebDriver driver;
        public RegisterSuccessPage(WebDriver driver){
            this.driver = driver;
        }

    By successCheck_locator = By.xpath("//b[contains(text(),'Dear')]");

        public String successfulLoginCheck(){
            String succesText = driver.findElement(successCheck_locator).getText();
            return succesText;

        }

    }
