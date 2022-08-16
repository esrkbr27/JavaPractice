package Restaurant;

public class Mutfak {
    public String yemekler="Adana Kebap,urfa ciger,kusbası,kusleme";
    public String arasıcak="Yayla corba,mercimek corba,dugun corba";
    public String tatlılar="baklava, sütlaç,gullac,kazandibi,kunefe";
    public String içecekler="ayran,salgam,kola";

    public Mutfak() {
    }

    public Mutfak(String adana_kebap, String yayla_corba, String kunefe, String salgam) {
this.yemekler="adana_kebap";
this.arasıcak="yayla corba";
this.tatlılar="kunefe";
this.içecekler="salgam";
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "yemekler='" + yemekler + '\'' +
                ",\n arasıcak='" + arasıcak + '\'' +
                ",\n tatlılar='" + tatlılar + '\'' +
                ", \niçecekler='" + içecekler + '\'' +
                '}';
    }
}
