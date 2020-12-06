package constructorsExample;

public class ExempluCopil {
    public static void main(String[] args) {
        //construim un obiect de tip copil folosind constructorul implicit
        Copil x = new Copil();

        //construim mai multe obiecte de tip copil folosind constructorii definiti de noi
        Copil x2 = new Copil("Popescu", "Stefan", 85.6, 12);
        Copil x3 = new Copil("Pantel", "Cristian", 15);
        Copil x4 = new Copil("Pantel", "Cristian", 15.6);
        Copil x5 = new Copil(15.6, "Pantel", "Cristian");
    }
}
