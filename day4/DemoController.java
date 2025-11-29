package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DemoController {

    //run this application from terminal -> CTRL + J => .\mvnw spring-boot:run
    //hit this endpoint URL from browser http://localhost:8080/kuchbhi
    
    @GetMapping("/kuchbhi")
    public String foo() {
        return "I am from foo";
    }
    //CW1: Create endpoint /mycalc with method GET POST PUT DELETE
    //GET => Addition of 2 numbers
    //POST => Subtraction 
    //PUT => Multiplication
    //DELETE => Division

    // http://localhost:8080/sqr?num=5
    @GetMapping("/sqr")
    public String getMethodName(@RequestParam String num) {
        return "Num: " + num;
    }

    @GetMapping("/mycalc")
    public String add(@RequestParam String num1, @RequestParam String num2) {
        int x = Integer.parseInt(num1); //5; //read from url request param
        int y = Integer.parseInt(num2); //6; //read from url request param
        return x + " + " + y + " = " + (x + y);
    }

    @PostMapping("/mycalc") //call this endpoint from postman or thunderclient
    public String sub(@RequestBody Map<String, Object> body) {
        int x = (int) body.get("num1");
        int y = (int) body.get("num2");
        return x + " - " + y + " = " + (x - y) ;
    } 
    
}
