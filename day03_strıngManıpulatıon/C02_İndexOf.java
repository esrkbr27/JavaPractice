package day03_strıngManıpulatıon;

public class C02_İndexOf {
    public static void main(String[] args) {
        String ad = "John";
        String soyad = "White";
        String kartno = "1234234534561478";

        //Input :
        //
        //John White
        //
        //1234234534561478
        //
        //Output : Name :
        //
        //J*** W****
        //
        //CCN : **** **** **** 1478
        //
        //Ilk Harfler Buyuk harf ile baslamalidir.

       ad = ad.toUpperCase().substring(0, 1).concat(ad.substring(1).replaceAll("\\w", "*"));
       soyad = soyad.toUpperCase().substring(0, 1).concat(ad.substring(1).replaceAll("\\w", "*"));
        kartno =kartno.substring(0,13).replaceAll("\\w", "*").concat("1478");


    }
}
