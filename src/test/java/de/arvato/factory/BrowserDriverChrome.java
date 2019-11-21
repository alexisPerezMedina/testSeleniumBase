package de.arvato.factory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriverChrome extends BrowserDriver {

  protected static WebDriver driver;

  protected static String driverPath = System.getProperty("user.dir").concat(File.separator)
      .concat("resources").concat(File.separator).concat("chromedriver.exe");

  private final static Logger browserDriverChromeLog = Logger.getLogger(BrowserDriverChrome.class);

  public BrowserDriverChrome(WebDriver driver) {
    super(driver);
  }

  @Override
  public WebDriver setBrowser() {
    browserDriverChromeLog.info("## Executing Chrome Driver");
    System.setProperty("webdriver.chrome.driver", driverPath);
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
  }
}