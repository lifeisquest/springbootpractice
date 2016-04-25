package com.lifeisquest.controller;

import com.lifeisquest.util.MessageCode;
import com.lifeisquest.util.ResponseObj;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Jason Park
 * @since v1.0
 */
@RestController
@RequestMapping(value = "api")
@ConfigurationProperties(prefix = "custom")
public class ProfileController {

  private List<String> title = new ArrayList<>();

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ResponseObj hello() {

    return new ResponseObj(MessageCode.SUCCESS);
  }

  @RequestMapping(value = "/title", method = RequestMethod.GET)
  public List<String> getTitle() {

    return this.title;
  }
}
