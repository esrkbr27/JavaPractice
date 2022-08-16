package day02_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan 2 sayı alın büyük olmayanı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. sayıyı giriniz");
        int sayi=scan.nextInt();
        System.out.println("lütfen 2. sayıyı giriniz");
        int sayi2=scan.nextInt();
        int büyük=(sayi>sayi2) ? sayi : sayi2;

        System.out.println("büyük olan sayi : "+ büyük);
    }
}
