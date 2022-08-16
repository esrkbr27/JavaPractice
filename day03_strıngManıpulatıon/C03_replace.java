package day03_strıngManıpulatıon;

import java.util.Scanner;

public class C03_replace {
    public static void main(String[] args) {
//Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
//Input :
//John White
//1234234534561478
//Output : Name :

//J*** W****
//
//CCN : **** **** **** 1478
//
//Ilk Harfler Buyuk harf ile baslamalidir.

        Scanner scan=new Scanner (System.in);
        System.out.println("adınızı giriniz");
        String ad=scan.nextLine().toUpperCase();
        System.out.println("soyadınızı giriniz");
        String soyad=scan.nextLine().toUpperCase();
        System.out.println("kredi kartı numaralarınızı giriniz");
        String kartno=scan.nextLine();

        ad=ad.toUpperCase().substring(0,1).concat(ad.substring(1).replaceAll("\\w","*"));
        soyad=soyad.toUpperCase().substring(0,1).concat(ad.substring(1).replaceAll("\\w","*"));
        kartno=kartno.substring(0,kartno.length()-4 ).replaceAll("\\w","*").replace("","*").concat(" 1478");

        System.out.print(ad +" "+soyad+"\n"+ "CCN : "+kartno);

    }
}
