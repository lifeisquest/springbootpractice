package com.grapheople.steven.controllers;

import com.grapheople.steven.controllers.domain.CustomErrorType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Steven Jee
 * @since v.
 */
@ControllerAdvice(basePackageClasses = BasicController.class)
public class BasicControllerAdvice {
  @ExceptionHandler(NullPointerException.class)
  @ResponseBody
  ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
    HttpStatus status = getStatus(request);
    return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
  }

  private HttpStatus getStatus(HttpServletRequest request) {
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
    if (statusCode == null) {
      return HttpStatus.INTERNAL_SERVER_ERROR;
    }
    return HttpStatus.valueOf(statusCode);
  }
}
