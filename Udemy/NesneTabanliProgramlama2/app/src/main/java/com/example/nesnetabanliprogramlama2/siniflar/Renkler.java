package com.example.nesnetabanliprogramlama2.siniflar;

public class Renkler {
    public static final int BEYAZ=1111;
    public static final int SİYAH=0000;
    public static final int KİRMİZİ=3333;

    public void boya(int renkTercihi){
        if (renkTercihi == 1111){
            System.out.println("Beyaz'a boyandı.");
        }
        if (renkTercihi == 0000){
            System.out.println("Siyah'a boyandı.");
        }
        if (renkTercihi == 3333){
            System.out.println("Kırmızı'ya boyandı.");
        }
    }

}
