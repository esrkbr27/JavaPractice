package day08_Arrays;

import java.util.Arrays;

public class C09_MultıDımensoınalArray {
    public static void main(String[] args) {
     /*
        Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana yazdiran bir program yaziniz
         { {1,2,3}, {4,5}, {6,7} }
      */

        int [][] arr= { {1,2,3}, {4,5}, {6,7} };
        int toplam=0;
        int[]ar=new int[arr.length];
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
               toplam += arr[i][j];

            }
            ar[i] = toplam;
            toplam = 0;
        }

    }
}
