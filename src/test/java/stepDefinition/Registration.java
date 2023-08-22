package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    WebDriver driver;

    @Given("User is on the registration page")
    public void RegistrationPage() {
        driver = new ChromeDriver();
        driver.get("https://vendor-dashboard.alpha.hamrostack.com/registration");
    }

    @And(" User fills the valid number and email")
    public void Fill(){
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("ayush.pokharel@gmail.com");

        WebElement sendCodeEmail= driver.findElement(By.xpath("//*[@id=\":r4:\"]"));
        sendCodeEmail.click();

        WebElement TestBox= driver.findElement(By.name("textFeild0"));
        TestBox.sendKeys("2");


    }

    @When("User click the send OTP button")
    public void OTPClick(){


    }

    @Then("User should be able to enter the Otp")
    public void OTPValidator(){

    }


}
