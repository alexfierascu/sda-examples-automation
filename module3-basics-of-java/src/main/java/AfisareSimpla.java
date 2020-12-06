public class AfisareSimpla {

    public static void main(String[] args) {
        int numarMere, b, suma;
        numarMere = 5;
        b = 7;
        char caracterTab = '\t';
        suma = numarMere + b;
        System.out.println(numarMere + b);
        System.out.println("suma numerelor este " + suma);
        System.out.println("suma numerelor este " + caracterTab + suma);

        String propozitie = "Ana are mere";
        String s1 = "Ana";
        String s2 = "are";
        String s3 = "mere";

        System.out.println(propozitie);

        //concatenare stringuri
        System.out.println(s1 + s2 + s3);
        System.out.println(s1 + " " + s2 + " " + s3 + "!");

        //concatenare string si numeric
        System.out.println(s1 + " " + s2 + " " + numarMere + " " + s3 + "!");


        //numeric + numeric = numeric
        //numeric + string = string
        //string + string  = string
    }
}
