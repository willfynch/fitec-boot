package com.fitec.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fitec.service.Calculator;

@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    String sum(@RequestParam("a")  int a,@RequestParam("b") int b) {
        return String.valueOf(calculator.sum(a, b));
    }

}