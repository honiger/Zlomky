package cz.uhk.zlomky.model;

public class Zlomek extends Number{
    private final int citatel;
    private final int jmenovatel;

    public Zlomek(int citatel, int jmenovatel){
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }
    public int getJmenovatel() {
        return jmenovatel;
    }

    public Zlomek krat (Zlomek druhy){
        return new Zlomek(citatel * druhy.citatel, jmenovatel * druhy.jmenovatel);
    }

    public Zlomek deleno (Zlomek druhy){
        if (druhy.citatel == 0) {
            throw new ArithmeticException("Dělení nulou není povoleno!");
        }
        else if (druhy.jmenovatel == 0) {
            throw new ArithmeticException("Dělení nulou není povoleno!");
        }
        return new Zlomek(citatel * druhy.jmenovatel, jmenovatel * druhy.citatel);
    }

    public Zlomek plus (Zlomek druhy){
        if(citatel == 0 || jmenovatel == 0){
            return new Zlomek(druhy.citatel ,druhy.jmenovatel);
        }
        else if(druhy.citatel == 0 || druhy.jmenovatel == 0){
            return new Zlomek(citatel, jmenovatel);
        }
            return new Zlomek(citatel * druhy.jmenovatel + druhy.citatel * jmenovatel,jmenovatel * druhy.jmenovatel);
    }

    public Zlomek minus (Zlomek druhy){
        if(citatel == 0 || jmenovatel == 0){
            return new Zlomek(druhy.citatel ,druhy.jmenovatel);
        }
        else if(druhy.citatel == 0 || druhy.jmenovatel == 0){
            return new Zlomek(citatel, jmenovatel);
        }
        return new Zlomek(citatel * druhy.jmenovatel - druhy.citatel * jmenovatel,jmenovatel * druhy.jmenovatel);
    }

    public Zlomek zkratit (){
        int a = Math.abs(citatel);
        int b = Math.abs(jmenovatel);
        if (a < b) {
            int pom = a;
            a = b;
            b = pom;
        }
         int zb;
        do {
            zb = a % b;
            a = b;
            b = zb;
        }while (zb != 0);
        return new Zlomek(citatel / a, jmenovatel / a);
    }

    @Override
    public String toString() {
        return String.format("%d / %d", citatel, jmenovatel);
    }

    @Override
    public int intValue() {
        return citatel/jmenovatel;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return ((double)citatel) /jmenovatel;
    }
}
