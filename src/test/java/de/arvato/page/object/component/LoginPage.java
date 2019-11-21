package de.arvato.page.object.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import de.arvato.page.object.PageObject;

public class LoginPage extends PageObject {

  @FindBy(name = "loginName")
  private WebElement loginName;

  @FindBy(name = "password")
  private WebElement password;

  @FindBy(name = "method")
  private WebElement submitButton;

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public void enterUserPassword(String loginName, String password) {
    type(this.loginName, loginName, driver);
    type(this.password, password, driver);
  }

  public LoginReceiptPage submitLogin() throws Exception {
    click(submitButton, driver);
    return new LoginReceiptPage(driver);
  }

}