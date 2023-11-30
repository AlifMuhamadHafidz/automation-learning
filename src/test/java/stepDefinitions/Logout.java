package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

    private final WebDriver driver = Hooks.driver;

    @Given("User already access Autoexercise web")
    public void user_already_access_autoexercise_web() {
        driver.get("https://automationexercise.com");
    }

//    @When("User verify that the homepage is visible successfully")
//    public void user_verify_that_the_homepage_is_visible_successfully() throws InterruptedException {
//        Thread.sleep(3000);
//        WebElement homepage_Visible = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
//        assert homepage_Visible.isDisplayed() : "Homepage is not visible";
//    }
//    @And("User verify that login to your account page is visible")
//    public void user_verify_that_login_to_your_account_page_is_visible() throws InterruptedException {
//        Thread.sleep(3000);
//        WebElement login_Page_Visible = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
//        assert login_Page_Visible.isDisplayed() : "Login page is not visible";
//    }
//    @And("User input email {string} and password {string}")
//    public void user_input_email_and_password(String email, String password) {
//        WebElement input_email = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
//        WebElement input_password = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
//
//        input_email.clear();
//        input_email.sendKeys(email);
//
//        input_password.clear();
//        input_password.sendKeys(password);
//    }
//
//    @And("User click on login button")
//    public void user_click_on_login_button() {
//        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
//    }
//
//    @And("User verify login as their username is visible")
//    public void user_verify_login_as_their_username_is_visible() throws InterruptedException {
//        Thread.sleep(3000);
//        WebElement visible_Username = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
//
//        assert visible_Username.isDisplayed() : "Logged in as not visible";
//
//    }

    @And("User click logout button")
    public void user_click_logout_button() {
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    @Then("User should navigate back to login page")
    public void user_should_navigate_back_to_login_page() throws InterruptedException {
        Thread.sleep(2000);
        WebElement loginpage_Visible = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/h2"));
        assert loginpage_Visible.isDisplayed() : "Login page is not visible";
    }
}
