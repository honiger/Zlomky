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
    }
}
