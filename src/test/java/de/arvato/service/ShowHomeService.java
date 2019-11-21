package de.arvato.service;

import org.openqa.selenium.WebDriver;

public interface ShowHomeService {

  void login(WebDriver driver) throws Exception;

  void settingsLanguage(WebDriver driver) throws Exception;

}
