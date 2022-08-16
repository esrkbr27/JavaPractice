package ReplitArray;

import java.util.Arrays;

public class array7 {
    public static void main(String[] args) {
        //Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        //
        //Array: []

        int[] arr={12,15,43,23,56,76,78,90,77,43};

        int deger=56;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[12, 15, 23, 43, 43, 56, 76, 77, 78, 90]

        System.out.println((Arrays.binarySearch(arr,deger))-1);


    }
}
