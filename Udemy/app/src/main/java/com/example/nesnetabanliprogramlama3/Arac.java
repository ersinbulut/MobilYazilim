package com.example.nesnetabanliprogramlama3;

public class Arac {// extends Object

    private String renk;
    private  String vitesTipi;

    public Arac() {
    }

    public Arac(String renk, String vitesTipi) {
        this.renk = renk;
        this.vitesTipi = vitesTipi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }
}
