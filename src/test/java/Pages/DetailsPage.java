package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DetailsPage extends ParentPage {
    public DetailsPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //US 06
    @FindBy(xpath = "(//tbody//td//button)[2]")
    public WebElement message;

    @FindBy(xpath = "//span[text()='Move to Trash']")
    public WebElement moveToTrash;

    @FindBy(xpath = "//mat-dialog-actions[@class='mat-mdc-dialog-actions mdc-dialog__actions']//div//button")
    public WebElement confirmDeleteYes;

    //US 07
    @FindBy(xpath = "(//tbody//td//button)[2]")
    public WebElement restoreIcon;

    @FindBy(xpath = "(//tbody//td//button)[3]")
    public WebElement deleteIcon;

    @FindBy(xpath = "(//button[@type='submit']//span)[2]")
    public WebElement deleteToTrashBox;

    //US 08


}
