package com.grapheople.steven.controllers;

import com.google.common.collect.Lists;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Steven Jee
 * @since v.
 */
@RestController
public class APIController {

  @RequestMapping("/api")
  public List<String> getStrings(){
    List<String> strings = Lists.newLinkedList();
    strings.add("Steven.Jee");
    strings.add("Jason.Park");
    strings.add("Jungku.Lee");
    return strings;
  }

  @RequestMapping("/test")
  public String test() {
    String a = null;
    a.equals("test");
    return null;
  }
}
