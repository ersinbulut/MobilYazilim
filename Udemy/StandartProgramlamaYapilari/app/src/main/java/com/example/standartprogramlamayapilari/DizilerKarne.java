package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class DizilerKarne {
    public static void main(String args[]) {
        System.out.println("----------------------");
        Scanner tarayici=new Scanner(System.in);

        int[] notlar=new int[3];
        String [] dersler=new String[3];

        for (int i=0;i<notlar.length;i++){//0,1,2,3,4 veri doldur
            System.out.println((i+1)+" . dersin adını giriniz:");
            String dersAdi=tarayici.next();

            System.out.println((i+1)+" . dersin notunu giriniz:");
            int not=tarayici.nextInt();

            notlar[i]=not;
            dersler[i]=dersAdi;
        }
        int toplam=0;
        for (int i=0;i<notlar.length;i++){//0-50 , 1-90, 2-70
            System.out.println(dersler[i]+" : "+notlar[i]);
            toplam=toplam+notlar[i];//0+50 -> toplam = 50,50+90 -> toplam = 140
        }
        int ortalama=(toplam/dersler.length);
        System.out.println("Ortalama : "+ortalama);

        if (ortalama>=50){
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız");
        }



    }
}
