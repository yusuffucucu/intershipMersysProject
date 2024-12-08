package StepDefinitions;

import Pages.DetailsPage;
import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class deleteOutMessagingSteps {
    MainMenuPage MMP = new MainMenuPage();
    DetailsPage DP = new DetailsPage();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));



    @When("Delete outbox message")
    public void deleteOutboxMessage() {
        Actions actions = new Actions(GWD.getDriver());
    MMP.myClick(MMP.hamburgerMenuButton);
    MMP.myClick(MMP.messagingButton);
    MMP.myClick(MMP.outBoxButton);
    DP.myClick(DP.message);
    DP.myClick(DP.confirmDeleteYes);



    }

    @Then("The deletion process should be successfuly")
    public void theDeletionProcessShouldBeSuccessfuly() {
        DP.verifyMessageContainsText("successfully");


    }


}
