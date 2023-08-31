package stepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class login_logic {

   private  WebDriver driver;
   private String url="https://vendor-dashboard.alpha.hamrostack.com/";

   private String loginButton="//div[@class=\"mt-5\"]/button";
    WebDriverWait wait;
    String mainWindowHandle;



    @Given("user is on login page")
    public void loginPage() {

        driver= new ChromeDriver();
        driver.get(url);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    @Given("^user fill the fields")
    public void requiredFields() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("prajitabalami1@gmail.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Hello@123");

    }

    @When("user click the login button")
    public void buttonClick() {
        mainWindowHandle = driver.getWindowHandle();

        WebElement button = driver.findElement(By.xpath(loginButton));
        button.click();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        @And("user fills the required field")
        public void storeSettings(){

            wait = new WebDriverWait(driver, Duration.ofSeconds(30));


            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(mainWindowHandle)) {
                    driver.switchTo().window(handle);

                    break;
                }
            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
            WebElement storeName= driver.findElement(By.name("name"));


            storeName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            storeName.sendKeys(Keys.DELETE);
            storeName.sendKeys("ayush");

            WebElement storeLabel= driver.findElement(By.name("logoLabel"));
            storeLabel.sendKeys("C:\\Users\\LENOVO\\Pictures\\download.png");


            WebElement storeProvince = driver.findElement(By.name("province"));
            storeProvince.click();
            storeProvince.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

            WebElement storeDistrict = driver.findElement(By.name("district"));
            storeDistrict.click();
            storeDistrict.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

            WebElement storeCity = driver.findElement(By.name("city"));
            storeCity.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            storeCity.sendKeys(Keys.DELETE);
            storeCity.sendKeys("dhumabarahi");

            WebElement storeAddress = driver.findElement(By.name("streetAddress"));
            storeAddress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            storeAddress.sendKeys(Keys.DELETE);
            storeAddress.sendKeys("deepjyoti Marg");

            WebElement storePhone = driver.findElement(By.name("phone"));
            storePhone.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            storePhone.sendKeys(Keys.DELETE);
            storePhone.sendKeys("9876545676");

            WebElement Savebutton= driver.findElement(By.xpath("(//div[contains(@class,'flex justify')])[4]/button"));
            Savebutton.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement Okbutton=driver.findElement(By.xpath("//div[contains(@class,\"flex w-full\")]/button"));
            Okbutton.click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement VacationMode= driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
            VacationMode.click();

            WebElement vacationMessage=driver.findElement(By.name("message"));
            vacationMessage.sendKeys("this is for the test");

            WebElement date=driver.findElement(By.name("fromDate"));
            date.sendKeys("27092023");

             date=driver.findElement(By.name("toDate"));
            date.sendKeys("29092023");

            Savebutton= driver.findElement(By.xpath("(//div[@class=\"flex justify-end\"])[2]/button"));
             Savebutton.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             Okbutton=driver.findElement(By.xpath("//div[@class='flex w-full justify-center']/button"));
            Okbutton.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            WebElement AddAccount=driver.findElement(By.xpath("(//div[@class=\"flex mt-5 mb-2 justify-end\"])/button"));
            AddAccount.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement AccountName=driver.findElement(By.name("accountName"));
            AccountName.sendKeys("ayush Pokharel");

            WebElement AccountNumber=driver.findElement(By.name("accountNumber"));
            AccountNumber.sendKeys("88777665667");

            WebElement BankName=driver.findElement(By.xpath("(//div[contains(@class,'MuiInputBase-root')])[15]/input"));
            BankName.click();
            BankName.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);


            WebElement BankBranch=driver.findElement(By.xpath("(//div[contains(@class,'MuiInputBase-root')])[16]/input"));
            BankBranch.click();
            BankBranch.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement addAnotherAccount=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div[2]/button"));
            addAnotherAccount.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement shippingPolicies=driver.findElement(By.name("shippingPolicy"));
            shippingPolicies.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            shippingPolicies.sendKeys(Keys.DELETE);
            shippingPolicies.sendKeys("This is ready to ship");

            WebElement refundPolicies=driver.findElement(By.name("refundPolicy"));
            refundPolicies.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            refundPolicies.sendKeys(Keys.DELETE);
            refundPolicies.sendKeys("This is the refund policies");

            WebElement cancellationPolicies=driver.findElement(By.name("returnPolicy"));
            cancellationPolicies.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            cancellationPolicies.sendKeys(Keys.DELETE);
            cancellationPolicies.sendKeys("This is the cancellation policies");

            Savebutton=driver.findElement(By.xpath("//div[@class=\"flex mt-5 justify-end\"]/button"));
            Savebutton.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Okbutton=driver.findElement(By.xpath("(//div[contains(@class,'flex w-full')])/button"));
            Okbutton.click();


        }


    }







