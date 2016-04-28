package com.lifeisquest.controller;

import com.lifeisquest.model.AppConstants;
import com.lifeisquest.util.MessageCode;
import com.lifeisquest.util.ResponseObj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason Park
 * @since v1.0
 */
@RestController
@RequestMapping(value = "api")
public class AppController {

  @Autowired
  AppConstants appConstants;

  @Value("${app.server-url}")
  private String appServerUrl;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ResponseObj hello() {

    return new ResponseObj(MessageCode.SUCCESS);
  }

  @RequestMapping(value = "/app/name", method = RequestMethod.GET)
  public ResponseObj getAppName() {

    return new ResponseObj(MessageCode.SUCCESS, this.appConstants.getAppName());
  }

  @RequestMapping(value = "/app/url", method = RequestMethod.GET)
  public ResponseObj getAppUrl() {

    return new ResponseObj(MessageCode.SUCCESS, this.appServerUrl);
  }
}
