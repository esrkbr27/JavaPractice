package ReplitArray;

public class arraypaskalucgeni {
    public static void main(String[] args) {
        //5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
//Beklenen Çıktı:
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1

        int sayi = 5, number;
        for (int i = 0; i < sayi; i++) {
            for (int k = sayi; k > i; k--)
                System.out.print(" ");
            number =1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}