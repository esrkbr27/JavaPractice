package day05_for;

import java.util.Scanner;

public class C07_veyaYazdır {
    public static void main(String[] args) {
        //100 den küçük sayı iste 3ün veya 5in katı ise yazdır.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 100 den küçük bir sayı giriniz");
        int sayi=scan.nextInt();

        if(sayi<0 || sayi>100){
            System.out.println("lütfen gecerli sınırda sayı giriniz. ");
        }else{
            for(int i=1; i<sayi; i++){
                if(i%3==0 || i%5==0){
                    System.out.print(i+" ");
                }
            }
        }

    }
}
