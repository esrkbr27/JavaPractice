package day01;

import java.util.Scanner;

public class C05_İfElse {
    public static void main(String[] args) {

        //Koşullar :
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sıcaklık degeri giriniz");
        double sck=scan.nextDouble();

        if(sck<5) {
            System.out.println("kayak yapabilirsin");
         } else if (sck<25) {
            if (sck < 15) {
                System.out.println("sinema");
            }
            if (sck > 10) {
                System.out.println("piknik");
            }

        } else {
            System.out.println("yüzme");
        }
    }
    }