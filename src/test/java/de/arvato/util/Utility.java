package de.arvato.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import de.arvato.factory.BrowserDriverChrome;

/**
 * <strong>Utility</strong>
 * 
 * @author pere237
 */
public class Utility {

  private final static int timeout = 5;

  private final static Logger utilityLog = Logger.getLogger(BrowserDriverChrome.class);

  public void type(WebElement element, String contentTextBox, WebDriver driver) {
    try {
      new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element))
          .clear();
      new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element))
          .sendKeys(contentTextBox);
    } catch (WebDriverException e) {
      utilityLog.error("## Error: " + e);
    }
  }

  public void click(WebElement element, WebDriver driver) {
    try {
      new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element))
          .click();
    } catch (WebDriverException e) {
      utilityLog.error("## Error: " + e);
    }
  }

}
