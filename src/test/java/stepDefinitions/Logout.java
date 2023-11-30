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
