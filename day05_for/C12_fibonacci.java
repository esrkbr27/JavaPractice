package day05_for;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_fibonacci {
    public static void main(String[] args) {
           /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı girin");
        int sayi=scan.nextInt();

        fibonacci(sayi);
    }

    private static void fibonacci(int sayi) {

        int sayi1=0;
        int sayi2=1;
        System.out.print(sayi1+ " ,"+sayi2);

        int sayi3;

        if(sayi1<47){
            for (int i = 2; i <sayi; i++) { //ilk 2 degeri yazdırdıgım için 2 den basladım)
                sayi3=sayi1+sayi2;
                System.out.print(","+sayi3);
                sayi1=sayi2;
                sayi2=sayi3;


            }

        }else{
            System.out.println("47'den kucuk sayi giriniz");
        }


        System.out.println("--------2.yol----------");

        int no=12;

        List<Integer> q=new ArrayList<Integer>();

        q.add(0);
        q.add(1);


        int i=1;

        while(q.get(i)<no){
            q.add(q.get(i)+q.get(i-1));

            i++;
        }

        System.out.println("q = " + q);
    }
}
