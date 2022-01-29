package com.example.nesnetabanliprogramlama3.Ornek;

public class OkulOrnekMain {
    public static void main(String args[]){

        Mudur mudur=new Mudur();
        // Polymorphism  den yararlanma
        Personel ogretmen = new Ogretmen();
        Personel isci = new İsci();

        mudur.iseAll(ogretmen);
        mudur.iseAll(isci);

        mudur.terfiEttir(ogretmen);

        mudur.terfiEttir(isci);

    }
}
