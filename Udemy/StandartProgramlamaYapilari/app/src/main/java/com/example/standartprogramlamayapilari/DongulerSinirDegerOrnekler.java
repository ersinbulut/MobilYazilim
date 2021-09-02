package com.example.standartprogramlamayapilari;

public class DongulerSinirDegerOrnekler {
    public static void main(String args[]) {

        //örnek 1 : 3 ile 6 arasında 3,4,5,6

        for (int k=3;k<7;k++){
            System.out.println("k değer: "+k);
        }
        System.out.println("------------");
        int a =3;
        while (a<7){
            System.out.println("a deger : "+a);
            a++;
        }
        System.out.println("------------");

        //örnek 2: 0-8 -> 0,2,4,6,8

        for (int z=0;z<9;z+=2){
            System.out.println("z deger : "+z);
        }
        System.out.println("------------");

        int m=0;
        while (m<9){
            System.out.println("m değer :"+m);
            m=m+2;
        }
        System.out.println("------------");


    }
}
