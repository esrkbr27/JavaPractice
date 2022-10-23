package Lambda;

import java.util.Arrays;

public class Arraysorted {
        public static void main(String[] args) {
/*

Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
değerlerde ekrana yazdıran metod oluşturunuz

Örnek :

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

 */

            int [] arr={-4,-1,0,3,10};

            sortedArr(arr);
            System.out.println(Arrays.toString(sortedArr(arr)));


            int[] num2=  Arrays.stream(arr).map(x->x*x).sorted().toArray();
            System.out.println(Arrays.toString(num2));
        }


        public static int[] sortedArr(int [] num){


            for (int i = 0; i < num.length; i++){
                num[i] = num[i]*num[i];
            }
            Arrays.sort(num);

            return num;
        }
}
