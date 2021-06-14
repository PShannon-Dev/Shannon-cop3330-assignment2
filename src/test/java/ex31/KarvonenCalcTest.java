package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenCalcTest {

    @Test
    void calcBPM_no_intensity() {
        KarvonenCalc calc = new KarvonenCalc(65, 22);
        int actual = calc.calcBPM(0);

        assertEquals(65,actual);
    }

    @Test
    void BPM_High_intensity(){
        KarvonenCalc calc = new KarvonenCalc(65, 22);
        int actual = calc.calcBPM(95);

        assertEquals(191,actual);
    }

    @Test
    void BPM_low_intensity(){
        KarvonenCalc calc = new KarvonenCalc(65, 22);
        int actual = calc.calcBPM(55);

        assertEquals(138,actual);
    }
}