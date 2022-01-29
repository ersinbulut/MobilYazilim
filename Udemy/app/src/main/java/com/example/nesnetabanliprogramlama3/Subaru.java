package com.example.nesnetabanliprogramlama3;

public class Subaru extends  Araba {
    private String motorHacmi;

    public Subaru() {
        super("Sedan");//üst sınıflı bir constractor oluşturursak üst sınıf araba nın constractor u çalışır.
        System.out.println("Subarı boş constructor çalıştı");
    }

    public Subaru(String motorHacmi){
        super();
        this.motorHacmi=motorHacmi;
        System.out.println("Subarı dolu constructor çalıştı");
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
