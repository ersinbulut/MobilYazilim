package com.example.nesnetabanliprogramlama2.siniflar;

public class Urunler {
    private String urunAd;
    private int urunAdet;

    //1- boş constructor //Alt+Insert ya da //code den generated
    //2- dolu constructor
    //3- set ve get metodları olacak


    public Urunler() {
    }

    public Urunler(String urunAd, int urunAdet) {
        this.urunAd = urunAd;
        this.urunAdet = urunAdet;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public int getUrunAdet() {
        return urunAdet;
    }

    public void setUrunAdet(int urunAdet) {
        this.urunAdet = urunAdet;
    }
}
