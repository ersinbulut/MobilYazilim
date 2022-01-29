package com.example.nesnetabanliprogramlama3.İnterface;

public class Elma implements Eatable,Squueezable{
    @Override
    public void howToEat() {
        System.out.println("Yıka ve Yee");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("Soy ve suyunu çıkar.");
    }
}
