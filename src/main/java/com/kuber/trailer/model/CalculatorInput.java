package com.kuber.trailer.model;

import java.util.Objects;

public class CalculatorInput {

    private int operand1;

    private int operand2;

    private Operation operation;

    public CalculatorInput() {
    }

    public CalculatorInput(int operand1, int operand2, Operation operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorInput that = (CalculatorInput) o;
        return operand1 == that.operand1 && operand2 == that.operand2 && operation == that.operation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation);
    }
}
