package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends ParentPage {
    public DetailsPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy (css = "")
    public WebElement userName;






}
