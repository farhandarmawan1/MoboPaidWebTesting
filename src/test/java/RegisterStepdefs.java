import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.RegisterUser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class RegisterStepdefs {
    private WebDriver webDriver;
    public RegisterStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^user already on page register$")
    public void userAlreadyOnPageRegister() throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//input[@id='signatory_first_name']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @When("^user input first name \"([^\"]*)\"$")
    public void userInputFirstName(String arg0) throws InterruptedException {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setFieldFirstname(arg0);
        Thread.sleep(1000);
    }

    @And("^user input field last name \"([^\"]*)\"$")
    public void userInputFieldLastName(String arg0) throws Throwable {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setFieldLastName(arg0);
        Thread.sleep(1000);
    }

    @And("^user input field email \"([^\"]*)\"$")
    public void userInputFieldEmail(String arg0) throws Throwable {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setFieldEmail(arg0);
        Thread.sleep(1000);
    }

    @And("^user input field password \"([^\"]*)\"$")
    public void userInputFieldPassword(String arg0) throws Throwable {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setFieldPassword(arg0);
        Thread.sleep(1000);
    }

    @And("^user input field company name \"([^\"]*)\"$")
    public void userInputFieldComanyName(String arg0) throws Throwable {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setFieldCompany(arg0);
        Thread.sleep(1000);
    }

    @And("^user input field phone \"([^\"]*)\"$")
    public void userInputFieldPhone(String arg0) throws Throwable {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setFieldPhone(arg0);
        Thread.sleep(1000);
    }


    @And("^user select dropdown country \"([^\"]*)\"$")
    public void userSelectDropdownCountry() throws Throwable {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setClickSelectCountry();
        registerUser.setSelectCountry();
        Thread.sleep(1000);

    }

    @And("^user click terms privacy statment$")
    public void userClickTermsPrivacyStatment() throws InterruptedException {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setClickSelectCountry();
        registerUser.setSelectCountry();
        Thread.sleep(1000);
    }

    @Then("^user click button next step$")
    public void userClickButtonNextStep() throws InterruptedException {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setBtnResgister();
        Thread.sleep(1000);
    }

    @And("^user succesfuly registered account$")
    public void userSuccesfulyRegisteredAccount() throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//h1[.='Survey Questions']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^user select dropdown state \"([^\"]*)\"$")
    public void userSelectDropdownState() throws Throwable {
        RegisterUser registerUser = new RegisterUser(webDriver);
        registerUser.setClickSelectState();
        registerUser.setSelectState();
        Thread.sleep(1000);
    }
}
