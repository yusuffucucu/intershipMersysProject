package Pages;

import Utilities.GWD;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainMenuPage extends ParentPage {
    public MainMenuPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement userName;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]//span[2]")
    public WebElement hamburgerMenuButton;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingButton;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outBoxButton;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trashButton;


//    public WebElement getwebElement(String elementName) {
//        switch (elementName) {
//            case "hamburgerMenuButton":return this.hamburgerMenuButton;
//            case  "messagingButton":return this.messagingButton;
//            case "outBoxButton" :return  this.outBoxButton;
//        }
//        return null;
//    }
}
