package com.example.javaoopodevler;

import java.util.Scanner;

public class Odev2 {
    public static void main(String args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Dikdörtgenin uzun kenarını giriniz:");
        int uzunKenar=tarayici.nextInt();

        System.out.println("Dikdörtgenin kısa kenarını giriniz:");
        int kisaKenar=tarayici.nextInt();

        OdevlerSinifi o =new OdevlerSinifi();
        int gelenSonuc = o.cevreHesapla(kisaKenar,uzunKenar);
        System.out.println("Sonuç: "+gelenSonuc);



    }
}
