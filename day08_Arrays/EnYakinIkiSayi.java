package day08_Arrays;

import java.util.Arrays;

public class EnYakinIkiSayi {
    public static void main(String[] args) {
/*
  Farklı güçleri olan atlarla bir at yarışı düzenliyor. Atların gücü bir tamsayı dizi assign  edilirse.
                bir birine yakın güçlere sahip at çiftlerini bulunuz.
                For example :{3, 67, 9, 46, 55, 48}
        output : 46,48
 */

        int [] arr={3, 4, 9, 46, 55, 48};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // [3, 9, 46, 48, 55, 67]
        int fark=Math.abs(arr[0]-arr[1]);
        try {
            for (int i = 1; i < arr.length; i++) {
                if(Math.abs(arr[i-1]-arr[i])<=fark) {
                    fark=arr[i-1]-arr[i];
                    System.out.println(arr[i]+"-"+arr[i-1]);
                }
            }
        } catch (Exception e) {
            System.out.println("sınırı astım,biliyorum,sen bana sonuc ver.");
        }
        System.out.println(fark);


        System.out.println("------------2.çözüm-----------------");

        int s1 = arr[0];
        int s2 = arr[1];

        int kucuk = Math.abs(s1 - s2); //|3-67| //farkın mutlak degerini aldık.

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < kucuk) {
                    kucuk = Math.abs(arr[i] - arr[j]);
                    s1 = arr[i];
                    s2 = arr[j];
                }


            }

        }
        System.out.println(s1 + "," + s2);

        System.out.println("-----------------3.yol-------------------");

        int[] arr1 = {1, 4, 9, 46, 50, 55, 98, 97};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[3, 9, 46, 48, 55, 67]
        int fark1 = arr1[1] - arr1[0];
        for (int i = arr1.length - 1; i >= 1; i--) {
            if (fark >= arr1[i] - arr1[i - 1]) {
                fark = arr1[i] - arr1[i - 1];
                if (fark >= arr1[i] - arr1[i - 1]) {
                    System.out.println("Birbirine en yakın at ciftleri : " + arr[i] + " " + arr[i - 1]);
                }


            }
        }
    }
}

