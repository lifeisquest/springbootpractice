package com.lifeisquest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Jason Park
 * @since v1.0
 */
@Component
@ConfigurationProperties(prefix = "props")
public class AppProps {

  private String appName;

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }
}
