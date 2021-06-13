package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickCalculatorTest {

    @Test
    void correct_value() {
        QuickCalculator calculator = new QuickCalculator();

        double years = calculator.calc(4);
        assertEquals(18.0, years,.0001);
    }
}