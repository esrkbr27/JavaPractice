package day02_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        //kuln sayı al, pozitifse sayı pozitif,degilse sayının karesini al.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir  tamsayı giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi>=0 ? "Pozitif" :(sayi*sayi));
    }
}
