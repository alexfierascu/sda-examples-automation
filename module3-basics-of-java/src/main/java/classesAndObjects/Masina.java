package classesAndObjects;

public class Masina {

    String marcaMasina;
    String culoare;
    double pretAchizitie;
    int capacitateCilindrica;
    int nrLocuriPasageri;
    int greutateMasina;
    int anFabricatie;
    int vitezaInitiala = 0;
    int vitezaMaxima = 250;
    double consumCombustibilInAfaraOrasului = 3.4;
    double consumCombustibilInInteriorulOrasului = 4.3;
    double capacitateRezervorCombustibil = 54.7;

    public void afiseazaVitezaMaximaMasina() {
        System.out.println("Viteza maxima a masinii este " + vitezaMaxima
                + " km/h");
    }

    public void accelerareMasina() {
        System.out.println("Tocmai ai apasat pe acceleratie! ");
        vitezaInitiala = vitezaInitiala + 10;
        capacitateRezervorCombustibil--;
        System.out.println("Viteza actuala este de " + vitezaInitiala +
                " km/h");
    }

    public void decelerareMasina() {
        System.out.println("Tocmai ai apasat pe frana! ");
        vitezaInitiala = vitezaInitiala - 10;
        System.out.println("Viteza actuala este de " + vitezaInitiala +
                " km/h");
    }

    public void aiCalatorit100kmPrinAfaraOrasului() {
        // capacitateRezervorCombustibil = capacitateRezervorCombustibil - consumCombustibilInAfaraOrasului;
        capacitateRezervorCombustibil -= consumCombustibilInAfaraOrasului;
    }

    public void aiCalatorit100kmInOras() {
        capacitateRezervorCombustibil = capacitateRezervorCombustibil - consumCombustibilInInteriorulOrasului;
    }

    public double returneazaCatCombustibilAMaiRamasInMasina() {
        return capacitateRezervorCombustibil;
    }

}
