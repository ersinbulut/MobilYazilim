package com.example.nesnetabanliprogramlama3;

public class Araba extends Arac{
    private String kasaTipi;

    public Araba() {
    }

    public Araba(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public void bilgiAlAraba(){//super: üst sınıfın bir nesnesidir.
        System.out.println(kasaTipi);
        System.out.println(super.getRenk());
        System.out.println(getVitesTipi());
    }
}
