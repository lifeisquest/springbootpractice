package com.grapheople.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import java.util.Arrays;

/**
 * @author Steven Jee
 * @since v.
 */
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(WebApplication.class);
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(WebApplication.class, args);
  }
}
