package com.example.javaoopodevler;

import java.util.Scanner;

public class Odev4 {
    public static void main(String args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Kelime giriniz: ");
        String kelime = tarayici.next();

        System.out.println("Harf giriniz: ");
        char harf = tarayici.next().charAt(0);

        OdevlerSinifi o = new OdevlerSinifi();
        o.harfSayisiBul(kelime,harf);


    }
}
