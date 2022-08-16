package day05_for;

import java.util.Scanner;

public class C01_sayıYazdır {
    public static void main(String[] args) {
        //Kullanıcıdan 100'den küçük bir sayı isteyin. 1'den başlayarak girilen sayıya kadar tüm sayıları yazdırın. Ancak Sayı 3 ün katı ise sayı yerine "JAVA";  sayı 5 in katı ise
        // Sayı 3 ün katı ise "JAVA",sayi 5'in katı ise"GÜZELDİR"; sayı hem 3'ün hemde 5'in aktı ise "JAVA GÜZELDİR" yazacak... ( Örnekte : 15 girdim )

        int sayi;
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 100 den küçük bir sayı giriniz");
        sayi=scan.nextInt();

        if(sayi<1 || sayi>100){
            System.out.println("lütfen gecerli bir sayı giriniz");
        }else{ for(int i=1; i<=sayi; i++) {
            if(i%15==0) {
                System.out.println("JAVA GÜZELDİR"+"\n");
            } else if (i % 5 == 0) {
                System.out.println("GÜZELDİR");
            }else if (i%3==0){
                System.out.println("JAVA");
            }else {
                System.out.println(i);
            }


        }



        }
        }

    }
