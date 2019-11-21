package de.arvato.factory;

import org.openqa.selenium.WebDriver;

public abstract class BrowserDriver {

  public BrowserDriver(WebDriver driver) {
    super();
  }

  abstract public WebDriver setBrowser();

}
