package cz.uhk.zlomky.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SeznamZlomkuTest {
    SeznamZlomku seznam;

    @BeforeEach
    void setUp() {
        seznam = new SeznamZlomku();
    }

    @Test
    @DisplayName("Test přidávání")
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        assertEquals(1,seznam.pocetZlomku(),"Pocet zlomků");
        Zlomek z = seznam.vybratZlomek(0);
        assertEquals(3,z.getCitatel(),"Citatel");
        assertEquals(5,z.getJmenovatel(),"Jmenovatel");
    }

    @Test
    void odebratZlomek() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        seznam.pridatZlomek(new Zlomek(7, 2));

        assertEquals(2, seznam.pocetZlomku(), "Počet zlomků před odebráním");

        seznam.odebratZlomek(0);

        assertEquals(1, seznam.pocetZlomku(), "Počet zlomků po odebrání");
        Zlomek z = seznam.vybratZlomek(0);
        assertEquals(7, z.getCitatel(), "Čitatel zbývajícího zlomku");
        assertEquals(2, z.getJmenovatel(), "Jmenovatel zbývajícího zlomku");
    }

    @Test
    void vybratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.vybratZlomek(0));
    }

    @Test
    void vybratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        Zlomek z = seznam.vybratZlomek(0);
        assertEquals(3,z.getCitatel(),"Citatel");
        assertEquals(5,z.getJmenovatel(),"Jmenovatel");
    }

    @Test
    void vypisZlomky() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(3, 4));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        seznam.vypisZlomky(System.out);

        String expectedOutput = "[1] => 1 / 2\n[2] => 3 / 4\n";
        assertEquals(expectedOutput, outContent.toString(), "Výpis zlomků");

        System.setOut(System.out);
    }
    @Test
    void spoctiSoucet() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(1, 3));

        Zlomek soucet = seznam.spoctiSoucet();
        assertEquals(5, soucet.getCitatel(), "Čitatel součtu");
        assertEquals(6, soucet.getJmenovatel(), "Jmenovatel součtu");
    }

    @Test
    void spoctiPrumer() {
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(1, 3));

        Zlomek prumer = seznam.spoctiPrumer();
        assertEquals(5, prumer.getCitatel(), "Čitatel průměru");
        assertEquals(12, prumer.getJmenovatel(), "Jmenovatel průměru");
    }
}