package day05_for;

import java.util.Scanner;

public class C06_3unKatınıYaz {
    public static void main(String[] args) {

        //kullanıcıdan 100 den küçük sayı iste,1 den başlayarak 3 ün katı olanları yazdır.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100 den küçük bir sayı giriniz");
        int sayı=scan.nextInt();
        if(sayı>100|| sayı<0) {
            System.out.println("lütfen gecerli sayı giriniz");
        }else {
            for(int i=1; i<sayı; i++) {
                if(i%3==0) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
