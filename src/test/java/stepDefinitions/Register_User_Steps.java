package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Register_User_Steps {
    private final WebDriver driver = Hooks.driver;

    @Given("User already access the Autoexercise Web")
    public void user_already_access_the_autoexercise_web() {
        driver.get("https://automationexercise.com/");
    }

    @When("User validate that the homepage is visible successfully")
    public void user_validate_that_the_homepage_is_visible_successfully() throws InterruptedException {
        Thread.sleep(3000);
        WebElement homepage_Visible = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
        assert homepage_Visible.isDisplayed() : "Homepage is not visible";

    }

    @And("click on Signup or Login Button")
    public void click_on_signup_or_login_button() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    @And("User input name {string}")
    public void user_input_name(String name) {
        WebElement input_Name = driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));

        input_Name.clear();
        input_Name.sendKeys(name);

    }

    @And("User input email {string}")
    public void user_input_email(String email) {
        WebElement input_Email = driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));

        input_Email.clear();
        input_Email.sendKeys(email);
    }

    @And("User click on Signup Button")
    public void user_click_on_signup_button() {
        driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
    }

    @And("User choose the {string} radio button")
    public void user_choose_the_radio_button(String radio) {
        WebElement radio_Button = driver.findElement(By.xpath("//input[@type=\"radio\"]"));

        radio_Button.click();
    }

    @And("User input password {string}")
    public void user_input_password(String password) {
        WebElement input_Password = driver.findElement(By.xpath("//input[@type=\"password\"]"));

        input_Password.clear();
        input_Password.sendKeys(password);
    }

    @And("User selects the day of birth as {string}")
    public void user_selects_the_day_of_birth_as(String day) throws InterruptedException {
        Thread.sleep(3000);
        WebElement input_Day = driver.findElement(By.xpath("//select[@data-qa=\"days\"]"));

        Select select = new Select(input_Day);

        select.selectByVisibleText(day);
    }

    @And("User selects the month of birth as {string}")
    public void user_selects_the_month_of_birth_as(String month) throws InterruptedException {
        Thread.sleep(3000);
        WebElement input_Month = driver.findElement(By.xpath("//select[@data-qa=\"months\"]"));

        Select select = new Select(input_Month);

        select.selectByVisibleText(month);
    }

    @And("User selects the year of birth as {string}")
    public void user_selects_the_year_of_birth_as(String year) throws InterruptedException {
        Thread.sleep(3000);
        WebElement input_Year = driver.findElement(By.xpath("//select[@data-qa=\"years\"]"));

        Select select = new Select(input_Year);

        select.selectByVisibleText(year);
    }

    @And("User input first name {string}")
    public void user_input_first_name(String firstName) {
        WebElement input_First_Name = driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]"));

        input_First_Name.clear();
        input_First_Name.sendKeys(firstName);
    }

    @And("User input last name {string}")
    public void user_input_last_name(String lastName) {
        WebElement input_Last_Name = driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]"));

        input_Last_Name.clear();
        input_Last_Name.sendKeys(lastName);
    }

    @And("User input address {string}")
    public void user_input_address(String address) {
        WebElement input_Address = driver.findElement(By.xpath("//input[@data-qa=\"address\"]"));

        input_Address.clear();
        input_Address.sendKeys(address);
    }

    @And("User selects the country as {string}")
    public void user_selects_the_country_as(String country) {
        WebElement input_Country = driver.findElement(By.xpath("//select[@data-qa=\"country\"]"));

        Select select = new Select(input_Country);

        select.selectByVisibleText(country);
    }

    @And("User input state {string}")
    public void user_input_state(String state) {
        WebElement input_State = driver.findElement(By.xpath("//input[@data-qa=\"state\"]"));

        input_State.clear();
        input_State.sendKeys(state);
    }

    @And("User input city {string}")
    public void user_input_city(String city) {
        WebElement input_City = driver.findElement(By.xpath("//input[@data-qa=\"city\"]"));

        input_City.clear();
        input_City.sendKeys(city);
    }

    @And("User input zip code {string}")
    public void user_input_zip_code(String zipCode) {
        WebElement input_Zip_Code = driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]"));

        input_Zip_Code.clear();
        input_Zip_Code.sendKeys(zipCode);
    }

    @And("User input phone number {string}")
    public void user_input_phone_number(String phone) throws InterruptedException {
        Thread.sleep(5000);
        WebElement input_Phone = driver.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]"));

        input_Phone.clear();
        input_Phone.sendKeys(phone);
    }

    @And("User click on create account button")
    public void user_click_on_create_account_button() {
        driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
    }

    @Then("User should be presented with a successful create account message")
    public void user_should_be_presented_with_a_successful_create_account_message() {
        WebElement success_Create_Account = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[1]"));

        Assert.assertEquals(success_Create_Account.getText(), "Congratulations! Your new account has been successfully created!");

    }

    @And("User click on continue button")
    public void user_click_on_continue_button() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }

    @And("User verify login as their username is visible")
    public void user_verify_login_as_their_username_is_visible() throws InterruptedException {
        Thread.sleep(3000);
        WebElement visible_Username = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));

        assert visible_Username.isDisplayed() : "Logged in as not visible";

    }

    @And("User click delete account button")
    public void user_click_delete_account_button() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();

    }

    @And("User verify their account been deleted")
    public void user_verify_their_account_been_deleted() throws InterruptedException {
        Thread.sleep(3000);
        WebElement account_Deleted = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[1]"));

        Assert.assertEquals(account_Deleted.getText(), "Your account has been permanently deleted!");
    }

    @And("User click on another continue button")
    public void user_click_on_another_continue_button() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }

    @Then("User should be presented with a homepage")
    public void user_should_be_presented_with_a_homepage() throws InterruptedException {
          user_validate_that_the_homepage_is_visible_successfully();
    }

    @Then("User should see the email Address already exist! warning")
    public void user_should_see_the_email_address_already_exist_warning() throws InterruptedException {
        Thread.sleep(3000);
        WebElement incorrect_Warning = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/p"));

        Assert.assertEquals(incorrect_Warning.getText(), "Email Address already exist!");
    }
}
