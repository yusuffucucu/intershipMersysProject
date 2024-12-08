package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void mySendKeys(WebElement element, String elementName)
    {
wait.until(ExpectedConditions.visibilityOf(element));
scrolltoElement(element);
element.clear();
element.sendKeys(elementName);



    }
public void myClick(WebElement element)
{
    wait.until(ExpectedConditions.elementToBeClickable(element));
    scrolltoElement(element);
    element.click();


}
    public void scrolltoElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);

    } // elementi assert etmek icin metod
public void verifyContainText(WebElement element,String value)
{
    wait.until(ExpectedConditions.textToBePresentInElement(element,value));
    Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
}
    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        WebElement MesajKutusuParent2=GWD.getDriver().findElement(By.tagName("mat-panel-description"));  //mat-expansion-panel-header
        Assert.assertTrue( MesajKutusuParent2.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }


}


