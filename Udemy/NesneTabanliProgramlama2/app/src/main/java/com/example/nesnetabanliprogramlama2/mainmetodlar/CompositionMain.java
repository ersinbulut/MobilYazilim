package com.example.nesnetabanliprogramlama2.mainmetodlar;

import com.example.nesnetabanliprogramlama2.siniflar.Adresler;
import com.example.nesnetabanliprogramlama2.siniflar.Filmler;
import com.example.nesnetabanliprogramlama2.siniflar.Kategoriler;
import com.example.nesnetabanliprogramlama2.siniflar.Kisiler;
import com.example.nesnetabanliprogramlama2.siniflar.Yonetmenler;

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



        //---------------------------
        Kategoriler kategori =new Kategoriler(1,"Drama");

        Yonetmenler yonetmen = new Yonetmenler(2,"Yılmaz Erdoğan");

        Filmler film = new Filmler(10,"Vizyontele",2009,kategori,yonetmen);

        System.out.println("Film İd: "+film.getFilm_id());
        System.out.println("Film ad: "+film.getFilm_ad());
        System.out.println("Film yıl: "+film.getFilm_yil());
        System.out.println("Film yönetmen: "+film.getYonetmen().getYonetmen_ad());
        System.out.println("Film kategori: "+film.getKategori().getKategori_ad());

    }
}
