package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class SwitchToolBarMenu {
    public static void main(String args[]) {

        Scanner tarayici =new Scanner(System.in);

        System.out.println("(1) Sil");
        System.out.println("(2) Güncelle");
        System.out.println("(3) Yedekle");

        int tercih=tarayici.nextInt();

        switch (tercih){
            case 1:
                System.out.println("Veri silindi");
                break;
            case 2:
                System.out.println("Veri güncellendi");
                break;
            case 3:
                System.out.println("Veri yedeklendi");
                break;
            default:
                System.out.println("Böyle bir seçim yok");
                break;
        }


    }
}
