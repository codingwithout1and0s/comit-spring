package com.comit.spring.bean;

import java.math.BigDecimal;

public class Calculator {

    BigDecimal num1;
    BigDecimal num2;
    String operation;
    BigDecimal result;

    public BigDecimal getNum1() {
        return num1;
    }
    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }
    public BigDecimal getNum2() {
        return num2;
    }
    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public BigDecimal getResult() {
        return result;
    }
    public void setResult(BigDecimal result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("Calculator [num1=%s, num2=%s, operation=%s, result=%s]", num1, num2, operation, result);
    }

}