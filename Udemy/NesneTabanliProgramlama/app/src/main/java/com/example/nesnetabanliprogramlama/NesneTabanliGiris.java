package com.example.nesnetabanliprogramlama;

public class NesneTabanliGiris {
    public static void main(String args[]){

        //normal değişken
        int yas=30;
        //nesne oluşturma
        Araba bmw = new Araba();
        bmw.renk="Kırmızı";
        bmw.hız=200;
        bmw.uzunluk=2.05;
        bmw.calisiyorMu=true;

        Araba tofas = new Araba();
        tofas.renk="Beyaz";
        tofas.hız=100;
        tofas.uzunluk=2.47;
        tofas.calisiyorMu=false;
        System.out.println("----------------");
        System.out.println("BMW");
        System.out.println("----------------");
        System.out.println(bmw.renk);
        System.out.println(bmw.hız);
        System.out.println(bmw.uzunluk);
        System.out.println(bmw.calisiyorMu);
        System.out.println("----------------");
        System.out.println("Tofaş");
        System.out.println("----------------");
        System.out.println(tofas.renk);
        System.out.println(tofas.hız);
        System.out.println(tofas.uzunluk);
        System.out.println(tofas.calisiyorMu);
        System.out.println("----------------");

    }
}
