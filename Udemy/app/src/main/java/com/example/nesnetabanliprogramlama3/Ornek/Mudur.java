package com.example.nesnetabanliprogramlama3.Ornek;

public class Mudur extends Personel{
    public void iseAll(Personel p){
        p.iseAlindi();
    }

    public void terfiEttir(Personel p){
        if (p instanceof  Ogretmen){
            ((Ogretmen)p).maasArttir();
        }
        if (p instanceof İsci){
            System.out.println("İşciler terfi alamaz");
        }
    }
}
