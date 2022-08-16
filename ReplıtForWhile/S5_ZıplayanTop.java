package ReplıtForWhile;

import java.util.Scanner;

public class S5_ZıplayanTop {
    /*
Bir top belirli bir yukseklikten atilmaktadir
Atildiktan sonra, atildigi yuksekligin 4/3u kadar yerden yukari dogru ziplamaktadir
Top ziplama yuksekligi 1 metrenin altina indiginde durmaktaadir
Bu ana kadar aldigi toplam yolu ve yee vurma sayisini bulan do while blogu crate ediniz.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yukseklık giriniz");
        double h =scan.nextDouble(); //h =100 olsun
        double yol=0;
        int vs=0;


         yol=h;

        do{

        h=h*3/4;//ilk deger 75
      if(h>1)  {
          vs++;
      }

        yol+=h+h;



        } while(h>=1);

                                            System.out.println("topun aldıgı yol: "+ yol);
                                            System.out.println("topun zıplama sayısı: "+vs);
    }

}
