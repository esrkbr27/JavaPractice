package day08_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ArraydekıElemanlarıKaydırma {
    // Verilen 3 elemanlı bir array'in tum elemanlarını
// bir sonraki konuma taşısayacak bir program yaziniz.
    //  Ornek; array [1,2, 3] ise
    //  output [3,1,2] olacak.

    public static void main(String[] args) {

        //saga kaydırınca son degeri kaybeymemek için tempe atadık
        int [] array={1,2,3};
        int temp=array[array.length-1];

        for (int i = array.length-1; i > 0; i--) {
            array[i] =array[i-1];

        }
        array[0] =temp;
        System.out.println(Arrays.toString(array)); //[3, 1, 2]


        System.out.println("---------2. YOL------------------------------------");

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);

        }
        System.out.println(list);//[3, 1, 2]

        list.set(0,2); //0. indexin yerine 2 koy
        list.set(1,3); //1. indexin yerine 3 koy
        list.set(2,1); //2. indexin yerine 1 koy

        System.out.println(list);
        System.out.println("---------------------------------------------------------------");












    }
}
