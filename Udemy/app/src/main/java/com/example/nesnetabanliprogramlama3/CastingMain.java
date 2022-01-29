package com.example.nesnetabanliprogramlama3;

public class CastingMain {
    public static void main(String args[]){

    //subaru dan arabaya dönüşüm yaparsak upcasting yukarı dönüşüm
        Subaru subaru=new Subaru();
        Araba araba=subaru;
        //UP

    //araba dan subaru ya dönüşüm yaparsak downcasting aşağı dönüşüm
        Araba araba1=new Araba();
        Subaru subaru1=(Subaru) araba1;
        //Down



    }
}
