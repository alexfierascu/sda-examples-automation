package october24.arraysInJava;

public class BidimenisonalArray {
    public static void main(String[] args) {

        //ne declaram un vector bidimensional (cu 2 dimensiuni, adica o matrice)
        //putem deduce asta din modul de cum l-am construit: new String[2][]
        String[][] produseMagazin = new String[2][];

        //declaram valorile pentru cele 2 randuri din matrice (sau, altfel spus, pt fiecare vector din matrice)
        produseMagazin[0] = new String[]{"Mucenici", "Gogoși", "Papanași"};
        produseMagazin[1] = new String[]{"Mattentaart", "Pain au chocolat", "Baguette", "Gaufres", "Crêpe", "Appelflap", "Stofé"};

        //parcurgem matricea si afisam fiecare produs din magazin
        for (int i = 0; i < produseMagazin.length; i++) {
            for (int j = 0; j < produseMagazin[i].length; j++) {
                System.out.print(produseMagazin[i][j] + " || ");
            }
            System.out.println();
        }
        
        //https://www.youtube.com/watch?v=L3-q2GxAqZA&ab_channel=AlexLee
        //https://www.youtube.com/watch?v=uaUddnxeK5M&ab_channel=CalebCurry
        //https://www.youtube.com/watch?v=Gbz3Ao2xq_4&ab_channel=NesoAcademy
        //
    }
}
