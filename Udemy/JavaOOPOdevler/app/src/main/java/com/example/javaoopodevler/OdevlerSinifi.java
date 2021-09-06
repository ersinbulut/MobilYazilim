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

    public void harfSayisiBul(String kelime,char harf){
        int boyut=kelime.length(); //araba

        char [] harfler = new char[boyut];

        for (int i = 0; i<boyut; i++){
            harfler[i] = kelime.charAt(i); // 0-a , 1 - r, 2 - a, 3 -a
        }
        int sayac = 0;
        for (int i = 0; i<boyut; i++){
            if (harfler[i] == harf){ // a
                sayac++;
            }
        }
        System.out.println("Harf sayısı : "+sayac);
    }


}
