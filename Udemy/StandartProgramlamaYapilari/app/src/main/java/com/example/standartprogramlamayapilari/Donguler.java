package com.example.standartprogramlamayapilari;

public class Donguler {
    public static void main(String args[]) {

        //0 - 3 -> 0,1,2,3 -> 4 kere döner
        //0 ile başlar

        for (int i=0;i<4;i++){//0 - 1 - 2 - 3
            System.out.println("index : "+i);
        }//arttırma gerçekleşir

        System.out.println("---------------");
        //6 tane veri olan dizi 0,1,2,3,4,5

        for (int y=0;y<6;y++){
            System.out.println("index2 : "+y);
        }
        System.out.println("---------------");
        //0-3 arası
        int a=0;
        while (a<4){
            System.out.println("a deger : "+a);
            a++;
        }
        System.out.println("---------------");


    }
}
