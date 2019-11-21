package de.arvato.test;

import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import de.arvato.Base;
import de.arvato.service.ShowHomeService;
import de.arvato.service.ShowHomeServiceImpl;

/**
 * <strong>ShowHomeTest</strong> test the action ShowHome and its components
 * 
 * @author pere237
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShowHomeTest extends Base {

  private static ShowHomeService showHomeService = new ShowHomeServiceImpl();

  private final static Logger showHomeTest = Logger.getLogger(ShowHomeService.class);

  @Test
  public void Test00_Initialize() {}

  @Test
  public void Test01_Login() {
    try {
      showHomeService.login(driver);
      showHomeTest.info("OK");
    } catch (Exception e) {
      showHomeTest.info("Error " + e.getMessage());
    }
  }

  @Test
  public void Test02_ChangeLanguage() {
    try {
      showHomeService.settingsLanguage(driver);
      showHomeTest.info("OK");
    } catch (Exception e) {
      showHomeTest.info("Error " + e.getMessage());
    }
  }
}