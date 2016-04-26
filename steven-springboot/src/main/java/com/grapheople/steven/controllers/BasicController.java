package com.grapheople.steven.controllers;

import org.omg.CORBA.Object;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Steven Jee
 * @since v1.0.
 */
@Controller
@Slf4j
public class BasicController {
  @RequestMapping("/greeting")
  public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }

  @RequestMapping("/greeting2")
  public String greeting2(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
    model.addAttribute("name", name);
    return "views/test";
  }

  @RequestMapping("/advice")
  public String advice() {
    String a = null;
    a.equals("test");
    return null;
  }

  @RequestMapping("/exception")
  public String exception() {

    int a = 10;
    int b = 0;
    int c = a / b;
    return null;
  }

  @ExceptionHandler(NullPointerException.class)
  public ModelAndView handleError(HttpServletRequest req, Exception exception) {
    log.error("Request: " + req.getRequestURL() + " raised " + exception);
    ModelAndView mav = new ModelAndView();
    mav.addObject("exception", exception);
    mav.addObject("url", req.getRequestURL());
    mav.setViewName("errorpage");
    return mav;
  }

}
