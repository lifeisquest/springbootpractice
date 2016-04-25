package com.lifeisquest.controller;

import com.lifeisquest.util.MessageCode;
import com.lifeisquest.util.ResponseObj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason Park
 * @since v1.0
 */
@RestController
@RequestMapping(value = "api")
public class ProfileController {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ResponseObj hello() {

    return new ResponseObj(MessageCode.SUCCESS);
  }
}
