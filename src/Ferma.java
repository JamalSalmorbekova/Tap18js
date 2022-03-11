import java.util.Arrays;

public class Ferma {
      private String adressFerma;
      private String kojoun;
      private Ui18[] malui;
      private Jylky18[] maljylky;
      private Koi18[] malkoi;

      public Ferma() {
      }

      public Ferma(String adressFerma, String kojoun, Ui18[] malui, Jylky18[] maljylky, Koi18[] malkoi) {
            this.adressFerma = adressFerma;
            this.kojoun = kojoun;
            this.malui = malui;
            this.maljylky = maljylky;
            this.malkoi = malkoi;
      }

      public String getAdressFerma() {
            return adressFerma;
      }

      public void setAdressFerma(String adressFerma) {
            this.adressFerma = adressFerma;
      }

      public String getKojoun() {
            return kojoun;
      }

      public void setKojoun(String kojoun) {
            this.kojoun = kojoun;
      }

      public Ui18[] getMalui() {
            return malui;
      }

      public void setMalui(Ui18[] malui) {
            this.malui = malui;
      }

      public Jylky18[] getMaljylky() {
            return maljylky;
      }

      public void setMaljylky(Jylky18[] maljylky) {
            this.maljylky = maljylky;
      }

      public Koi18[] getMalkoi() {
            return malkoi;
      }

      public void setMalkoi(Koi18[] malkoi) {
            this.malkoi = malkoi;
      }

      @Override
      public String toString() {
            return " " +
                    "\n ферманын  аты - " + adressFerma + '\n' +      // '\'
                    " ферманын  ээси - " + kojoun + '\n' +
                    " Уйлары: " + Arrays.toString(malui)+";"+'\n' +
                    " Жылкылары :"+ Arrays.toString(maljylky)+";"+'\n' +
                    " Койлору :"  + Arrays.toString(malkoi) +";"+'\n';

      }
}

