package Projeler.okulproje;

public class OGretmen extends Kisi{


        private String bolum;
        private int sicilNo;

        public OGretmen(String adSoyad, String kimlikNo, int yas, String bolum, int sicilNo) {
            super(adSoyad, kimlikNo, yas);
            this.bolum = bolum;
            this.sicilNo = sicilNo;
        }

        public OGretmen(){

        }

        @Override
        public String toString() {
            return "OGretmen{" +
                    "bolum='" + bolum + '\'' +
                    ", sicilNo=" + sicilNo +
                    '}'+super.toString();//parenttaki bilgileri de almak için super. ile cagırdık
        }

        public String getBolum() {
            return bolum;
        }

        public int getSicilNo() {
            return sicilNo;
        }

        public void setBolum(String bolum) {
            this.bolum = bolum;
        }

        public void setSicilNo(int sicilNo) {
            this.sicilNo = sicilNo;
        }
    }

