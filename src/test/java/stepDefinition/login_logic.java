package stepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class login_logic {

   private  WebDriver driver;
   private String url="https://vendor-dashboard.alpha.hamrostack.com/";

   private String loginButton="//div[@class=\"mt-5\"]/button";

    @Given("user is on login page")
    public void loginPage() {

        driver =new ChromeDriver();
        driver.get(url);

    }

    @Given("^user fill the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void requiredFields(String username, String pass ) {


        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys(username);

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys(pass);

    }

    @When("user click the login button")
    public void buttonClick() {
     WebElement button = driver.findElement(By.xpath(loginButton));
     button.click();

    }

    @Then("the user should be directed to the dashboard")
    public void the() {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();

        }
      driver.quit();
    }

}
