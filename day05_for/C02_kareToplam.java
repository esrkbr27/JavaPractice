package day05_for;

import java.util.Scanner;

public class C02_kareToplam {
    public static void main(String[] args) {
        //kullanıcıdan bir deger alın ve bu degere kadar sayıların karelerinin toplamını bulun
         Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 10 dan küçük pozitif bir sqyı giriniz");
        int sayi=scan.nextInt();
        int toplam=0;
        if(sayi>10 || sayi<0){
            System.out.println("lütfen 10 dan küçük bir sqyı giriniz");
        }else{
            for(int i=0; i<=sayi; i++){
               toplam+=i*i;

            }
            System.out.println(sayi+" kadar sayıların kareleri toplamı: "+ toplam);
        }

    }
}
