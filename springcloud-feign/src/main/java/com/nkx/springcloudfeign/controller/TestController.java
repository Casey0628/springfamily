package com.nkx.springcloudfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nkx.springcloudfeign.client.OrderClient;

@RestController
public class TestController {

  @Autowired
  private OrderClient orderClient;

  @RequestMapping("tets")
  public Long test(){
    return orderClient.creatOrderNum();
  }
}