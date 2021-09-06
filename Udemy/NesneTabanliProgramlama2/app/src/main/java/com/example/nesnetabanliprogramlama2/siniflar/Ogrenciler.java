package com.example.nesnetabanliprogramlama2.siniflar;

public class Ogrenciler {
    public String isim; //access modifier yoksa bu protected dir
    public int okulNo;
    //private: sadece kendi bulunduğu sınıftan erişilebilir.
    //protected: sadece bulunduğu paketten erişilebilir.
    //public: her yerden erişilebilir.

    public void bilgiAl(){
        System.out.println("Öğrenci adı    : "+isim);
        System.out.println("Öğrenci okul no: "+okulNo);
    }
}
