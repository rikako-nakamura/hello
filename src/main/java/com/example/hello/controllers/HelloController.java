package com.example.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
  @GetMapping("hello")
  @ResponseBody
  public String helloRikako(){
    return "Hello, Rikako";
  }

  @GetMapping("/sayHello")
  public String sayHello(){
    return "hello";
  }

  @GetMapping("/greetModel")
  public String greetModel(Model model) {
    String word = "Hello,Rika!（model）";
    model.addAttribute("message", word);
    return "greetmodel";
  }
}
