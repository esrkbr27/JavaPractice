package day01;

import java.util.Scanner;

public class C03_İfElse {
    public static void main(String[] args) {

        // Ödev
//Girilen 3 sayıyı "kucukten buyuge" sıralayan programı yazınız.
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 1. pozitif tam sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lütfen 2. pozitif tam sayıyı giriniz");
        int sayi2=scan.nextInt();
        System.out.println("lütfen 3. pozitif tam sayıyı giriniz");
        int sayi3=scan.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3){
            System.out.println("en büyük sayi :" + sayi1);
        }  else if (sayi2>sayi1 && sayi2>sayi3){
            System.out.println("en büyük sayi :"+sayi2);
        }   else {
            System.out.println("en büyük sayi"+ sayi3);
        }
    }
}