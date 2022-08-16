package Projeler.okulproje;


    public class Ogrenci extends Kisi {

        private String ogrenciNo;
        private String sinif;

        public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
            super(adSoyad, kimlikNo, yas);//parent classtakı constructorı aldık.
            this.ogrenciNo = ogrenciNo;
            this.sinif = sinif;
        }

        public Ogrenci(){

        }

        public String getOgrenciNo() {
            return ogrenciNo;
        }

        public String getSinif() {
            return sinif;
        }

        public void setOgrenciNo(String ogrenciNo) {
            this.ogrenciNo = ogrenciNo;
        }

        public void setSinif(String sinif) {
            this.sinif = sinif;
        }

        @Override
        public String toString() {
            return "Ogrenci{" +
                    "ogrenciNo='" + ogrenciNo + '\'' +
                    ", sinif='" + sinif + '\'' +
                    '}'+super.toString();
        }
    }


