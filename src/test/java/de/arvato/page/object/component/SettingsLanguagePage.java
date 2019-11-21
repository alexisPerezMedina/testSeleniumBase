package de.arvato.page.object.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import de.arvato.page.object.PageObject;

public class SettingsLanguagePage extends PageObject {

  @FindBy(xpath = "/html/body/div[2]/div[5]/div[5]/div[3]/div/div[1]/form/select/option[5]")
  private WebElement interfaceLanguageEN;

  @FindBy(xpath = "/html/body/div[2]/div[5]/div[5]/div[3]/div/div[2]/form/select/option[6]")
  private WebElement articleLanguageEN;

  @FindBy(id = "headline-1")
  private WebElement header;

  public SettingsLanguagePage(WebDriver driver) {
    super(driver);
  }

  public void changeInterfaceLanguageEN() {
    click(interfaceLanguageEN, driver);
  }

  public void changeArticleLanguageEN() {
    click(articleLanguageEN, driver);
  }

  public String confirmationHeader() {
    return header.getText();
  }

}