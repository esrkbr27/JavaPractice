package Lambda;

import java.util.Arrays;

public class Array1 {

    /*

Bir array , integer bir "k" değeri ve eşik değeri olarakda integer "thereshold" değeri verilecek, "k" boyutunda
ve elemanlarının ortalaması eşik değerinden büyük veya ona eşit olan kaç adet alt-dizilerin olduğunu ve
bu alt dizileri ekrana yazdıran bir metod oluşturunuz.
Not: yeni oluşacak elemanlar, ilk diziden seçilirken arka arkaya sıralı gelmeli.

Örnek :

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold(eşik) = 4
Output: 3

 */

//bu arrayden 3 elemanlı sub array oluştur , bu arraylerin ortalaması 4 olsun
public static void main(String[] args) {



int [] arr= {2,2,2,2,5,5,5,8};
int k=3;
int threshold=4;
    System.out.println(numofSubArrays(arr, k, threshold));


}

public static  int numofSubArrays( int[] num,int k, int threshold ){
    int [] arr2= new int[k];
int sum=0;
int count=0;

/*
arrayden k elemalı subarrayler oluşturacagım,
ortalaması threshold degerine esit ve fazla olabilir
kac tane böyle array var onu count ile sayacagım
 */

    for (int i = 0; i < num.length; i++) {
         if(i==num.length-(k-1)) break;

         System.arraycopy(num,i,arr2,0,k);

        for (int j = 0; j < k; j++) {
            sum += arr2[j];
        }

        if(sum>=threshold){
            count++;
            System.out.println(Arrays.toString(arr2));
        }
         sum=0;
    }

    return count;

}
}


