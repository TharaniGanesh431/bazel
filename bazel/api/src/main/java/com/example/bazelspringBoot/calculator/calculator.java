package com.example.bazelspringBoot.calculator;

import com.example.bazelspringBoot.CalculatorOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
    @Autowired
    CalculatorOperations calculatorOperations;

    @GetMapping("/add")
    public String add(
            @RequestParam(defaultValue = "0") int a,
            @RequestParam(defaultValue = "0") int b) {
        return calculatorOperations.add(a, b);
    }
}
