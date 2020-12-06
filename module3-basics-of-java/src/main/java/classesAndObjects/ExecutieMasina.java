package classesAndObjects;

public class ExecutieMasina {

    public static void main(String[] args) {
        //sintaxa declarare obiect
        //clasa nume_obiect = new clasa()
        Masina masinaLuiDenis = new Masina();

        //un obiect este instanta unei clase
        //masinaLuiDenis (un obiect) este instanta clasei Masina
        masinaLuiDenis.afiseazaVitezaMaximaMasina();

        System.out.println("am pornit la drum");
        masinaLuiDenis.accelerareMasina();
        masinaLuiDenis.accelerareMasina();
        masinaLuiDenis.decelerareMasina();
        masinaLuiDenis.accelerareMasina();
        masinaLuiDenis.accelerareMasina();

        masinaLuiDenis.aiCalatorit100kmPrinAfaraOrasului();
        masinaLuiDenis.aiCalatorit100kmPrinAfaraOrasului();

        masinaLuiDenis.aiCalatorit100kmInOras();

        double combustibilRamas = masinaLuiDenis.returneazaCatCombustibilAMaiRamasInMasina();


        System.out.println("Mai ai " + combustibilRamas + " litri de motorina in rezervor!");

        if (combustibilRamas > 10) {
            System.out.println("Stai linistit, mai ai combustibil pentru o calatorie!");
        } else {
            System.out.println("Du-te si alimenteaza rapid!");
        }
    }
}
