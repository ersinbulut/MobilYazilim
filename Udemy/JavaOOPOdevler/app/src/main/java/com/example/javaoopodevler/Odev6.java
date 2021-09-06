package com.example.javaoopodevler;

import java.util.Scanner;

public class Odev6 {
    public static void main(String args[]) {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Öğrenci adını giriniz: ");
        String ogrenciAdi = tarayici.next();

        System.out.println("Öğrencinin okulunu giriniz: ");
        int okulNo = tarayici.nextInt();

        System.out.println("İzin Miktari giriniz: ");
        int izinMiktari = tarayici.nextInt();

        System.out.println("Tarih giriniz: ");
        String tarih = tarayici.next();

        System.out.println("Velinin adı soyadını giriniz: ");
        String veliAdi = tarayici.next();

        OdevlerSinifi o = new OdevlerSinifi();
        o.dilekceOlustur(ogrenciAdi,okulNo,izinMiktari,tarih,veliAdi);

    }
}
