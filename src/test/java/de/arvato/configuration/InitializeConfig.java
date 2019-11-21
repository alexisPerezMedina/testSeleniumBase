package de.arvato.configuration;

import java.io.File;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import de.arvato.singleton.Preferences;
import de.arvato.util.ProjectInfo;

public class InitializeConfig {

  private static SeleniumConfig seleniumConfig;

  private final static Logger seleniumConfiglog = Logger.getLogger(InitializeConfig.class);

  public static void initializeYmlParameters() {

    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    Preferences preferences = Preferences.getConfigurator();
    try {
      seleniumConfig = mapper.readValue(new File(ProjectInfo.getConfig()), SeleniumConfig.class);
      preferences.setBrowser(seleniumConfig.getBrowser());
      preferences.setUrls(seleniumConfig.getUrls());
      seleniumConfiglog.info("# Configuration setted OK for yml");
    } catch (Exception e) {
      seleniumConfiglog.info("error");
    }
  }
}