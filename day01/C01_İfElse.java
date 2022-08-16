package day01;

import java.util.Scanner;

public class C01_İfElse {

    public static void main(String[] args) {

//Koşullar :
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sıcaklık degerini giriniz");
        double sck=scan.nextDouble();

        if(sck<5){
            System.out.println("kayak yapabilirsin");
        } else if (sck>5 && sck<15) {
            System.out.println("sinemaya gidebilirsin");
        } else if (sck>15 && sck<25) {
            System.out.println("piknige gidebilirsin");
        }else {
            System.out.println("yüzmeye gidebilirsin");
        }

    }


    }

