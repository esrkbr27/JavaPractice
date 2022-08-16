package Restaurant;

import java.awt.*;

public class Müşteri {

    public static void main(String[] args) {
        //menü  objesi create edelim.(MutfakClasıından,parametresiz)
        //sipariş objesı create edelim.(parametreli)

        Mutfak menu=new Mutfak();
        /*
        menude olan herseyı getirmek istiyorum.
        bunun için toString metodu kullanıyorum
        bu metod mutfak classındakı bütün instance variableları yazdırır.
         */


        System.out.println("menu.toString() = " + menu.toString());
       //menuden sipariş oluşturmak için obje craeteedecegım

        Mutfak siparisim=new Mutfak("Adana Kebap","yayla corba","kunefe","salgam");
/*
parametreli const. oluşturunca yukardaki parametresiz cons.ölür
bu cons kaybeymemek için classta parametresiz cons create ediyoruz.
 */
        System.out.println(siparisim);

    }
}
