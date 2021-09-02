package com.example.nesnetabanliprogramlama;

public class ConstructorMain {
    public static void main(String args[]){

        Ogrenciler ogrenci = new Ogrenciler();//boş constructor çalışır
        ogrenci.adres="ankara";
        ogrenci.isim="Mehmet";
        ogrenci.okulNo=1234;

        System.out.println(ogrenci.isim);

        Ogrenciler ogr2=new Ogrenciler("Ahmet",456,"İstanbul");

        System.out.println(ogr2.adres);
    }
}
