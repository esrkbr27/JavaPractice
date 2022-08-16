package day09_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TekrarsızSayılarıEkle {
    public static void main(String[] args) {
        // Soru 2) Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun
        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int [] arryenı= benzersizArray(arr);
    }

    public static int[] benzersizArray(int[] arr) {
     Arrays.sort(arr); //
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]


        List <Integer> arryenı = new ArrayList<Integer>();

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                     arryenı.add(arr[i]);
            }

        }
        System.out.println(arryenı);

        if(!arryenı.contains(arr.length-1)) {
            arryenı.add(arr.length-1);
        }

        int[] yenıarr=new int[arryenı.size()];

        for (int i = 0; i < arryenı.size(); i++) {
            yenıarr[i] =arryenı.get(i);
        }
        System.out.println(Arrays.toString(yenıarr));









        return yenıarr;
    }
}
