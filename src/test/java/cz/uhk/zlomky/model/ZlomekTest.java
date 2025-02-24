package cz.uhk.zlomky.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ZlomekTest {

    @Test
    void krat() {
        Zlomek a = new Zlomek(3,4);
        Zlomek b = new Zlomek(4,5);
        Zlomek c = a.krat(b);
        assertEquals(12, c.getCitatel(), "Chyba");
        assertEquals(20, c.getjmenovatel(), "Chyba");

    }

    @Test
    void kratNulovy() {
        Zlomek a = new Zlomek(0,4);
        Zlomek b = new Zlomek(4,5);
        Zlomek c = a.krat(b);
        assertEquals(0, c.getCitatel(), "Chyba");
        assertEquals(20, c.getjmenovatel(), "Chyba");
    }

    @Test
    void deleno() {
    }

    @Test
    void plus() {
    }

    @Test
    void minus() {
    }

    @Test
    void zkratit() {
    }
}