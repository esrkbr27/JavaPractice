package day09_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayılar {
    public static void main(String[] args) {
        // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};
        //önce sayıları sıralayalım

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        //bastan baslayıp yanındakı ile karsılastırıp aynı mı degıl mı kontrol edecegız.

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length-1; i++) { //ikişerli karakterlere bakınca son elemanı kontrol
                                                // etmek için length -1 dedık
            if(arr[i]!=arr[i+1] && !list.contains(arr[i])) { //2 den fazla elamnı yazdırmamak için
                                                             //contains ile olmazsa ekle dedık
                System.out.print(arr[i] + " " );
                list.add(arr[i]);

            }

        }
        System.out.println(list);

    }
}
