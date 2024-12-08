package StepDefinitions;

import Pages.DetailsPage;
import Pages.MainMenuPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class binControlSteps {
    DetailsPage DP = new DetailsPage();
    MainMenuPage MMP = new MainMenuPage();


    @When("Navigate to trash box")
    public void navigateToTrashBox() {
        MMP.myClick(MMP.hamburgerMenuButton);
        MMP.myClick(MMP.messagingButton);
        MMP.myClick(MMP.trashButton);


    }

    @And("Restore message on the trash box")
    public void restoreMessageOnTheTrashBox() {
        DP.myClick(DP.restoreIcon);

    }

    @And("successfully message should be displayed")
    public void successfullyMessageShouldBeDisplayed() {
        MMP.verifyMessageContainsText("successfully");
    }

    @And("delete message on the trash box")
    public void deleteMessageOnTheTrashBox() {
        DP.myClick(DP.deleteIcon);
        DP.myClick(DP.deleteToTrashBox);
    }
}
