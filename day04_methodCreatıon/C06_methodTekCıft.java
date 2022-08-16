package day04_methodCreatıon;

import java.util.Scanner;

public class C06_methodTekCıft {
    public static void main(String[] args) {
    tekMiCıftMi();
    sıfırdanBuyukMu();


    }

    public static void sıfırdanBuyukMu() {

       int sayi1=0;
        if (sayi1==0){
            System.out.println("sayi 0 a eşittir.");
        } else if (sayi1 >= 0) {
            System.out.println("sayi 0 'dan büyüktür.");
        } else if (sayi1<=0) {
            System.out.println("sayi 0 'dan küçüktür.");

        }else {
            System.out.println("lütfen tamsayı giriniz");
        }

    }

    public static void tekMiCıftMi() {
        System.out.println("lütfen bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        if (sayi%10==0) {
            System.out.println(sayi +": cift");
        }else {
            System.out.println(sayi +": tek");
        }
    }
}
