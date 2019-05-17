package FrontEndUiAutomation;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.className;

public class AirPointLogin
{
  @Test
  public static void main(String[] args)
  {
    Dimension screenSize = new Dimension(700,864);
    ChromeDriver driver = new ChromeDriver();
   // driver.manage().window().setSize(screenSize);
   // System.out.println("testing screen size: " + driver.manage().window().getSize());

    driver.get("https://flightbookings.airnewzealand.co.nz/vbook/actions/search");

    try
    {
      Thread.sleep(5000);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    //click open login panel
    WebElement element = driver.findElementByClassName("vui-loginheader");
    element.click();

    try
    {
      Thread.sleep(3000);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }

    //key-in login details and login
    WebElement username = driver.findElementByCssSelector(".vui-login-username ").findElement(By.className("form-control"));
    username.click();
    username.sendKeys("1013775");


    WebElement password = driver.findElementByCssSelector(".vui-login-password").findElement(By.className("form-control"));
    username.click();
    password.sendKeys("onLineIV01");

    WebElement login = driver.findElementByCssSelector(".vui-login-signin");
    login.click();

    //Verify user login successful
    WebDriverWait wait = new WebDriverWait(driver,3);
    //using xpath
    //WebElement userInfo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='vui-loginheader-toggle vui-loginheader-action vui-link-primary vui-link-unstyled']")));
    //using cssSelector
    WebElement userInfo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.vui-loginheader-toggle.vui-loginheader-action.vui-link-primary.vui-link-unstyled")));
    userInfo.click();

    driver.close();

  }

}
