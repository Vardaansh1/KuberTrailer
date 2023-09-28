package com.kuber.trailer.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.kuber.trailer.model.CalculatorInput;
import com.kuber.trailer.model.CalculatorOutput;
import com.kuber.trailer.service.CalculatorService;
import io.micronaut.context.ApplicationContext;

public class LambdaProxy implements RequestHandler<CalculatorInput, CalculatorOutput> {

    private final CalculatorService calculatorService;

    public LambdaProxy() {
        ApplicationContext applicationContext = ApplicationContext.run();
        this.calculatorService = applicationContext.createBean(CalculatorService.class);
    }

    @Override
    public CalculatorOutput handleRequest(CalculatorInput input, Context context) {
        return calculatorService.calculate(input);
    }
}
