package de.arvato.page.object.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import de.arvato.page.object.PageObject;

public class LoginReceiptPage extends PageObject {

  @FindBy(id = "headline-1")
  private WebElement header;

  public LoginReceiptPage(WebDriver driver) {
    super(driver);
  }

  public boolean isInitialized() {
    return header.isDisplayed();
  }

  public String confirmationHeader() {
    return header.getText();
  }

}