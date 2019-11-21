package de.arvato.configuration;

import java.util.HashMap;

public class SeleniumConfig {

  private String browser;

  private HashMap<String, String> urls;

  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }

  public HashMap<String, String> getUrls() {
    return urls;
  }

  public void setUrls(HashMap<String, String> urls) {
    this.urls = urls;
  }

}