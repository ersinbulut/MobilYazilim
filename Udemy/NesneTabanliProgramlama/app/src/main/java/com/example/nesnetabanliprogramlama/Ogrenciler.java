package com.example.nesnetabanliprogramlama;

public class Ogrenciler {
    String isim;
    int okulNo;
    String adres;

    public Ogrenciler(){

    }
    //this bu sınıfın özelliğini işaret eder
    public Ogrenciler(String isim,int okulNo,String adres){
        this.isim=isim;
        this.okulNo=okulNo;
        this.adres=adres;
    }
}
