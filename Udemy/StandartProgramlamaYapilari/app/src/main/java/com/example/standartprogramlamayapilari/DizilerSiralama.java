package com.example.standartprogramlamayapilari;

import java.util.Arrays;

public class DizilerSiralama {
    public static void main(String args[]) {
        System.out.println("----------------------");
        String isimler[]={"zeynep","ali","ayhan","murat","yeşim"};

        for (String s:isimler){
            System.out.println(s);
        }
        System.out.println("----------------------");
        Arrays.sort(isimler);//a dan z ye dogru sıralar

        for (String x:isimler){
            System.out.println(x);
        }
        System.out.println("----------------------");
        int sayilar[]={20,40,10,80,60};
        Arrays.sort(sayilar);
        for (int i:sayilar){
            System.out.println(i);
        }
        System.out.println("----------------------");
    }
}
