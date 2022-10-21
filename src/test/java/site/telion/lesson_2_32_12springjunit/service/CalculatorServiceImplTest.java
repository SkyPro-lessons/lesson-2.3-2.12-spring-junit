package site.telion.lesson_2_32_12springjunit.service;

import org.junit.jupiter.api.Test;
import site.telion.lesson_2_32_12springjunit.exception.DivideByNullException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    private final CalculatorService service = new CalculatorServiceImpl();

    @Test
    public void when5plus5equals10_thenSucceeds() {
        Double a = 5.0;
        Double b = 5.0;

        String expected = service.printSolutionPlus(a, b);
        String actual = "5.0 + 5.0 = 10.0";

        assertEquals(expected, actual);
    }

    @Test
    public void whenNegative5plusNegative5equalsNegative10_thenSucceeds() {
        Double a = -5.0;
        Double b = -5.0;

        String expected = service.printSolutionPlus(a, b);
        String actual = "-5.0 + -5.0 = -10.0";

        assertEquals(expected, actual);
    }

    @Test
    public void when5minus5equals0_thenSucceeds() {
        Double a = 5.0;
        Double b = 5.0;

        String expected = service.printSolutionMinus(a, b);
        String actual = "5.0 - 5.0 = 0.0";

        assertEquals(expected, actual);
    }

    @Test
    public void whenNegative5minusNegative5equals0_thenSucceeds() {
        Double a = -5.0;
        Double b = -5.0;

        String expected = service.printSolutionMinus(a, b);
        String actual = "-5.0 - -5.0 = 0.0";

        assertEquals(expected, actual);
    }

    @Test
    public void when5multiply5equals25_thenSucceeds() {
        Double a = 5.0;
        Double b = 5.0;

        String expected = service.printSolutionMultiply(a, b);
        String actual = "5.0 * 5.0 = 25.0";

        assertEquals(expected, actual);
    }

    @Test
    public void when0multiply5equals0_thenSucceeds() {
        Double a = 0.0;
        Double b = 5.0;

        String expected = service.printSolutionMultiply(a, b);
        String actual = "0.0 * 5.0 = 0.0";

        assertEquals(expected, actual);
    }

    @Test
    public void when5divide5equals1_thenSucceeds() {
        Double a = 5.0;
        Double b = 5.0;

        String expected = service.printSolutionDivide(a, b);
        String actual = "5.0 / 5.0 = 1.0";

        assertEquals(expected, actual);
    }

    @Test
    public void when0divide5equals0_thenSucceeds() {
        Double a = 0.0;
        Double b = 5.0;

        String expected = service.printSolutionDivide(a, b);
        String actual = "0.0 / 5.0 = 0.0";

        assertEquals(expected, actual);
    }

    @Test
    public void when5divide0throwException_thenSucceeds() {
        Double a = 5.0;
        Double b = 0.0;

        Exception exception = assertThrows(DivideByNullException.class, () ->
                service.printSolutionDivide(a, b));

        String expected = "Деление на ноль";
        String actual = exception.getMessage();

        assertTrue(actual.contains(expected));
    }

}
