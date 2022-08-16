package day02_Ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
//kullanıcıdan bir sayı al, tek mi cift mi yazdır
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı girin");
        int sayi=scan.nextInt();

        System.out.println(sayi%2==0 ? "cift" : "tek");
    }
}
