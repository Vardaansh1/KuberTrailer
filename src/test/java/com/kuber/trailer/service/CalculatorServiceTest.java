package com.kuber.trailer.service;

import com.kuber.trailer.model.CalculatorInput;
import com.kuber.trailer.model.CalculatorOutput;
import com.kuber.trailer.model.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void calculate_shouldAddNumbers_whenGivenValidInput() {
        final CalculatorInput calculatorInput = new CalculatorInput(1, 1, Operation.ADD);
        final CalculatorOutput expected = new CalculatorOutput(2);

        final CalculatorOutput actual = calculatorService.calculate(calculatorInput);

        assertEquals(expected, actual);
    }

    @Test
    void calculate_shouldSubtractNumbers_whenGivenValidInput() {
        final CalculatorInput calculatorInput = new CalculatorInput(1, 4, Operation.SUBTRACT);
        final CalculatorOutput expected = new CalculatorOutput(-3);

        final CalculatorOutput actual = calculatorService.calculate(calculatorInput);

        assertEquals(expected, actual);
    }
}