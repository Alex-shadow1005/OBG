package com.example.obg.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class LoginExeption extends Exception{
  public LoginExeption(String msg){
    super(msg);
  }
}
