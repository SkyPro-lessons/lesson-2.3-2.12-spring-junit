package site.telion.lesson_2_32_12springjunit.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplParametrizedTest {

    private final CalculatorService service = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForPlusTests() {
        return Stream.of(
                Arguments.of("5.0 + 5.0 = 10.0", 5.0, 5.0),
                Arguments.of("-5.0 + -5.0 = -10.0", -5.0, -5.0)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of("5.0 - 5.0 = 0.0", 5.0, 5.0),
                Arguments.of("-5.0 - -5.0 = 0.0", -5.0, -5.0)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of("5.0 * 5.0 = 25.0", 5.0, 5.0),
                Arguments.of("0.0 * 5.0 = 0.0", 0.0, 5.0)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of("5.0 / 5.0 = 1.0", 5.0, 5.0),
                Arguments.of("0.0 / 5.0 = 0.0", 0.0, 5.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTests")
    public void shouldCorrectPlusNumbers(String actual, Double a, Double b) {
        String expected = service.printSolutionPlus(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void shouldCorrectMinusNumbers(String actual, Double a, Double b) {
        String expected = service.printSolutionMinus(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldCorrectMultiplyNumbers(String actual, Double a, Double b) {
        String expected = service.printSolutionMultiply(a, b);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldCorrectDivideNumbers(String actual, Double a, Double b) {
        String expected = service.printSolutionDivide(a, b);
        assertEquals(expected, actual);
    }



}