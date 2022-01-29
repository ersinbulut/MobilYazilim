package com.example.nesnetabanliprogramlama3;

public class EqualsToStringMain {
    public static void main(String args[]){

        Ogrenci o1=new Ogrenci(888,"Ahmet");
        Ogrenci o2=new Ogrenci(777,"Mehmet");
        Ogrenci o3=new Ogrenci(888,"Zeynep");
        Ogrenci o4=new Ogrenci(555,"Ahmet");

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);

        if (o1.equals(o3)) {
            System.out.println("Eşit");
        }else{
            System.out.println("Eşit Değil");
        }


    }
}
