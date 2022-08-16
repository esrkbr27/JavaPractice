package ReplitArray;

public class array9 {

    public static void main(String[] args) {
        //Array: [] bu arrayde kac tane cıft kac tane tek sayı vardır?

        int[] arr={1,2,3,4,5,6,7,8,9};
        int cıft = 0;
        int tek = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) {
                cıft++;

            }
            else{
                tek++;
            }

        }
        System.out.println("tek sayı = " + tek);
        System.out.println("cıft = " + cıft);
    }


}
