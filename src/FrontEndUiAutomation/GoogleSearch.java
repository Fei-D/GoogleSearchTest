package FrontEndUiAutomation;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch
{
  @Test
  public static void main(String[] args) {
    //New instance of Chrome driver
    ChromeDriver driver = new ChromeDriver();

    //Open google.com
    driver.get("https://www.google.co.nz");

    //Search for NBA scores and
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("NBA scores");
    element.submit();

    //select and open first result link

  // assign all h3 to a list and click open the first link
   /* List<WebElement> fei = driver.findElements(By.tagName("h3"));
    fei.get(0).click(); */

    //use Css Selector to get the first h3 element and click open the link
    driver.findElementByCssSelector("#rso").findElements(By.tagName("h3")).get(0).click();
  }
}
