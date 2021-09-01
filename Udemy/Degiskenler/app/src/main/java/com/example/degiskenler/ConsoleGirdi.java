package com.example.degiskenler;

import java.util.Scanner;

public class ConsoleGirdi {

    public static void main(String args[]) {
        Scanner tarayici=new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz...:");
        String gelenad=tarayici.next();

        System.out.println("Lütfen yaşınızı giriniz...:");
        int gelenyas=tarayici.nextInt();

        System.out.println("Lütfen boyunuzu giriniz...:");
        double gelenboy=tarayici.nextDouble();

        System.out.println("Evli misiniz?...:");
        boolean evlimi=tarayici.nextBoolean();



        System.out.println("Ad: "+gelenad);
        System.out.println("Yas: "+gelenyas);
        System.out.println("Boy: "+gelenboy);
        System.out.println("Evli mi: "+evlimi);

    }

}
