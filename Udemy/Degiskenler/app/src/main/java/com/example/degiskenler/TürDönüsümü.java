package com.example.degiskenler;

public class TürDönüsümü {

    public static void main(String args[]){

        System.out.println("----------------------");
        double d =23.56;
        long l = (long) d;
        int i = (int) l;

        System.out.println("Double: "+d);
        System.out.println("Long: "+l);
        System.out.println("İnt: "+i);

        System.out.println("----------------------");

        int x=67;
        long y =x;
        double z=y;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);

        System.out.println("----------------------");
        //sayıyı yazıya dönüştürme
        int sayi=56;
        String yazi1=String.valueOf(sayi);//bu metodu kullanın
        String yazi2=Integer.toString(sayi);
        String yazi3=sayi + "";

        System.out.println(yazi1);
        System.out.println(yazi2);
        System.out.println(yazi3);

        System.out.println("----------------------");
        //yazıyı sayıya dönüştürme

        String metin="78";
        int sayi1=Integer.parseInt(metin);
        int sayi2=Integer.valueOf(metin);

        System.out.println(sayi1);
        System.out.println(sayi2);





    }
}
