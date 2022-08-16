package day05_for;

import javax.swing.*;

public class C02_VirgüllüYazdır {
    public static void main(String[] args) {
        //100 den başlayarak 50 ye kadar virgülle aynı satırda yazdır.





            for (int i = 100; i>= 50; i--) {
                if(i>50) {
                    System.out.print(i+" ,");
                }else {
                    System.out.print(i+" .");
                }



            }
    }
}
