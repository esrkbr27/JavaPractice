package day05_for;

import java.util.Scanner;

public class C08_Toplama {
    public static void main(String[] args) {

//iki sayı arası topla yazdır metodu




        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int ilk=scan.nextInt();
        int son=scan.nextInt();

        araTopla(ilk,son);

    }

    public static void araTopla(int ilk, int son) {

        int toplam=0;

        if(ilk<son){
            for(int i=ilk; i<=son; i++){
                toplam+=i;
            }
        }else {
            for(int i=son; i<=ilk; i++){
                toplam+=i;

            } System.out.println(son+ "ve"+ilk+" sayıları arasındakı sayıların toplamı: "+toplam);
        }



    }
}
