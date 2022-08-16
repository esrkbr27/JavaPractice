package day06_nestedFor;

public class C05_Faktoriyel {
    public static void main(String[] args) {
     /*   int sayi=6;
        int carpim=1;
        for (int i = sayi; i >=1; i--) {
            carpim*=i;
        }
        for (int i = sayi; i >=1 ; i--) {
            if (sayi==i){
                System.out.print(sayi+"!=");
            } else if (i==2){
                System.out.print(i+"*");
            }else {
                System.out.print(i+"=");
            }
        }
        System.out.print(carpim);*/

       // Input : 6

       // Output: 6!=65432*1=72
        int sayi=6;
        int carpım=1;

        for (int i =sayi; i>=1; i--) {

            carpım*=i;
        }

        System.out.println(sayi+"!="+sayi+(sayi-1)+(sayi-2)+(sayi-3)+(sayi-4)+"*"+(sayi-5)+"="+carpım);










       






    }
}
