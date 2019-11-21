package de.arvato.factory;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {

  public BrowserDriver getAuthentication(WebDriver driver, String browser) {
    if (browser == null) {
      return null;
    }
    if (browser.equalsIgnoreCase("Chrome")) {
      return new BrowserDriverChrome(driver);
    } else if (browser.equalsIgnoreCase("IE")) {
      return new BrowserDriverExplorer(driver);
    } else if (browser.equalsIgnoreCase("Firefox")) {
      return new BrowserDriverFirefox(driver);
    } else {
      return new BrowserDriverFirefox(driver);
    }
  }
}