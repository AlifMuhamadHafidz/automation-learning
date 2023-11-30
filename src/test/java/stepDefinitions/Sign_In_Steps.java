package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Sign_In_Steps {

    private final WebDriver driver = Hooks.driver;

    @Given("User already access the Autoexercise Website")
    public void user_already_access_the_autoexercise_website() {
        driver.get("https://automationexercise.com");
    }
    @When("User verify that the homepage is visible successfully")
    public void user_verify_that_the_homepage_is_visible_successfully() throws InterruptedException {
        Thread.sleep(3000);
        WebElement homepage_Visible = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
        assert homepage_Visible.isDisplayed() : "Homepage is not visible";
    }
    @And("User verify that login to your account page is visible")
    public void user_verify_that_login_to_your_account_page_is_visible() throws InterruptedException {
        Thread.sleep(3000);
        WebElement login_Page_Visible = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
        assert login_Page_Visible.isDisplayed() : "Login page is not visible";
    }
    @And("User input email {string} and password {string}")
    public void user_input_email_and_password(String email, String password) {
        WebElement input_email = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
        WebElement input_password = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));

        input_email.clear();
        input_email.sendKeys(email);

        input_password.clear();
        input_password.sendKeys(password);
    }
    @And("User click on login button")
    public void user_click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
    }
    @And("User click on delete account button")
    public void user_click_on_delete_account_button() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
    }
    @Then("User should be presented with account deleted page is visible")
    public void user_should_be_presented_with_account_deleted_page_is_visible() throws InterruptedException {
        Thread.sleep(3000);
        WebElement account_Deleted = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[1]"));

        Assert.assertEquals(account_Deleted.getText(), "Your account has been permanently deleted!");
    }

    @Then("User should see the your email or password is incorrect! warning")
    public void user_should_see_your_email_or_password_is_incorrect_warning() throws InterruptedException {
        Thread.sleep(3000);
        WebElement incorrect_Warning = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));

        Assert.assertEquals(incorrect_Warning.getText(), "Your email or password is incorrect!");

    }
}
