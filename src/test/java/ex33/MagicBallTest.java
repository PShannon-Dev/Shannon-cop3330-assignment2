package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest {

    @Test
    void firstOption() {
        MagicBall ball = new MagicBall();

        assertEquals("Yes.", ball.generateOutput(0));
    }

    @Test
    void secondOption() {
        MagicBall ball = new MagicBall();

        assertEquals("No.", ball.generateOutput(1));
    }

    @Test
    void thirdOption() {
        MagicBall ball = new MagicBall();

        assertEquals("Maybe.", ball.generateOutput(2));
    }

    @Test
    void fourthOption() {
        MagicBall ball = new MagicBall();

        assertEquals("Ask again later.", ball.generateOutput(3));
    }
}