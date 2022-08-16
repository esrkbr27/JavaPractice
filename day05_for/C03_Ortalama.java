package day05_for;

import java.util.Scanner;

public class C03_Ortalama {
    public static void main(String[] args) {
        //girilen sayıya kadar sayıların ortalamasını bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();
        double toplam=0;
        double ortalama=0;
        for(int i=1; i<=sayi; i++) {
            ortalama=(toplam+=i)/i;


        }
        System.out.println(sayi +" ya kadar sayıların ortalaması: "+ ortalama);
    }
}
