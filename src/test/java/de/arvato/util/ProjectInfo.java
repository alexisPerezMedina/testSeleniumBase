package de.arvato.util;

import java.io.File;

/**
 * Utility class ProjectInfo
 * 
 * @author pere237
 */
public class ProjectInfo {

  public static String getConfig() {
    final String ymlConfig = "config.yml";
    return System.getProperty("user.dir").concat(File.separator).concat("resources")
        .concat(File.separator).concat(ymlConfig);
  }
}
