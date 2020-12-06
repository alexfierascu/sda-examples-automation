package constructorsExample;

//declaram o clasa Copil
public class Copil {

    //declaram atributele pe care clasa Copil le are, dar de tip private
    private String nume;
    private String prenume;
    private double inaltime;
    private int varsta;
    private double greutate;

    //method overloading
    //construim mai multe tipuri de constructori
    //cand am mai multe metode/ functii cu acelasi nume, dar
    //cu nr de parametrii diferiti SAU ordinea parametrilor este diferita
    //SAU tipul de data a parametrilor este diferit
    public Copil() {
    }

    public Copil(String numeleCopilului, String prenumeleCopilului, double inaltime, int varsta) {
        this.nume = numeleCopilului;
        this.prenume = prenumeleCopilului;
        this.inaltime = inaltime;
        this.varsta = varsta;
    }

    public Copil(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Copil(String nume, String prenume, double inaltime) {
        this.nume = nume;
        this.prenume = prenume;
        this.inaltime = inaltime;
    }

    public Copil(double greutate, String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        this.greutate = greutate;
    }

    public Copil(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }


}
