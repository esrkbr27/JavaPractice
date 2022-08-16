package day04_methodCreatıon;

public class C04_methodHarfGızle {
    public static void main(String[] args) {
        // Input olalarak verilen isim ve soyismi ilk harfi büyük, geriye kalan harfler * olacak şekilde
        //İ*****, H****** şeklinde method oluşturun.
        String isim="Esra";
        String soyisim="Demirci";

        harfGızle(isim, soyisim);

        System.out.println(isim+", "+ soyisim);

    }

    public static void harfGızle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");

        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1)
                .replaceAll("\\w","*");


    }
}
