package ReplıtForWhile;

import java.util.Scanner;

public class C01_S1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
         ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim=scan.nextLine().toLowerCase().replaceAll("\\W","");

        char ch1='a';
        String karakter=ch1+"";

        int counter=0;


        for (int i = 0; i < isim.length(); i++) {
            if(isim.substring(i,i+1).equals(karakter)){
                counter++;
            }

        }
        System.out.println("Number of a = "+ counter);
    }
}
