package day03_strıngManıpulatıon;

public class C01_İndexOfFrom {
    public static void main(String[] args) {
        //kullanıcıdan bır harf ve cumle ısteyın harfın olup olmadıgını kontrol edın

        String cumle="Bu havada gıdılmez, aslında hıc gıdılmez.";
        int ilka=cumle.indexOf("a");
        int ikincia=cumle.indexOf("a",+ ilka+1);
        int ucuncua=cumle.indexOf("a",+ikincia+1);
        System.out.println(cumle.indexOf("a"));

        if(ilka==-1){
            System.out.println("verilen cumlede a yok");
        }else{
            System.out.println("verilen cumlede a su ındexde :"+ ilka);
        }if(ikincia==-1){
            System.out.println("verilen cumlede 2. a yok");
        }else{
            System.out.println("verilen cumlede 2.a :"+ ikincia);
        }if(ucuncua==-1){
            System.out.println("verilen cumlede 3.a yok");
        }else{
            System.out.println("verilen cumlede 3.a :"+ ucuncua);
        }
    }
}
