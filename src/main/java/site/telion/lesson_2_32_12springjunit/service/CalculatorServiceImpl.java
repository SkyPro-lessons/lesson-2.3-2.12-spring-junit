package site.telion.lesson_2_32_12springjunit.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String printSolutionPlus(Double a, Double b) {
        checkNum(a, b);
        return a + " + " + b + " = " + (a + b);
    }

    @Override
    public String printSolutionMinus(Double a, Double b) {
        checkNum(a, b);
        return a + " - " + b + " = " + (a - b);
    }

    @Override
    public String printSolutionMultiply(Double a, Double b) {
        checkNum(a, b);
        return a + " * " + b + " = " + (a * b);
    }

    @Override
    public String printSolutionDivide(Double a, Double b) {
        checkNum(a, b);
        if (b == 0) {
            return "делить на 0 нельзя";
        }
        return a + " / " + b + " = " + (a / b * 1.0);
    }

    private void checkNum(Double a, Double b) {
        if (a == null) {
            throw new RuntimeException("Не передан параметр num1");
        }

        if (b == null) {
            throw new RuntimeException("Не передан параметр num2");
        }
    }

}
