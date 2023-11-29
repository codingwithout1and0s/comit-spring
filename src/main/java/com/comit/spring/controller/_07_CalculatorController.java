package com.comit.spring.controller;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.comit.spring.bean.Calculator;

@Controller
public class _07_CalculatorController {

    @GetMapping("/calculator")
    String show(Calculator calculator) {
        System.out.println("Showing Calculator");

//        return "calculator";
        return "calculator_boot";
    }

    @PostMapping("/calculator")
    String process(Calculator calc) {

        System.out.println("Calculator: " + calc);

        BigDecimal result = switch(calc.getOperation()) {
            case "+" -> {
                         System.out.println("Adding...");
                         yield calc.getNum1().add(calc.getNum2());
                        }
            case "-" -> calc.getNum1().subtract(calc.getNum2());
            case "*" -> calc.getNum1().multiply(calc.getNum2());
            case "/" -> calc.getNum1().divide(calc.getNum2(), MathContext.DECIMAL128);
            case "%" -> calc.getNum1().remainder(calc.getNum2());
            default -> throw new RuntimeException("Invalid Operation");
        };

        System.out.printf("Calculation Completed : %s ! %n",result);

        calc.setResult(result);

//        return "calculator";
        return "calculator_boot";
    }
}