package cz.uhk.zlomky.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        assertEquals(5,z.getjmenovatel(),"Jmenovatel");
    }

    @Test
    void odebratZlomek() {

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
        assertEquals(5,z.getjmenovatel(),"Jmenovatel");
    }

    @Test
    void vypisZlomeky() {
    }

    @Test
    void spoctiSoucet() {
    }

    @Test
    void spoctiPrumer() {
    }
}