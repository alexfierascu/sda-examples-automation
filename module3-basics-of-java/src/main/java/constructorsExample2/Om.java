package constructorsExample2;

public class Om {

    private String nume;
    private String prenume;

    //constructor implicit
    public Om() {
    }

    // constructor explicit 1
    public Om(String numeOm) {
        this.nume = numeOm;
    }

    // constructor explicit 2
    public Om(String numeOm, String prenumeOm) {
        this.nume = numeOm;
        this.prenume = prenumeOm;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
