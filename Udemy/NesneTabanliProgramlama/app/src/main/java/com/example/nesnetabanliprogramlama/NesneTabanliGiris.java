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
     /*   System.out.println("BMW");
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
        System.out.println(tofas.calisiyorMu);*/
        System.out.println("----------------");

        Araba reno = new Araba();
        reno.renk="Sarı";
        reno.hız=150;
        reno.uzunluk=3.67;
        reno.calisiyorMu=true;

     /*   System.out.println("bmw çalışma:"+bmw.calisiyorMu);
        System.out.println("tofas çalışma:"+tofas.calisiyorMu);
        System.out.println("reno çalışma:"+reno.calisiyorMu);
        System.out.println("----------------");
        tofas.calistir();
        reno.durdur();
        reno.hizlan(30);


        System.out.println("bmw çalışma:"+bmw.calisiyorMu);
        System.out.println("tofas çalışma:"+tofas.calisiyorMu);
        System.out.println("reno çalışma:"+reno.calisiyorMu);*/

        System.out.println(bmw.hız);
        bmw.hizlan(30);
        System.out.println(bmw.hız);
        bmw.yavasla(90);
        System.out.println(bmw.hız);
        System.out.println("---------------");
        System.out.println(tofas.hız);
        tofas.hizlan(100);
        System.out.println(tofas.hız);
    }
}
