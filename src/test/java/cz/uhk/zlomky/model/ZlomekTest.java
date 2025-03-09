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
        assertEquals(20, c.getJmenovatel(), "Chyba");

    }

    @Test
    void kratNulovy() {
        Zlomek a = new Zlomek(0,4);
        Zlomek b = new Zlomek(4,5);
        Zlomek c = a.krat(b);
        assertEquals(0, c.getCitatel(), "Chyba");
        assertEquals(20, c.getJmenovatel(), "Chyba");
    }

    @Test
    void deleno() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.deleno(b);

        assertEquals(15, c.getCitatel(), "Chyba");
        assertEquals(16, c.getJmenovatel(), "Chyba");
    }

    @Test
    void deleniNulouCitatel() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(0, 5);

        assertThrows(ArithmeticException.class, () -> a.deleno(b), "Mělo vyhodit výjimku!");
    }

    @Test
    void deleniNulouJmenovatel() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(5, 0);

        assertThrows(ArithmeticException.class, () -> a.deleno(b), "Mělo vyhodit výjimku!");
    }

    @Test
    void plus() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.plus(b);

        assertEquals(31, c.getCitatel(), "Chyba");
        assertEquals(20, c.getJmenovatel(), "Chyba");
    }

    @Test
    void scitaniSNulouCitatel() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(0, 5);
        Zlomek c = a.plus(b);

        assertEquals(3, c.getCitatel(), "Chyba");
        assertEquals(4, c.getJmenovatel(), "Chyba");
    }

    @Test
    void scitaniSNulouJmenovatel() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(5, 0);
        Zlomek c = a.plus(b);

        assertEquals(3, c.getCitatel(), "Chyba");
        assertEquals(4, c.getJmenovatel(), "Chyba");
    }

    @Test
    void minus() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.minus(b);

        assertEquals(3*5 - 4*4, c.getCitatel(), "Chyba");
        assertEquals(20, c.getJmenovatel(), "Chyba");
    }

    @Test
    void odcitaniSNulouCitatel() {
        Zlomek a = new Zlomek( 3, 4);
        Zlomek b = new Zlomek( 0, 5);
        Zlomek c = a.minus(b);

        assertEquals(3, c.getCitatel(), "Chyba");
        assertEquals(4, c.getJmenovatel(), "Chyba");
    }

    @Test
    void odcitaniSNulouJmenovatel() {
        Zlomek a = new Zlomek( 3, 4);
        Zlomek b = new Zlomek( 5, 0);
        Zlomek c = a.minus(b);

        assertEquals(3, c.getCitatel(), "Chyba");
        assertEquals(4, c.getJmenovatel(), "Chyba");
    }


    @Test
    void zkratit() {
        Zlomek a = new Zlomek( 8, 12);
        Zlomek c = a.zkratit();

        assertEquals(2, c.getCitatel(), "Chyba");
        assertEquals(3, c.getJmenovatel(), "Chyba");
    }


    @Test
    void kraceniJizZkraceneho() {
        Zlomek a = new Zlomek( 3, 4);
        Zlomek c = a.zkratit();

        assertEquals(3, c.getCitatel(), "Chyba");
        assertEquals(4, c.getJmenovatel(), "Chyba");
    }

    @Test
    void kraceniJednickovehoZlomku() {
        Zlomek a = new Zlomek( 5, 5);
        Zlomek c = a.zkratit();

        assertEquals(1, c.getCitatel(), "Chyba");
        assertEquals(1, c.getJmenovatel(), "Chyba");
    }
}