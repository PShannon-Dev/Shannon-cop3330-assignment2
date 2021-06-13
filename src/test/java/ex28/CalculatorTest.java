package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void positive_numbers() {
        Calculator calc = new Calculator();

        int[] arr = {1,1,1,1,1};
        calc.setNumbers(arr);

        assertEquals(5,calc.calctotal());
    }
    @Test
    void negative_numbers() {
        Calculator calc = new Calculator();

        int[] arr = {-1,-1,-1,-1,-1};
        calc.setNumbers(arr);

        assertEquals(-5,calc.calctotal());
    }
    @Test
    void mix_numbers() {
        Calculator calc = new Calculator();

        int[] arr = {-1,-1,1,1,1};
        calc.setNumbers(arr);

        assertEquals(1,calc.calctotal());
    }
}