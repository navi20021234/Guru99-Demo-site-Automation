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
    By address_locator = By.xpath("//input[@name='address1']");
    By city_locator = By.xpath("//input[@name='city']");
    By province_locator = By.xpath("//input[@name='state']");
    By postalCode_locator = By.xpath("//input[@name='postalCode']");

    By country_locator = By.xpath("//select[@name='country']");
    By userName_locator = By.xpath("//input[@id='email']");
    By password_locator = By.xpath("//input[@name='password']");
    By confirmPassword_locator = By.xpath("//input[@name='confirmPassword']");
    By submitBtn_locator = By.xpath("//input[@name='submit']");

    public void setFirstName(String name){
        driver.findElement(firstName_locator).sendKeys(name);
    }

    public void setLastName(String name){
        driver.findElement(lastName_locator).sendKeys(name);
    }

    public void setPhone(String phone){
        driver.findElement(phone_locator).sendKeys(phone);
    }

    public void setEmail(String email){
        driver.findElement(email_locator).sendKeys(email);
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

    // FIXED: Added country as a parameter
    public void selectCountry(String countryName){
        WebElement countryDropdown = driver.findElement(country_locator);
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(countryName);
    }

    public void setUsername(String userName){
        driver.findElement(userName_locator).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(password_locator).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        driver.findElement(confirmPassword_locator).sendKeys(confirmPassword);
    }

    public void clickSubmit(){
        driver.findElement(submitBtn_locator).submit();
    }
}
