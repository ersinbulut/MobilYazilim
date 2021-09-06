package com.example.nesnetabanliprogramlama2.mainmetodlar;

import com.example.nesnetabanliprogramlama2.siniflar.Adresler;
import com.example.nesnetabanliprogramlama2.siniflar.Kisiler;
//Composition : Bir sınıfın içinde başka sınıftan bir nesne kullanmaktır.
//Sınıf içinden başka bir sınıfa erişmek istersek kullanırız. bir nevi sınıflar arası ilişki kurmaktır.
//Dipnot: içerideki sınıf her zaman önce tanımlanmalıdır.
public class CompositionMain {
    public static void main(String args[]){
        Adresler adres=new Adresler("İstanbul","Bağcılar");
        Kisiler kisi1=new Kisiler("Ahmet",22255525,adres);

        System.out.println("Kişi ad: "+kisi1.getIsim());
        System.out.println("Kişi tel: "+kisi1.getTel());
        System.out.println("Kişi il : "+kisi1.getAdres().getIl());
        System.out.println("Kişi ilçe : "+kisi1.getAdres().getIlce());

    }
}
