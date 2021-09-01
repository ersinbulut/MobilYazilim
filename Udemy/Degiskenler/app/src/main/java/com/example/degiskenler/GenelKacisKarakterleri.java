package com.example.degiskenler;

public class GenelKacisKarakterleri {
    //-> \n yeni bir satıra geçer "Mehmet merhaba"
    //-> \t bir tab boşluk bırakır.
    //-> \\Eğer string ifade içerisinde \ koyacaksak kullanılır.
    //-> \" eğer string ifadeyi ekrana "java eğitimi" gibi yazdırmak istiyorsak kullnılır

    public static void main(String args[]){
        System.out.println("-----------------------");
        String yazi="Mehmet \"80\" notunu aldı.";

        String dosyayolu="C:\\Users\\Masaüstü\\";

        String paragraf="Merhaba\tNasılsın";
        String paragraf2="Merhaba\nNasılsınız\nKolay gelsin";

        String metin="Merhaba bu \"android\"\n\t eğitimi \\ java \\ dili ile öğrenicez.";

        System.out.println(yazi);  // Bu önemli
        //System.out.println(dosyayolu);
        System.out.println(paragraf);
        /* bu bir yorum satırıdır.*/
        System.out.println(paragraf2);

        System.out.println(metin);


        System.out.println("-----------------------");
    }
}
