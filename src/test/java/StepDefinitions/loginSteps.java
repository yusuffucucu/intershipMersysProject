package StepDefinitions;

import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginSteps {
    MainMenuPage MMP=new MainMenuPage();

    @Given("Navigate to Mersys")
    public void navigate_to_mersys() {
        GWD.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        MMP.mySendKeys(MMP.userName,"Student_7");
        MMP.mySendKeys(MMP.password,"S12345");
        MMP.myClick(MMP.loginButton);
    }
    @Then("User should Successfully")
    public void user_should_successfully() {
    }
}