package com.example.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class TempController {

    private fianl Robot robot;

    public TempController(fianl robot) {
        Robot = robot;
    }





    @GetMapping
    @ResponseBody
    public String temp() throws JsonProcessingException {
        System.out.println(robot.toString());
        return "안녕하세요";
    }

}
