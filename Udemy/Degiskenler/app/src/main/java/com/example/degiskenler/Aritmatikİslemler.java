package com.example.degiskenler;

public class Aritmatikİslemler {

    public static void main(String args[]){
        System.out.println("------------------");
        //pi*r2

        double dairealanı;
        double pi=3.14;
        int yarıçap=2;

        dairealanı=pi*yarıçap*yarıçap;

        System.out.println("Daire Alanı: "+dairealanı);

        int kuvvet;
        int kutle=67;
        int ivme=10;

        kuvvet=kutle*ivme;

        System.out.println("Kuvvet: "+kuvvet);


        int x;
        int x2;
        int v=30;
        int v0=40;
        int t=5;
        int a=2;

        x=((v+v0)/2) * t;

        System.out.println("X: "+x);

        x2=(v0*t)+(a*t*t)/2;

        System.out.println("X2: "+x2);


        int toplam=80;


        //toplam=toplam+20;
        toplam+=20;//kısa yolu

        System.out.println("Toplam: "+toplam);

        int carpma=30;
        carpma*=50;

        System.out.println("Çarpım: "+carpma);

        int sayi1=4; //sayı 1 = 4
        int sayi2=++sayi1; //sayi1=5, sayi2=5
        int sayi3=++sayi1;//sayi1=6, sayi3=6

        System.out.println("sayı1: "+sayi1);
        System.out.println("sayı2: "+sayi2);
        System.out.println("sayı3: "+sayi3);

        System.out.println("------------------");

        int sayi4=4; //sayı4 = 4
        int sayi5=++sayi4; //sayi4=5, sayi5=5
        int sayi6=--sayi4;//sayi4=6, sayi6=6

        System.out.println("sayı4: "+sayi4);
        System.out.println("sayı5: "+sayi5);
        System.out.println("sayı6: "+sayi6);

        System.out.println("------------------");

        int k=10; //k=10
        int l=k++;//l=10, k=11
        int z=k++;//z=11, k=12

        System.out.println("k: "+k);
        System.out.println("l: "+l);
        System.out.println("z: "+z);

        System.out.println("------------------");

        int m=10; //k=10
        int n=m++;//l=10, k=11
        int o=m--;//z=11, k=11

        System.out.println("m: "+m);
        System.out.println("n: "+n);
        System.out.println("o: "+o);




        System.out.println("------------------");

    }
}
