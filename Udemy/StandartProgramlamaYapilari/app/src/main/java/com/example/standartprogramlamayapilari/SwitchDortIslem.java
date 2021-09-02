package com.example.standartprogramlamayapilari;

import android.widget.Switch;

import java.util.Scanner;

public class SwitchDortIslem {
    public static void main(String args[]) {
        Scanner tarayici=new Scanner(System.in);

        System.out.println("Hesap Seçiniz");
        System.out.println("{1} Toplama");
        System.out.println("{2} Çıkarma");
        System.out.println("{3} Çarpma");
        System.out.println("{4} Bölme");

        int tercih =tarayici.nextInt();

        System.out.println("Birinci sayıyı giriniz:");
        int s1=tarayici.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int s2=tarayici.nextInt();

        switch(tercih){
            case 1:
                System.out.println("Toplam: "+(s1+s2));
                break;
            case 2:
                System.out.println("Fark: "+(s1-s2));
                break;
            case 3:
                System.out.println("Çarpım: "+(s1*s2));
                break;
            case 4:
                System.out.println("Bölüm: "+(s1/s2));
                break;
            default:
                System.out.println("Böyle bir tercih yok!");
                break;
        }
    }
}
