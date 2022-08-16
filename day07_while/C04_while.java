package day07_while;

import java.util.Scanner;

public class C04_while {
    public static void main(String[] args) {
      /*  Sayı giriliyor. Sıfır girilmediği sürece negatif olanları kendi arasında;
        pozitif olanları kendi arasında topluyor. Sıfır girilirse döngüden çıkıyor ve
        bulduğu sonuçları yazdırıyor.
                */
        int sayi;
        int pozSayı=0;
        int negSayı=0;
        int pozToplam=0;
        int negToplam=0;
        boolean sonuc0Mı=false;

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        sayi=scan.nextInt();

        while(!sonuc0Mı){
            if(sayi>0){
             pozToplam+=sayi;
             pozSayı++;

            } else if (sayi<0) {
                negToplam+=sayi;
                negSayı++;

            }else{
                sonuc0Mı=true;
            }
            sayi++;
        }
        System.out.println("pozitif sayıların toplamı: "+ pozToplam);
        System.out.println("negatif sayıların toplamı: "+ negToplam);
        System.out.println(pozSayı+ "kadar pozitif sayı var.");
        System.out.println(negSayı+ "kadar negatif sayı var.");

    }
}
