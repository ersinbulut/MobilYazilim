package com.example.nesnetabanliprogramlama;

public class ReferansTipiAtama {
    public static void main(String args[]){

        int sayi1=40;
        int sayi2=sayi1;//sayi2=40, sayi1=40;

        sayi1=50;//sayi2=40, sayi1=50;

        //Referans tipi atama
        Ogrenciler ogr1=new Ogrenciler();
        ogr1.isim="Ahmet";

        System.out.println(ogr1.isim);

        Ogrenciler ogr2=ogr1;
        ogr2.isim="Zeynep";

        System.out.println(ogr1.isim);
        System.out.println(ogr1.hashCode()); //hafızadaki adresin
        System.out.println(ogr2.hashCode());



    }
}
