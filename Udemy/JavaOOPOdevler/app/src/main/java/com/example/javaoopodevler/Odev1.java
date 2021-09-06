package com.example.javaoopodevler;

import java.util.Scanner;

public class Odev1 {
    public static void main(String args[]){

        Scanner tarayici=new Scanner(System.in);

        System.out.println("Sıcaklık değerini giriniz:");

        double sicaklik = tarayici.nextDouble();

        //metod
        OdevlerSinifi o =new OdevlerSinifi();
        o.sicaklikDonustur(sicaklik);

    }
}
