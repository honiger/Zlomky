package cz.uhk.zlomky.app;

import cz.uhk.zlomky.model.SeznamZlomku;
import cz.uhk.zlomky.model.Zlomek;

public class SeznamZlomkuApp {
    public static void main(String[] args) {

        SeznamZlomku seznam = new SeznamZlomku();

        seznam.pridatZlomek(new Zlomek(3,4));
        seznam.pridatZlomek(new Zlomek(6,2));
        seznam.pridatZlomek(new Zlomek(10,8));

        seznam.vypisZlomky(System.out);

        Zlomek soucet = seznam.spoctiSoucet();
        Zlomek prumer = seznam.spoctiPrumer();

        double realneSoucet = (double) soucet.getCitatel() / soucet.getJmenovatel();
        double realnePrumer = (double) prumer.getCitatel() / prumer.getJmenovatel();


        System.out.printf("Soucet zlomku je %s a jako reálné číslo: %f\n", soucet, realneSoucet);
        System.out.printf("Prumer zlomku je %s a jako reálné číslo: %f\n", prumer, realnePrumer);


    }
}
