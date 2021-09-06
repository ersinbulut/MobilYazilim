package com.example.javaoopodevler;

import java.util.Scanner;

public class Odev3 {
    public static void main(String args[]){

        Scanner tarayici=new Scanner(System.in);

        System.out.println("Faktoriyel hesabı için sayı giriniz: ");
        int sayi = tarayici.nextInt();

        OdevlerSinifi o = new OdevlerSinifi();
        int sonuc = o.faktoriyelHesapla(sayi);

        System.out.println("Sonuç: "+sonuc);




    }
}
