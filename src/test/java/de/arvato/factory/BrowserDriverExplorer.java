package de.arvato.factory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriverExplorer extends BrowserDriver {

  protected static WebDriver driver;

  protected static String driverPath = System.getProperty("user.dir").concat(File.separator)
      .concat("resources").concat(File.separator).concat("IEDriverServer.exe");

  private final static Logger browserDriverExplorerLog = Logger
      .getLogger(BrowserDriverChrome.class);

  public BrowserDriverExplorer(WebDriver driver) {
    super(driver);
  }

  @Override
  public WebDriver setBrowser() {
    browserDriverExplorerLog.info("## Executing IE Driver");
    System.setProperty("webdriver.ie.driver", driverPath);
    driver = new InternetExplorerDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
  }
}