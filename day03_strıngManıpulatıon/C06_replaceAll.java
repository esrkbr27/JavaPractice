package day03_strıngManıpulatıon;

public class C06_replaceAll {
    public static void main(String[] args) {
        String cml=  "     Java ahJava. !.Seni ogrendigimiz GUN her sey# 123Cok KOLAY olacak    ";

        //replaceAll da istenen karakterin hepsinin yerine başka bir ifade yazılabilir.
        //Sadece " " ile yazılabilir.REPLACEALL REGULAR EXPRESSION (REGEX) ler kullanılır.

        //  \\s--->"bütün spaceleri siler
        //  \\S--->"Space olmayan her şeyi siler
        //  \\w--->"bütün harf ve rakamları siler"
        //  \\W--->"Harf ve rakam haricindekileri siler"
        //  \\d--->"rakamları siler"
        //  \\D--->""Rakam olmayanları siler."

        //önce dijitlerden kurtulalım.

        System.out.println(cml.replaceAll("Java","dünya"));

        cml=cml.replaceAll("\\d","");
        System.out.println(cml);

        //özel karakterleri silmek istiyorum ama boşluklarda silincek,boşlukların silinmemesi için
        // önce " " yerine birdizi harf yazıyorum.

        cml=cml.replaceAll(" ","xyz");
        cml=(cml.replaceAll("\\W","").replace("xyz"," ")
                .replaceAll("ahJava","ah java").replace("Seni","seni")
                .replace("GUN","gün").replace("Cok","çok")
                .replace("KOLAY","kolay").replace("olacak","olacak."));

        System.out.println(cml);





    }
}
