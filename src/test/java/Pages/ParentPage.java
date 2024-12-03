package Pages;

import Utilities.GWD;
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
element.clear();
element.sendKeys(elementName);
scrollToElement(element);


    }
public void myClick(WebElement element)
{
    wait.until(ExpectedConditions.elementToBeClickable(element));
    scrollToElement(element);
    element.click();


}
public void scrollToElement(WebElement element)
{
    JavascriptExecutor js= (JavascriptExecutor)GWD.getDriver();
    js.executeScript("arguments[0].scrollIntoView");

} // elementi assert etmek icin metod
public void verifyContainText(WebElement element,String value)
{
    wait.until(ExpectedConditions.textToBePresentInElement(element,value));
    Assert.assertTrue(element.getText().toLowerCase().equals(value.toLowerCase()));
}


}
