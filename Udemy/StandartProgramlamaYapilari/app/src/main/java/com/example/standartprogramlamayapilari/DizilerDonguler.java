package com.example.standartprogramlamayapilari;

public class DizilerDonguler {
    public static void main(String args[]) {
        System.out.println("----------------------");
        String sehirler[]={"bursa","izmir","ankara","van","trabzon"};

        System.out.println(sehirler[0]);
        System.out.println(sehirler[1]);
        System.out.println(sehirler[2]);
        System.out.println(sehirler[3]);
        System.out.println(sehirler[4]);
        System.out.println("----------------------");
        for (int i=0;i<5;i++){//0,1,2,3,4
            System.out.println(sehirler[i]);
        }
        System.out.println("----------------------");

        String markalar[]={"apple","google","hp"};

        for (int i = 0; i<markalar.length;i++){
            System.out.println(markalar[i]);
        }
        System.out.println("----------------------");
        String isimler[]={"ahmet","ayşe","zeynep","murat"};

        for(String s:isimler){//foreach döngüsü
            System.out.println(s);
        }
        System.out.println("----------------------");
        int sayilar[]={30,20,15,70,100};
        for (int sayi:sayilar){
            System.out.println(sayi);
        }

    }
}
