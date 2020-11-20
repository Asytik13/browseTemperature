package com.pluralsight.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GetcityController {

    @GetMapping("/getCity")
    public String getCity(Map<String, Object> model){
        model.put("message", "Please Enter city");
        return "getCity";
    }
}
