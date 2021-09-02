package com.example.nesnetabanliprogramlama;

public class Islemler {
    //... çoklu parametre anlamına gelmektedir.
    public double ortalamaHesapla(double... sayilar){//dizi görevi
        double toplam=0;
        for (Double d:sayilar){
            toplam=toplam+d;
        }
        return toplam/sayilar.length;
    }
}
