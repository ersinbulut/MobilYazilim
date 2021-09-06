package com.example.javaoopodevler;

import java.util.Scanner;

public class Odev7 {
    public static void main(String args[]) {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Çalışma gün sayınızı giriniz: ");
        int gun = tarayici.nextInt();

        //OdevlerSinifi o = new OdevlerSinifi();

        int sonuc = new OdevlerSinifi().maasHesapla(gun);

        System.out.println("Maaş : "+sonuc+" tl");

    }
}
