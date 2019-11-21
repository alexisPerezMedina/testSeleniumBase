package de.arvato.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import de.arvato.util.Utility;

public class PageObject extends Utility {
  protected WebDriver driver;

  public PageObject(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
}