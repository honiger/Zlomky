package cz.uhk.zlomky.app;

import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {

    public static void main(String[] args)
    {
        System.out.println("Zlomkoaplikace");

        // vytvoření instance zlomku třídy Zlomek

        Zlomek a = new Zlomek(3,4);
        Zlomek b = new Zlomek(2,5);
        Zlomek c = a.krat(b);
        Zlomek d = a.deleno(b);
        Zlomek e = a.plus(b);
        Zlomek f = a.minus(b);

        System.out.printf("Zlomek a = %s\n", a);
        System.out.printf("Zlomek c = %s\n", c.zkratit());
        System.out.printf("Zlomek d = %s\n", d);
        System.out.printf("Zlomek e = %s\n", e);
        System.out.printf("Zlomek f = %s\n", f);




        Zlomek[] poleZlomku = new Zlomek[4];
        poleZlomku[0] = a;
        poleZlomku[1] = b;
        poleZlomku[2] = c;
        poleZlomku[3] = d;

        try {
            Zlomek all = sumaZlomku(poleZlomku);
            System.out.printf("Zlomek all = %s\n", all);
        } catch (ArithmeticException g){
            System.out.println("Chyba při výpočtu sumy zlomku: " +g.getMessage());
            g.printStackTrace();
        }

        Number[] pole2 = new Number[8];
        for (int i = 0; i < poleZlomku.length; i++){
            pole2[i] = poleZlomku[i];
        }

        pole2[4] = 10;
        pole2[5] = 20;
        pole2[6] = 30.025;
        pole2[7] = 40;
        double suma = 0;
        for (Number n : pole2) {
            System.out.printf("%s  \n", n);
            suma += n.doubleValue();
        }
        System.out.printf("Suma je %s\n", suma);

    }



    public static Zlomek sumaZlomku (Zlomek[] poleZlomku){
        Zlomek soucet = new Zlomek(0,1);
        for (Zlomek z : poleZlomku){
            soucet = soucet.plus(z);
        }
        return soucet.zkratit();
    }

}
