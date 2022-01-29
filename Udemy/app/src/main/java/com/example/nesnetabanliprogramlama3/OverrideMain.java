package com.example.nesnetabanliprogramlama3;

public class OverrideMain {

    public static void main(String[] args) {

        Hayvan hayvan=new Hayvan();
        hayvan.sesCikar();

        Memeliler memeliler= new Memeliler();
        memeliler.sesCikar();

        Kopek kopek= new Kopek();
        kopek.sesCikar();

        Kedi kedi=new Kedi();
        kedi.sesCikar();
    }
}
