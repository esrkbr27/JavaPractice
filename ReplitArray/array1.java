package ReplitArray;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
      /*  Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.

                not: Test datadaki değerleri kullanınız.?*/

        int[] arr1={1232, 1134,2345,1022};

  Arrays.sort(arr1);
     //   System.out.println(arr1); //[I@4dd8dc3  arrayın içindekı elemanları böyle yazdırırsam refranslarını getirir.
        System.out.println(Arrays.toString(arr1));//[1022, 1134, 1232, 2345]
        /*
        bir arrayı yazdırmak ıstıyorsam Arrays.toString metodunu kullanmalıyım.
        sort metodu arraydekı elemanları sıralara.Bu metodu kullanmak için de Arrays.sort(arr1) seklınde sıralarım.
        ve bu sıralama bır varıabke atamadan kalıcı olur.
         */

        int[] arr2={1022,1134,1232,2345};

        Arrays.sort(arr2);

        String[] str={"Java","Python","PHP","C#","C Programming","C++"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); //[C Programming, C#, C++, Java, PHP, Python]
    }
}
