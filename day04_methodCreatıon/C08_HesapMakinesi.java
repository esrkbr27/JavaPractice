package day04_methodCreatıon;

import java.util.Scanner;

public class C08_HesapMakinesi {
    public static void main(String[] args) {
        /* Problem Tanımı :
         Basit 4 işlem yapan bir hesap makinesi kodlayınız....
         Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
         Kullanicidan iki sayi girmesini isteyiniz.
         Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
       */
        int sayi1=0;
        int sayi2=0;


        hesapMakinesi(sayi1, sayi2);



    }

    public static void hesapMakinesi(int sayi1, int sayi2) {
        Scanner scan=new Scanner (System.in);
        System.out.println("lütfen birinci sayıyı giriniz.");
        int num1=scan.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz.");
        int num2=scan.nextInt();
        System.out.println("lütfen yapacagınız işlemi giriniz");
        String islem=scan.next();
        int toplama=(num1+num2);
        int cıkarma=(num1-num2);
        int carpma=num1*num2;
        double bölme=(double)(num1/num2);
            switch(islem) {
                case "+":
                    System.out.println(toplama);
                    break;
                case "-" :
                    System.out.println(cıkarma);
                    break;
                case "*":
                    System.out.println(carpma);
                    break;
                case"/" :
                    System.out.println(bölme);


            



        }

    }
}
