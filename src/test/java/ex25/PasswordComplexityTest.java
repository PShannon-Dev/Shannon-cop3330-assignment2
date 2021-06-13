package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordComplexityTest {

    @Test
    void passwordValidator() {
        PasswordComplexity validate = new PasswordComplexity("1234567");

        assertEquals(1,validate.getFlag());
    }

    @Test
    void passwordValidator_only_letters(){
        PasswordComplexity validate = new PasswordComplexity("abc");

        assertEquals(2,validate.getFlag());
    }

    @Test
    void passwordValidator_ninechars_letters_numbers(){
        PasswordComplexity validate = new PasswordComplexity("password1");

        assertEquals(3,validate.getFlag());
    }

    @Test
    void specials_numbers_letters(){
        PasswordComplexity validate = new PasswordComplexity("John123?@");

        assertEquals(4,validate.getFlag());
    }
}