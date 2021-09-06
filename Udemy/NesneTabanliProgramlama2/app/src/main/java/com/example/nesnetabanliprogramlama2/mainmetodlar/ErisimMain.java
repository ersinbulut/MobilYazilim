package com.example.nesnetabanliprogramlama2.mainmetodlar;

import com.example.nesnetabanliprogramlama2.siniflar.Ogrenciler;
import com.example.nesnetabanliprogramlama2.siniflar.Urunler;

public class ErisimMain {
    public static void main(String args[]){

        Ogrenciler o1 = new Ogrenciler();
       /* o1.isim="AHMET";
        o1.okulNo=6789;*/

        o1.setIsim("Ahmet");
        o1.setokulNo(1234);

        //o1.bilgiAl();

        System.out.println(o1.getIsim());
        int on= o1.getokulNo();
        System.out.println(on);

        System.out.println("--------------------");

        Urunler u= new Urunler("Telefon",30);

        System.out.println(u.getUrunAdet());
        System.out.println(u.getUrunAd());





    }
}
