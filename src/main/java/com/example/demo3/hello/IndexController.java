package com.example.demo3.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @RequestMapping(value = "/login")
    public String helloSpringBoot(){
        return "index";
    }

    @RequestMapping(value = "/returnIndex")
    @ResponseBody
    public String helloSpringBoots(){
        return "index";
    }

    @RequestMapping(value = "/returnString")
    public ResponseEntity<String> helloSpringBoots2(){
        return new ResponseEntity<String>("string", HttpStatus.OK);
    }
}
