package day05_for;

public class C04_100ekadarTopla {
    public static void main(String[] args) {

        //1 den 100 e kadar sayıları topla

        int topla=0;
        for(int i=1; i<100; i++) {
            topla+=i;
            System.out.println(topla);
        }
    }
}
