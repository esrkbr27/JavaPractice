package ReplitİfSwitchTernary;

import java.util.Scanner;

public class C03_İfSwitchS6 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:

Ay Numarasi:

2

Yil :

2016

OUTPUT :

Subat 2016 29 Gundur.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil=scan.nextInt();
        System.out.println("Ayı giriniz");


        if(!( (yil%4 != 0)&&(yil%100 !=0)&&(yil%400 !=0))){

            String AyNumarasi=scan.next().toLowerCase();

            switch(AyNumarasi){
                case "ocak":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
                case "subat":
                    System.out.println(AyNumarasi+" "+ yil+" "+"29 Gundur. ");
                    break;
                case "mart":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur");
                    break;
                case "nisan":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur");
                    break;
                case "mayıs":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur");
                    break;
                case "haziran":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur");
                    break;
                case "temmuz":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur");
                    break;
                case "agustos":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur");
                    break;
                case "eylül":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur");
                    break;
                case "ekim":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur");
                    break;
                case "kasim":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur");
                    break;
                case "aralık":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur");
                    break;


            }

        }else{    String AyNumarasi=scan.next().toLowerCase();

            switch(AyNumarasi){
                case "ocak":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
                case "subat":
                    System.out.println(AyNumarasi+" "+ yil+" "+"28 Gundur. ");
                    break;
                case "mart":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
                case "nisan":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur.");
                    break;
                case "mayıs":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
                case "haziran":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur.");
                    break;
                case "temmuz":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
                case "agustos":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
                case "eylül":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur.");
                    break;
                case "ekim":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
                case "kasim":
                    System.out.println(AyNumarasi+" "+ yil+" "+"30 Gundur.");
                    break;
                case "aralık":
                    System.out.println(AyNumarasi+" "+ yil+" "+"31 Gundur.");
                    break;
            }



        }



    }
}
