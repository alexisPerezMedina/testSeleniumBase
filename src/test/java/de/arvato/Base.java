package de.arvato;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import de.arvato.configuration.InitializeConfig;
import de.arvato.factory.BrowserDriver;
import de.arvato.factory.BrowserFactory;
import de.arvato.singleton.Preferences;

/**
 * <strong>Base</strong> handles setup and teardown of WebDriver.
 * 
 * @author pere237
 */
public class Base {

  protected static WebDriver driver;

  protected static BrowserFactory authenticationFactory = new BrowserFactory();

  protected static Preferences preferences = Preferences.getConfigurator();

  @BeforeClass
  public static void setUp() {
    InitializeConfig.initializeYmlParameters();
    BrowserDriver browserDriver = authenticationFactory.getAuthentication(driver,
        preferences.getBrowser());
    driver = browserDriver.setBrowser();
  }

  @After
  public void cleanUp() {
    driver.manage().deleteAllCookies();
  }

  @AfterClass
  public static void tearDown() {
    driver.quit();
  }

}