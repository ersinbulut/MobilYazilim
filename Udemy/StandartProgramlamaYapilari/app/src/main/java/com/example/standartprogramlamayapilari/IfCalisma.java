package com.example.standartprogramlamayapilari;

public class IfCalisma {

    public static void main(String args[]){
        int yas=20;
        String isim="Ahmet";

        if (yas > 18 ){//true
            System.out.println("Reşitsiniz");
        }
        else {//false
            System.out.println("Reşit Değilsiniz!");
        }

        if (isim.equals("Ahmet")){
            System.out.println("Merhaba Ahmet");
        }else if(isim.equals("Mehmet")){
            System.out.println("Merhaba Mehmet ");
        }else{
            System.out.println("Merhaba Kimse");
        }

        int sifre=1234;
        String kullaniciAdi="admin";

        if (sifre == 1234 && kullaniciAdi.equals("admin")){
            System.out.println("Merhaba "+kullaniciAdi);
        }else{
            System.out.println("Hatalı giriş");
        }

        int sinif=10;

        if (sinif == 9 || sinif==10 || sinif==11 || sinif==12){
            System.out.println("YGS Sınavına hazırlan");
        }
        if (sinif == 6 || sinif==7 || sinif==8){
            System.out.println("TEOG Sınavına hazırlan");
        }
    }
}
