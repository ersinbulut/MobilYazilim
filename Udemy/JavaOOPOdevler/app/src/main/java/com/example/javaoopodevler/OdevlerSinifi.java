package com.example.javaoopodevler;

public class OdevlerSinifi {

    public void sicaklikDonustur(double sicaklik){
        double f = (sicaklik*1.8)+ 32;
        System.out.println("Fahrenhiet : "+f);
    }

    public int cevreHesapla(int kisaKenar,int uzunKenar){
        int cevre = (2*kisaKenar)+(2*uzunKenar);
        return cevre;
    }

    public int faktoriyelHesapla(int sayi){
        int sonuc = 1;

        if (sayi == 0){
            sonuc=1;
        }
        else {
            for (int i = 1; i<=sayi;i++){ //sayi = 3 1,2,3
                sonuc = sonuc * i;
            }
        }
        return sonuc;
    }


}
