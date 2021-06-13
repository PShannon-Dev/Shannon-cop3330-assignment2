package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_ex() {
        App myApp = new App();
        PaymentCalculator calc = new PaymentCalculator(5000,100,12);

        assertEquals(70,calc.months);
    }

    @Test
    void zero_payment(){
        App myApp = new App();
        PaymentCalculator calc = new PaymentCalculator(5000,0,12);

        assertEquals(0,calc.months);
    }

    @Test
    void no_apr(){
        App myApp = new App();
        PaymentCalculator calc = new PaymentCalculator(5000,100,0);

        assertEquals(0,calc.months);
    }
}