package com.example.nesnetabanliprogramlama;

public class Araba {
    String renk;
    int hız;
    double uzunluk;
    boolean calisiyorMu;

    //method davranışı
    public void calistir(){
        calisiyorMu=true;
    }
    public void durdur(){
        calisiyorMu=false;
    }
    public void hizlan(int miktar){
        hız= hız+miktar;
    }

    public void yavasla(int miktar){
        hız= hız-miktar;
    }



}
