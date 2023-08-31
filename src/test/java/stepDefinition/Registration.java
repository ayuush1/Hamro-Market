package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Registration {
    WebDriver driver;
    WebDriverWait wait;



    @Given("User is on the registration page")
    public void RegistrationPage() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://vendor-dashboard.alpha.hamrostack.com/registration");


    }

    @And("User fills the valid number and email")
    public void Fill(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("ayush.pokharel14@gmail.com");



        WebElement sendCodeEmail= driver.findElement(By.xpath("//*[@id=\":r2:\"]"));
        sendCodeEmail.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





        for (int i=0; i<6;i++) {
            WebElement TestBox = driver.findElement(By.name("textFeild"+i));
            TestBox.sendKeys("2");
        }

        WebElement verifyCode= driver.findElement(By.id(":rg:"));
        verifyCode.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r3:")));
        WebElement mobile= driver.findElement(By.id(":r3:"));

        mobile.sendKeys("9810615859");


        WebElement sendCodeMobile= driver.findElement(By.xpath("//*[@id=\":r4:\"]"));
        sendCodeMobile.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i=0; i<6;i++) {
            WebElement TestBox = driver.findElement(By.name("textFeild"+i));
            TestBox.sendKeys("2");
        }

        WebElement verifyCodeMobile= driver.findElement(By.id(":rn:"));
        verifyCodeMobile.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement firstName= driver.findElement(By.id(":r5:"));
        firstName.sendKeys("ayush");

        WebElement middleName= driver.findElement(By.id(":r6:"));
        middleName.sendKeys("");

        WebElement lastName= driver.findElement(By.id(":r7:"));
        lastName.sendKeys("pokharel");

        WebElement pass=driver.findElement(By.name("password"));
        pass.sendKeys("Hello@123");

        WebElement confirm=driver.findElement(By.name("confirmPassword"));
        confirm.sendKeys("Hello@123");



    }

    @Then("User should be able to click register button")
    public void registerButton(){
        WebElement register= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[8]/button"));
        register.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("User fill the required field")
    public void fillField(){
        WebElement vendorname= driver.findElement(By.name("name"));
        vendorname.sendKeys("ayush pasal");

        WebElement vendorContact= driver.findElement(By.name("contact"));
        vendorContact.sendKeys("9888848483");

        WebElement vendorAddress= driver.findElement(By.name("address"));
        vendorAddress.sendKeys("ayush pasal 76");

        WebElement vendorPan= driver.findElement(By.name("panNumber"));
        vendorPan.sendKeys("8773478232344-23");

        WebElement registrationCertificate=driver.findElement(By.name("registrationCertificate"));
        registrationCertificate.sendKeys("C:\\Users\\LENOVO\\Pictures\\download.png");

        WebElement  panCertificate=driver.findElement(By.name("panCertificate"));
        panCertificate.sendKeys("C:\\Users\\LENOVO\\Pictures\\download.png");



    }
    @Then("User clicks the submit button")
    public void Submit(){
        WebElement submit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/div/div/div/div/button"));
        submit.click();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Then("User click the next button and confirm it")
    public void Button(){

        WebElement nextButton= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[5]/button[2]"));
        nextButton.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement confirm=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/div/div/div/button"));
        confirm.click();

    }



}
