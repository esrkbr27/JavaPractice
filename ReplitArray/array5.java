package ReplitArray;

import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        //yazılan değerin array içerisinde arayan Java Kodu yazınız.
        //
        //Array: [1551,1223,1443,1267,1789,1023,2020]

        int [] arr={1551,1223,1443,1267,1789,1023,2020};
        int yazılandeger=2020;

        Arrays.sort(arr);//sıraladık
        System.out.println(Arrays.toString(arr));//[1023, 1223, 1267, 1443, 1551, 1789, 2020]

        //binarySearch metodu bize int döndürüyor.
        System.out.println(Arrays.binarySearch(arr,yazılandeger)); //6 bulundugu indexi verdi.

    }
}
