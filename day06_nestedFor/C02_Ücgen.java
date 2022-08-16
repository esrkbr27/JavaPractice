package day06_nestedFor;

public class C02_Ücgen {
    public static void main(String[] args) {
       int  input=6;

               for (int i=1; i<=input; i++) {
                   for (int j=1; j<=i; j++) {
                       System.out.print("* ");
                   }
                   System.out.println("");
               }
    }
}
