package cz.uhk.zlomky.model;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek(int citatel, int jmenovatel){
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }
    public int getjmenovatel () {
        return jmenovatel;
    }

    @Override
    public String toString() {
        return String.format("%d / %d" , citatel , jmenovatel);
    }
}
