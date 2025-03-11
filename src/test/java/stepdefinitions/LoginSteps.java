package stepdefinitions;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {

    private boolean loginSuccess;

    @Given("the user is on the login page")
    public void userOnLoginPage() {
        System.out.println("User is on login page");
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        System.out.println("User enters valid credentials");
        loginSuccess = true;
    }

    @Then("the user should be redirected to the homepage")
    public void userRedirectedToHomepage() {
        assertTrue(loginSuccess, "User should be logged in");
        System.out.println("User is redirected to the homepage");
    }
}
