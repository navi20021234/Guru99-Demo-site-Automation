package testCases;

import Pages.HomePage;
import Pages.RegisterPage;
import Pages.RegisterSuccessPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegisterUserTest {

    WebDriver driver;

    @BeforeMethod
    public void openPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC001() {
        HomePage homePage = new HomePage(driver);
        homePage.selectRegisterMenu();




            RegisterPage registerPage = new RegisterPage(driver);
            registerPage.setFirstName("Navini");
            registerPage.setLastName("Rubasinghe");
            registerPage.setPhone("0705044967");
            registerPage.setEmail("navinimanmini123@gmail.com");
            registerPage.setAddress("Matar,Southern Province,Sri Lanka");
            registerPage.setCity("Matara");
            registerPage.setProvince("Sothern Province");
            registerPage.setPostalCode("81000");
            registerPage.selectCountry("AUSTRIA");
            registerPage.setUsername("mngr647933");
            registerPage.setPassword("qAhYbYn");
            registerPage.setConfirmPassword("qAhYbYn");

            registerPage.clickSubmit();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String actualText = registerSuccessPage.successfulLoginCheck();
        Assert.assertTrue(actualText.contains("Dear"),"Registration Failed");

    }
}
