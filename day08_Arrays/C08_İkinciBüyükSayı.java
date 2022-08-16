package day08_Arrays;

public class C08_İkinciBüyükSayı {
    public static void main(String[] args) {
        int[] dizi={2,1,5,3,6};
        int enbuyuk = dizi[0];
        int ikinci = dizi[0];

        for(int i=1;i<dizi.length;i++){
            if(dizi[i]>enbuyuk)
            {
                ikinci=enbuyuk;
                enbuyuk=dizi[i];
            }
            else if(dizi[i]>ikinci){
                ikinci = dizi[i];
            }
        }
        System.out.println("İkinci büyük sayı: " +ikinci);
    }
}
