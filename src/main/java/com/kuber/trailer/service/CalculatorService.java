package com.kuber.trailer.service;

import com.kuber.trailer.model.CalculatorInput;
import com.kuber.trailer.model.CalculatorOutput;
import jakarta.inject.Singleton;

@Singleton
public class CalculatorService {

    public CalculatorOutput calculate(CalculatorInput input) {
        return switch (input.getOperation()) {
            case ADD -> new CalculatorOutput(input.getOperand1() + input.getOperand2());

            case SUBTRACT -> new CalculatorOutput(input.getOperand1() - input.getOperand2());
        };
    }
}

