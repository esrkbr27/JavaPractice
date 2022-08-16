package ReplitArray;

public class array3 {
    public static void main(String[] args) {

        //Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

             int[]  Array = {20, 30, 25, 35, -16, 60, -100 };

             int ortalama=0;
             int toplam=0;
        for (int i = 0; i < Array.length; i++) {
                   toplam += Array[i];
                   ortalama = toplam/Array.length;
        }
        System.out.println(ortalama);

    }
}
