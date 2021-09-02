package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class DiziKonsolSayiGiris {
    public static void main(String args[]) {
        System.out.println("----------------------");
        Scanner t=new Scanner(System.in);

        int[] sayilar=new int[5];

        for (int i=0;i<sayilar.length;i++){//0,1,2,3,4 veri doldur.
            System.out.println((i+1)+" sayıyı giriniz:");
            int sayi=t.nextInt();

            sayilar[i]=sayi;
        }
        for (int k=0;k<5;k++){
            System.out.println((k+1)+".sayı : "+sayilar[k]);
        }
    }
}
