package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class DongulerİsimTekrarla {
    public static void main(String args[]) {
        Scanner t=new Scanner(System.in);

        System.out.println("İsminizi giriniz:");
        String isim =t.nextLine();

        System.out.println("Tekrarlama miktarını giriniz:");
        int sayi =t.nextInt();

        for (int i = 0; i<sayi;i++){
            System.out.println(isim+"-"+(i+1));
        }
    }
}
