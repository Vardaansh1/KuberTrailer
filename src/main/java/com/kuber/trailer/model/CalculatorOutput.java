package com.kuber.trailer.model;

import java.util.Objects;

public class CalculatorOutput {

    private int output;

    public CalculatorOutput() {
    }

    public CalculatorOutput(int output) {
        this.output = output;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorOutput that = (CalculatorOutput) o;
        return output == that.output;
    }

    @Override
    public int hashCode() {
        return Objects.hash(output);
    }
}
