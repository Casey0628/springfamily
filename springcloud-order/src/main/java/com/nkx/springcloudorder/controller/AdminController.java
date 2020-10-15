package com.nkx.springcloudorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

  @GetMapping("admin")
  public String foo(){
    return "Hello world";
  }
}