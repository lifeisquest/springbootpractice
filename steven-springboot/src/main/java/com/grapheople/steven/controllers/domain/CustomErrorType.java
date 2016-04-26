package com.grapheople.steven.controllers.domain;

import lombok.Data;

/**
 * @author Steven Jee
 * @since v.
 */
@Data
public class CustomErrorType {
  private int error_code;
  private String message;
  public CustomErrorType(int error_code, String message){
    this.error_code = error_code;
    this.message = message;
  }
}
