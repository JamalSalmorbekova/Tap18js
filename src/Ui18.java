public class Ui18 {
    private int vesUi;
    private int jashyUi;
    private char genderUi;
    private String atyUi;

    public Ui18() {
    }

    public Ui18(int vesUi, int jashyUi, char genderUi, String atyUi) {
        this.vesUi = vesUi;
        this.jashyUi = jashyUi;
        this.genderUi = genderUi;
        this.atyUi = atyUi;
    }

    public int getVesUi() {
        return vesUi;
    }

    public void setVesUi(int vesUi) {
        this.vesUi = vesUi;
    }

    public int getJashyUi() {
        return jashyUi;
    }

    public void setJashyUi(int jashyUi) {
        this.jashyUi = jashyUi;
    }

    public char getGenderUi() {
        return genderUi;
    }

    public void setGenderUi(char genderUi) {
        this.genderUi = genderUi;
    }

    public String getAtyUi() {
        return atyUi;
    }

    public void setAtyUi(String atyUi) {
        this.atyUi = atyUi;
    }

    @Override
    public String toString() {
        return " " +
                "Салмагы - " + vesUi +
                ", Жашы - " + jashyUi +
                ", гени - " + genderUi +
                ", Уйдун аты - " + atyUi + '\'' +
                '}';
    }
}


