package de.arvato.singleton;

import java.util.HashMap;
import java.util.Map;

public class Preferences {

  private static Preferences preferences;

  private String browser;

  private HashMap<String, String> urls;

  public static Preferences getConfigurator() {
    if (preferences == null) {
      preferences = new Preferences();
    }
    return preferences;
  }

  private Preferences() {}

  public Map<String, String> getUrls() {
    return urls;
  }

  public void setUrls(HashMap<String, String> urls) {
    this.urls = urls;
  }

  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }

}