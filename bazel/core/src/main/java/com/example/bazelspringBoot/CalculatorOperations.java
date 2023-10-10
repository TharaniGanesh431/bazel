package com.example.bazelspringBoot;

import org.springframework.stereotype.Service;

@Service
public class CalculatorOperations {
    public String add(int a, int b) {
        return String.valueOf(a).concat(" + ").concat(String.valueOf(b)).concat(" = ").concat(String.valueOf(a + b));
    }
}
