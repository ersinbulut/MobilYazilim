package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class WhileVeriIsle {
    public static void main(String args[]) {
        Scanner t= new Scanner(System.in);
        System.out.println("İşlenecek veri miktarı giriniz:");
        int sayi =t.nextInt();

        while (sayi>0){
            System.out.println("veri: "+sayi);
            sayi--;
        }
    }
}
