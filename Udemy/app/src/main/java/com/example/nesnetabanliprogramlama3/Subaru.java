package com.example.nesnetabanliprogramlama3;

public class Subaru extends  Araba {
    private String motorHacmi;

    public Subaru() {
    }

    public Subaru(String motorHacmi){
        this.motorHacmi=motorHacmi;
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
