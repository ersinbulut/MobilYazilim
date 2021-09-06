package com.example.nesnetabanliprogramlama2.mainmetodlar;

import com.example.nesnetabanliprogramlama2.siniflar.Matematik;
import com.example.nesnetabanliprogramlama2.siniflar.Personel;

public class StaticMain {
    public static void main(String args[]){
    /*    Matematik m = new Matematik();
        m.topla(3,6);*/
        int sonuc= Matematik.topla(3,6);
        System.out.println(sonuc);
        System.out.println("----------------------");
        Personel p1=new Personel("Ahmet",23);
        Personel p2=new Personel("Mehmet",70);
        Personel p3=new Personel("Can",16);
        Personel p4=new Personel("Merve",28);


        System.out.println(Personel.sayac);
    }
}
