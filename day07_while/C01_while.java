package day07_while;

import java.util.Scanner;

public class C01_while {
    public static void main(String[] args) {
        // kullanıcı 0 girene kadar girilen sayıları sectiği işlem işaretine göre toplama ve carpma yaptırınız.
        int sayi=0;
        int toplama=0;
        int carpma=1;

        Scanner scan=new Scanner(System.in);
        System.out.println("yapacagınız işlemin sembolünü giriniz");
        String sembol=scan.next();


        do{
            System.out.println("sayıları giriniz");
            sayi=scan.nextInt();

            switch (sembol) {
                case "+":
                    toplama+=sayi;

                    break;
                case"*":
                    carpma*=sayi;


            }

        }while(sayi!=0);
        System.out.println(carpma);
        System.out.println(toplama);
    }
}
