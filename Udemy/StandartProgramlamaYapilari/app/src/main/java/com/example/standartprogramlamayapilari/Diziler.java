package com.example.standartprogramlamayapilari;

import java.util.Arrays;

public class Diziler {
    public static void main(String args[]) {
        System.out.println("----------------------");
        int plakalar[]=new int[5]; // 5 bölmeli dizi tanımlama

        plakalar[0] = 34;

        plakalar[3] = 16;

        plakalar[2] = 65;

        System.out.println(Arrays.toString(plakalar));

        System.out.println("----------------------");

        String [] meyveler = {"elma","muz","vişne","karpuz","portakal"};//5
        double [] boylar = {1.78,2.05,1.55,1.65};

        System.out.println(meyveler[2]);

        double boy = boylar[3];

        System.out.println(boy);

        System.out.println(Arrays.toString(meyveler));

        meyveler[3]="mandalina";

        System.out.println(Arrays.toString(meyveler));

        System.out.println("----------------------");


    }
}
