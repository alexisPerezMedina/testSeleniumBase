package de.arvato.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import de.arvato.page.object.component.LoginPage;
import de.arvato.page.object.component.LoginReceiptPage;
import de.arvato.page.object.component.SettingsLanguagePage;
import de.arvato.singleton.Preferences;

public class ShowHomeServiceImpl implements ShowHomeService {

  Preferences preferences = Preferences.getConfigurator();

  public void login(WebDriver driver) throws Exception {
    driver.get(preferences.getUrls().get("showHome"));

    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterUserPassword("seleniumtest2", "Barcelona1!");
    LoginReceiptPage loginReceiptPage = loginPage.submitLogin();

    assertTrue(loginReceiptPage.isInitialized());
    assertEquals("Welcome to erWin Online", loginReceiptPage.confirmationHeader());
  }

  public void settingsLanguage(WebDriver driver) throws Exception {
    driver.get(preferences.getUrls().get("showHome"));

    SettingsLanguagePage settingsLanguagePage = new SettingsLanguagePage(driver);
    settingsLanguagePage.changeInterfaceLanguageEN();
    settingsLanguagePage.changeArticleLanguageEN();

    assertEquals("Welcome to erWin Online", settingsLanguagePage.confirmationHeader());
  }
}