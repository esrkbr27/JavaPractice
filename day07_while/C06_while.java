package day07_while;

import java.util.Scanner;

public class C06_while {
    public static void main(String[] args) {
       /*
Kullanıcıdan bir harf  girmesini isteyin. Girilen harf sesli ise sesli harf olduğunu,
sessiz ise sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden fazla ise
hata mesajı göstersin. (test girilen harfi büyük yada küçük duyarlıdır)
örnek: sesli harfler : a,e,ı,u,o
w.x girdiğinde yanlış karakter girsin uyarısı versin
 */



        String seslıHarfler = "aeıou";
        String sessızHarfler = "bcdfghjklmnprstvyz";


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter girin");
        hangiHarf();


    }

    public static void hangiHarf() {

        String seslıHarfler = "aeıou";
        String sessızHarfler = "bcdfghjklmnprstvyz";


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter girin");

        char karakter = scan.next().toLowerCase().charAt(0);
        if(!(karakter>='a'&& karakter<='z')){
            System.out.println("girilen karakter harf değil");
        } else if (karakter=='w'&& karakter<='x') {
            System.out.println("yanlış karakter girdin.");
        }
        String degısenKarakter = karakter+"";
        if (degısenKarakter.length()!=1){
            System.out.println("fazla karakter girdin.");
        }else if(seslıHarfler.contains(degısenKarakter)){
            System.out.println("girilen harf sesli harftir.");
        } else if (sessızHarfler.contains(degısenKarakter)) {
            System.out.println("girilen harf sessiz harftir.");

        }
    }
}