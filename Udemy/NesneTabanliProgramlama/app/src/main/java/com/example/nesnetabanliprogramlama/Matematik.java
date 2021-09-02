package com.example.nesnetabanliprogramlama;

public class Matematik {

    public void Carpma(int s1,int s2){
        int sonuc=s1*s2;
        System.out.println(sonuc);
    }

    public int Topla(int s1,int s2,int s3){
        int toplam=s1+s2+s3;
        return toplam;
    }

    public int Cikarma(int s1,int s2,String isim){
        int cikarmaSonuc=s1-s2;
        System.out.println("İşlem yapan : "+isim);
        return cikarmaSonuc;
    }
}
