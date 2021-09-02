package com.example.nesnetabanliprogramlama;

public class MatematikMain {
    public static void main(String args[]){

        Matematik m1=new Matematik();
        m1.Carpma(5,4);

        int gelenDeger=m1.Topla(3,6,90);
        System.out.println("Toplam : "+gelenDeger);

        int cikarmaSonuc = m1.Cikarma(40,30,"ahmet");
        System.out.println("Çıkarma : "+cikarmaSonuc);


    }
}
