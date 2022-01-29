package com.example.nesnetabanliprogramlama3;

public class KalıtımMain {
    public static void main(String args[]){

        Araba araba=new Araba();

        araba.setKasaTipi("Sedan");
        araba.setRenk("Kırmızı");
        araba.setVitesTipi("Otomatik");

        //System.out.println(araba.getKasaTipi());
        araba.bilgiAlAraba();

        Subaru subaru=new Subaru("1.6V");
        subaru.setRenk("Mavi");
        subaru.setVitesTipi("Manuel");

        System.out.println(subaru.getRenk());
    }
}
