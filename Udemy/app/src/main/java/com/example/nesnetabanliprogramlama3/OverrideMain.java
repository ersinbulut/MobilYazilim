package com.example.nesnetabanliprogramlama3;

public class OverrideMain {

    public static void main(String[] args) {

        /*Hayvan hayvan=new Hayvan();
        hayvan.sesCikar();

        Memeliler memeliler= new Memeliler();
        memeliler.sesCikar();

        Kopek kopek= new Kopek();
        kopek.sesCikar();

        Kedi kedi=new Kedi();
        kedi.sesCikar();*/

        Hayvan hayvan= new Kedi();
        //Hayvan nesnesinin içinde kedinin özellikleri
        Hayvan h1=new Kedi();
        Hayvan h2= new Kopek();
        Hayvan h3=new Memeliler();

        h1.sesCikar();
        h2.sesCikar();
        h3.sesCikar();

        hayvan.sesCikar();

    }
}
