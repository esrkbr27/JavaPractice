package day08_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //Array iki farklı şekilde tanımlanabilir.

        int number[]={1, 2, 3, 4, 5, 6};

        int []number1={1, 2, 3, 4, 5, 6};

        //içine atama yapmadan atamak istersek asagıdakı sekılde yapılır."sayi" arrayine bir deger atamazsak
        // java default deger atar.

        int sayi []=new int [6]; //lengthi 6 olan bir array

        // oluşturulan bir arryın lengthı degıstırlemez,ancak farklı uzunlukta yenı bır array oluşturulur.

         sayi =new int[5];

         //arrayın degerlerını ayrı ayrı yazdırmak için index kullanırız.

        int sayi1[]={1,2,3};

        sayi1[0] =5; //0. indexdekı 1 degerini 5 yaptık
        sayi1[2] =2;  // 2. indexdekı 3 degerini 2 yaptık.
        sayi1[4]=0; // verilen arrayın uzunlugundan fazla bir index yazarsak exceptıon yazdırırır.

        //sayi1 arrayını yazdırırsam artık {5,2,2} olur.

        //bir arrayı yazdırmak için
        System.out.println(Arrays.toString(sayi1)); // [1, 2, 3] seklınde yazdırılır.
        System.out.println(sayi1[0]); // [1] yazdırır.




    }
}
