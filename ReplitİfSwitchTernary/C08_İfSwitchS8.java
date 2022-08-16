package ReplitİfSwitchTernary;

public class C08_İfSwitchS8 {
    public static void main(String[] args) {
        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor

        String isim1="mehmet";
        String isim2="ahmet";
        String degisenİsim1=isim1.substring(0,3)+isim2+isim1.substring(3);

        if(isim1.length() %2==0){
            System.out.println(degisenİsim1);

        }else{
            System.out.println("isim1,isim2 ye eklenemiyor");
        }
    }
}
