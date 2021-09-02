package com.example.standartprogramlamayapilari;

import java.util.Random;

public class HazirKomutlar {
    public static void main(String args[]) {

        int i = -5;
        System.out.println("Mutlak Değer : "+Math.abs(i));
        System.out.println("Pi : "+Math.PI);
        System.out.println("Üslü sayılar : "+Math.pow(2.0,3.0));
        System.out.println("Köklü sayılar : "+Math.sqrt(9));

        //Rastgele sayı üretme
        System.out.println("------------------");
        Random r=new Random();

        for (int k=0;k<5;k++){
            int sayi=r.nextInt(10);//0 ile 9 arasında değer üretir
            System.out.println(sayi);
        }
        System.out.println("------------------");




    }
}
