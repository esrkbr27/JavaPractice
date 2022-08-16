package ReplıtForWhile;

import java.util.Scanner;

public class C02_EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 tamsayi giriniz :");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int EBOB = 0;
        int EKOK = 1;

        //EBOB icin
        for (int i = 1; i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                EBOB = i;
            }
        }
        System.out.println("30 ve 40 icin GCD = " + EBOB);
        //EKOK icin
        for (int i = sayi1*sayi2; i > 0; i--) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                EKOK = i;
            }
        }
        System.out.println(EKOK);
    }
}