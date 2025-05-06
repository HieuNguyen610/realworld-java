package com.mods.orderservice.beans;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorService {
    private final Calculator calculator;

    @GetMapping("/")
    public int calculate(@RequestParam int lhs, @RequestParam int rhs, @RequestParam char op) {
        return calculator.calculate(lhs, rhs, op);
    }

}
