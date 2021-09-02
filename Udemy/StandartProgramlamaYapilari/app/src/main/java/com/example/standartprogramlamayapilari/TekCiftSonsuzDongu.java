package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class TekCiftSonsuzDongu {
    public static void main(String args[]) {
        Scanner tarayici=new Scanner(System.in);

        while (true){
            System.out.println("Bir sayı giriniz:");
            int sayi=tarayici.nextInt();

            //+ - / * %
            int sonuc=sayi%2;
            switch (sonuc){
                case 0:
                    System.out.println("Sayı Çift");
                    break;
                case 1:
                    System.out.println("Sayı Tek");
                    break;
            }

            System.out.println("Çıkış için [1] Devam için diğer sayılar");
            int secim=tarayici.nextInt();

            if (secim==1){
                System.out.println("Çıkış yapıldı.");
                break;
            }

        }
    }
}
