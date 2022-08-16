package day08_Arrays;

public class C10_mda {
    public static void main(String[] args) {
        // Soru 3) Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
//elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arr1 = { {1,2},
//{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};


        //arr1 için aynı ındexe sahıp ınner arraylerın toplamı;
        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                if (i == j) {
                    toplam += arr1[i][j];
                }
            }
            //arr1[0][0]+ arr1[1][1] // 1+4
        }
        System.out.println("aynı ındexe sahıp olan ıc arraylerın toplamı: " + toplam);


        //arr2 için aynı ındexe sahıp ınner arraylerın toplamı;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                if (i == j) {
                    toplam += arr1[i][j];
                }
            }

        }
        System.out.println("aynı ındexe sahıp olan ıc arraylerın toplamı: " + toplam);



    }
}
