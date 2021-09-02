package com.example.nesnetabanliprogramlama;

public class OtobusMain {
    public static void main(String args[]){

        Otobus kamilKoc=new Otobus();
        kamilKoc.kapasite=50;
        kamilKoc.mevcutYolcu=20;
        kamilKoc.nereden="İstanbul";
        kamilKoc.nereye="Bursa";

        Otobus nilufer=new Otobus();
        nilufer.kapasite=40;
        nilufer.mevcutYolcu=10;
        nilufer.nereden="Ankara";
        nilufer.nereye="İzmir";
       System.out.println("------------------");
       kamilKoc.bilgiAl();
       System.out.println("------------------");
       nilufer.bilgiAl();
        System.out.println("------------------");
        kamilKoc.yolcuAl(20);
        kamilKoc.yolcuIndir(30);
        System.out.println("------------------");
        kamilKoc.bilgiAl();
        System.out.println("------------------");
        kamilKoc.nereye="İzmir";
        kamilKoc.bilgiAl();

    }
}
