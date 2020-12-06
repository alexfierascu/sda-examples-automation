package october24.stringClass;

public class ExercitiuStringSimplu {
    public static void main(String[] args) {

        //sintaxa declarare variabila
        //tipul_de_data    nume_variabila;

        int primulNr;
        double suma;
        boolean estiCuminte;
        String numeFamilie;

        //declarare si initializare String folosind literals
        String adresaLivare = "Strada Trei Fantani, nr 128, bloc 99, etaj 19, ap 42";
        adresaLivare = "oras iasi";

        //declarare si initializare String folosind un constructor
        String adresaFacturare = new String("oras bucuresti");


        String dataNastereGeaman1 = "12.07.1990";
        String dataNastereGeaman2 = new String("12.07.1990");

        if (dataNastereGeaman1 == dataNastereGeaman2) {
            System.out.println("afiseaza ceva");
        }

        if (dataNastereGeaman1.equals(dataNastereGeaman2)) {
            System.out.println("Datele sunt identice");
        }

        adresaFacturare.length();
        adresaLivare.toUpperCase();
        adresaFacturare.toLowerCase();

        String mesaj = "acesta este un text este un text este";
        //a c e s t a   e
        //0 1 2 3 4 5 6 7
        System.out.println(mesaj.indexOf("x"));
        System.out.println(mesaj.replaceAll("este", "is"));
    }
}
