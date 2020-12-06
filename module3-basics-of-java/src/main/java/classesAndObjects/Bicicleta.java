package classesAndObjects;

public class Bicicleta {

    private String nume;
    private String culoare;
    private double dimensiuneRoti;
    private int vitezaBicicleta;

    public void setVitezaBicicleta(int vitezaBicicleta) {
        this.vitezaBicicleta = vitezaBicicleta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCuloare(String culoareBicicleta) {
        this.culoare = culoareBicicleta;
    }

    public void setDimensiuneRoti(double dimensiuneRoti) {
        this.dimensiuneRoti = dimensiuneRoti;
    }

    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getDimensiuneRoti() {
        return dimensiuneRoti;
    }

    public int getVitezaBicicleta() {
        return vitezaBicicleta;
    }

    void afisareInformatiiBicicleta() {
        System.out.println("Bicicleta mea " + this.nume + " are culoarea " +
                this.culoare + " si are dimensiunea la roti de " + this.dimensiuneRoti);
    }

    void accelerareBicicleta() {
        this.vitezaBicicleta += 10;
    }

    void decelerareBicicleta() {
        this.vitezaBicicleta -= 10;
    }

    int returneazaVitezaBicicleta() {
        return this.vitezaBicicleta;
    }

    //default = public, dar la nivel de pachet
    //public = vizibil la nivel de intregul proiect

}
