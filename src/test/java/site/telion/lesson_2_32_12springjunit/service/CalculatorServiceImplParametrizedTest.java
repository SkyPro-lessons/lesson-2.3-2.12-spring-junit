package site.telion.lesson_2_32_12springjunit.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static site.telion.lesson_2_32_12springjunit.service.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParametrizedTest {

    private final CalculatorService service = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(FIVE, FIVE),
                Arguments.of(NEGATIVE_FIVE, NEGATIVE_FIVE)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectPlusNumbers(Double a, Double b) {
        String expected = service.printSolutionPlus(a, b);
        String actual = a + " + " + b + " = " + (a + b);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectMinusNumbers(Double a, Double b) {
        String expected = service.printSolutionMinus(a, b);
        String actual = a + " - " + b + " = " + (a - b);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectMultiplyNumbers(Double a, Double b) {
        String expected = service.printSolutionMultiply(a, b);
        String actual = a + " * " + b + " = " + (a * b);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCorrectDivideNumbers(Double a, Double b) {
        String expected = service.printSolutionDivide(a, b);
        String actual = a + " / " + b + " = " + (a / b);
        assertEquals(actual, expected);
    }



}