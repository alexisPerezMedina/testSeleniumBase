package de.arvato.factory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFirefox extends BrowserDriver {

  protected static WebDriver driver;

  protected static String driverPath = System.getProperty("user.dir").concat(File.separator)
      .concat("resources").concat(File.separator).concat("geckodriver.exe");

  private final static Logger browserDriverFirefoxLog = Logger.getLogger(BrowserDriverChrome.class);

  public BrowserDriverFirefox(WebDriver driver) {
    super(driver);
  }

  @Override
  public WebDriver setBrowser() {
    browserDriverFirefoxLog.info("## Executing Firefox Driver");
    System.setProperty("webdriver.gecko.driver", driverPath);
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
  }
}