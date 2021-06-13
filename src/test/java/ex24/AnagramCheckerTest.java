package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram() {
        App app = new App() ;
        AnagramChecker ana = new AnagramChecker();

        ana.setAnagram1("James");
        ana.setAnagram2("mesa");

        assertFalse(ana.isAnagram());
    }
    @Test
    void isAnagram_samelength_wrongletters() {
        App app = new App() ;
        AnagramChecker ana = new AnagramChecker();

        ana.setAnagram1("asdf");
        ana.setAnagram2("ghjk");

        assertFalse(ana.isAnagram());
    }
    @Test
    void isAnagram_actualanagram() {
        App app = new App() ;
        AnagramChecker ana = new AnagramChecker();

        ana.setAnagram1("note");
        ana.setAnagram2("tone");

        assertTrue(ana.isAnagram());
    }
}