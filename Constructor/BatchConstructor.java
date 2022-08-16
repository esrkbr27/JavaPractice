package Constructor;

public class BatchConstructor {
    public static void main(String[] args) {
        //bu classta obje cerate edilecek
        //Batch classından obje uretiyorum.

        Batch batch=new Batch ();
        System.out.println(batch);
        /*
        batch objesını sadece yazdırırsam Batch classındakı
        default constructorın referans degerini yazdırır.
        Batch classında bir deger atanmadıgı için.
         */
        System.out.println(batch.x); //3
        //batch objesı ile x degerini burda yazdırdım
        System.out.println(batch.str1); //Constructor öğreniyorum!..

        batch.batch();







    }

}
