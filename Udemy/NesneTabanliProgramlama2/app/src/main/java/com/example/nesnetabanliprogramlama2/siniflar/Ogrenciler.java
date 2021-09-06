package com.example.nesnetabanliprogramlama2.siniflar;
//private: sadece kendi bulunduğu sınıftan erişilebilir.
//protected: sadece bulunduğu paketten erişilebilir.
//public: her yerden erişilebilir.

public class Ogrenciler {
    private String isim; //access modifier yoksa bu protected dir.
    private int okulNo;

    public void setIsim(String isim){
        this.isim=isim;//atama işlemi
    }
    public String getIsim(){
        return this.isim;
    }

    public void setokulNo(int okulNo){
        this.okulNo=okulNo;//atama işlemi
    }
    public int getokulNo(){
        return this.okulNo;
    }

    public void bilgiAl(){
        System.out.println("Öğrenci adı    : "+isim);
        System.out.println("Öğrenci okul no: "+okulNo);
    }
}
