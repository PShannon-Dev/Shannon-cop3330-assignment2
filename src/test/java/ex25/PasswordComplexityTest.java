package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordComplexityTest {

    @Test
    void passwordValidator() {
        PasswordComplexity validate = new PasswordComplexity("1234567");

        assertEquals("very weak",validate.getFlag());
    }

    @Test
    void passwordValidator_only_letters(){
        PasswordComplexity validate = new PasswordComplexity("1234567");

        assertEquals("weak",validate.getFlag());
    }
}