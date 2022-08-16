package ReplitArray;

public class array2 {
    public static void main(String[] args) {
      /*
        Array deki sayıları tolpayan Java kodunu yazınız.
       */

            int[] array ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int toplam=0;

        for (int i = 0; i < array.length; i++) {
            toplam += array[i];


        }
        System.out.println(toplam);
    }
}
