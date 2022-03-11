public class Koi18 {
    private int vesKoi;
    private int jashKoi;
    private char genderKoi;

    private String atyKoi;

    public Koi18() {
    }

    public Koi18(int vesKoi, int jashKoi, char genderKoi, String atyKoi) {
        this.vesKoi = vesKoi;
        this.jashKoi = jashKoi;
        this.genderKoi = genderKoi;
        this.atyKoi = atyKoi;
    }

    public int getVesKoi() {
        return vesKoi;
    }

    public void setVesKoi(int vesKoi) {
        this.vesKoi = vesKoi;
    }

    public int getJashKoi() {
        return jashKoi;
    }

    public void setJashKoi(int jashKoi) {
        this.jashKoi = jashKoi;
    }

    public char getGenderKoi() {
        return genderKoi;
    }

    public void setGenderKoi(char genderKoi) {
        this.genderKoi = genderKoi;
    }

    public String getAtyKoi() {
        return atyKoi;
    }

    public void setAtyKoi(String atyKoi) {
        this.atyKoi = atyKoi;
    }

    @Override
    public String toString() {
        return "" +
                " Салмагы : " + vesKoi+
                "  Жашы  : " + jashKoi +
                " гени -" + genderKoi +
                ", Койдун аты : " + atyKoi ;
    }
}
