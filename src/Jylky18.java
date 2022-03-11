public class Jylky18 {
    private int vesJylky;
    private int jashyJylky;
    private char genderJylky;
    private String tycyJylky;
    private String atyJylky;

    public Jylky18() {
    }

    public Jylky18(int vesJylky, int jashyJylky, char genderJylky,
                   String tycyJylky ,String atyJylky){

        this.vesJylky = vesJylky;
        this.jashyJylky = jashyJylky;
        this.genderJylky = genderJylky;
        this.tycyJylky = tycyJylky;
        this.atyJylky = atyJylky;
    }

    public int getVesJylky() {
        return vesJylky;
    }

    public void setVesJylky(int vesJylky) {
        this.vesJylky = vesJylky;
    }

    public int getJashyJylky() {
        return jashyJylky;
    }

    public void setJashyJylky(int jashyJylky) {
        this.jashyJylky = jashyJylky;
    }

    public char getGenderJylky() {
        return genderJylky;
    }
    public void setGenderJylky(char genderJylky) {
                this.genderJylky = genderJylky;
    }
    public String gettycyJylky() {
        return tycyJylky;
    }

    public void setTycyJylky(String tycyJylky) {
        this.tycyJylky = tycyJylky;
    }
    public String getAtyJylky() {
        return atyJylky;
    }

    public void setAtyJylky(String atyJylky) {
        this.atyJylky = atyJylky;
    }

    @Override
    public String toString() {
        return "" +
                "Салмагы - " + vesJylky +
                ", Жашы -  " + jashyJylky +
                ", гени -" + genderJylky +
                ", Жылкынын тусу-"+tycyJylky +
                ", Жылкынын аты - '" + atyJylky + '\'' +
                '}';
    }
}