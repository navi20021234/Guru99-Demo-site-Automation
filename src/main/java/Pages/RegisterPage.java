package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver){

        this.driver = driver;
    }

    By firstName_locator = By.xpath("//input[@name='firstName']");
    By lastName_locator = By.xpath("//input[@name='lastName']");
    By phone_locator  = By.xpath("//input[@name='phone']");
    By email_locator = By.xpath("//input[@id='userName']");
    By address_locator = By.xpath("//input[@id='userName']");
    By city_locator = By.xpath("//input[@name='city']");
    By province_locator = By.xpath("//input[@name='state']");
    By postalCode_locator = By.xpath("//input[@name='postalCode']");

    By country_locator = By.xpath("//select[@name='country']");
    By userName_locator = By.xpath("//input[@id='email']");
    By password_locator = By.xpath("//input[@name='password']");
    By confirmPassword_locator = By.xpath("//input[@name='confirmPassword']");
    By submitBtn_locator = By.xpath("//input[@name='submit']");

    public void setFirstName(String name1){
        driver.findElement(firstName_locator).sendKeys(name1);
    }

    public void setLastName(String name2){
        driver.findElement(lastName_locator).sendKeys(name2);
    }

    public void setPhone(String phone){
        driver.findElement(phone_locator).sendKeys(phone);
    }

    public void setEmail(String mail){
        driver.findElement(email_locator).sendKeys(mail);
    }

    public void setAddress(String address){
        driver.findElement(address_locator).sendKeys(address);
    }

    public void setCity(String city){
        driver.findElement(city_locator).sendKeys(city);
    }

    public void setProvince(String province){
        driver.findElement(province_locator).sendKeys(province);
    }

    public void setPostalCode(String postalCode){
        driver.findElement(postalCode_locator).sendKeys(postalCode);
    }

    public void setCountry(){
        WebElement selctCountey = driver.findElement(country_locator);
        Select select = new Select(selctCountey);
        select.selectByIndex(4);
    }

    public void setUsername(String userName){
        driver.findElement(userName_locator).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(password_locator).sendKeys(password);
    }

    public void setConfirmPassword(String confirm){
        driver.findElement(confirmPassword_locator).sendKeys(confirm);
    }

    public  void submit(){
        driver.findElement(submitBtn_locator).click();
    }


}
