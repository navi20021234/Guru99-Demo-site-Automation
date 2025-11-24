package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
 WebDriver driver;

 public HomePage(WebDriver driver){
     this.driver = driver;
 }

 public By registerBtn_locator = By.linkText("REGISTER");

 public void selectRegisterMenu(){
     driver.findElement(registerBtn_locator).click();
 }
}
