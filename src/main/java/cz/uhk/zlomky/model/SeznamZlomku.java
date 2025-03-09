package cz.uhk.zlomky.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SeznamZlomku {
    private List<Zlomek> zlomky = new ArrayList<>();

    public void pridatZlomek(Zlomek zlomek) {
        zlomky.add(zlomek);
    }

    public void odebratZlomek(int index) {
        zlomky.remove(index);
    }

    public Zlomek vybratZlomek(int index) {
        return zlomky.get(index);
    }

    public void vypisZlomky(PrintStream out) {
        for (int i = 0; i < zlomky.size(); i++) {
            out.printf("[%d] => %s\n", i + 1, zlomky.get(i));
        }
    }

    public Zlomek spoctiSoucet(){
        Zlomek suma = new Zlomek(0,1);
        for (Zlomek z : zlomky) {
            suma = suma.plus(z);
        }
        return suma.zkratit();
    }

    public Zlomek spoctiPrumer() {
        Zlomek suma = spoctiSoucet();
        Zlomek pocet = new Zlomek(zlomky.size(),1);
        return suma.deleno(pocet).zkratit(); // suma / pocet
    }

    public int pocetZlomku(){
        return zlomky.size();
    }
}
