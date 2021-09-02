package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class IfElseIfDortIslemOrnek {
    public static void main(String args[]) {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Hesaplama Seçiniz");
        System.out.println("[1] Toplama");
        System.out.println("[2] Çıkarma");
        System.out.println("[3] Çarpma");
        System.out.println("[4] Bölme");
        int tercih = tarayici.nextInt();

        System.out.println("1. Sayıyı giriniz:");
        int s1=tarayici.nextInt();
        System.out.println("2. Sayıyı giriniz:");
        int s2=tarayici.nextInt();

        if (tercih == 1){
            System.out.println("Toplam : "+(s1+s2));
        }else if (tercih ==2){
            System.out.println("Fark : "+(s1-s2));
        }else if (tercih == 3){
            System.out.println("Çarpma : "+(s1*s2));
        }else if(tercih == 4){
            System.out.println("Bölme : "+(s1/s2));
        }

    }


    }
