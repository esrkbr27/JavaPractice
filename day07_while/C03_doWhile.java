package day07_while;

import java.util.Scanner;

public class C03_doWhile {
    public static void main(String[] args) {
        //sifre=2424 olsun

        Scanner scan = new Scanner(System.in);
        int sifre;
        boolean sıfreDogrumu=true;

        do{
            System.out.println("lütfen sifreyi giriniz");
            sifre=scan.nextInt();
            if(sifre==2424){
                System.out.println("sifre dogru");
                sıfreDogrumu=false;

            }else {
                System.out.println("sifre yanlıs");
            }

        }while(sıfreDogrumu);
    }
}
