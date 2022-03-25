package com.example.obg.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LoginExeption extends Exception{
  public LoginExeption(String msg){
    super(msg);
  }
}
