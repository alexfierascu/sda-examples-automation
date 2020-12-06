package classesAndObjects;

public class ExecutieBicicleta {
    public static void main(String[] args) {

        //construim un obiect de tip bicicleta, numit bicicletaMea
        Bicicleta bicicletaMea = new Bicicleta();

        //setam atributul de nume pt obiectul bicicletaMea
        bicicletaMea.setNume("cube");
        //setam atributul de culoare pt obiectul bicicletaMea
        bicicletaMea.setCuloare("galben");
        //setam atributul de diametru roti pt obiectul bicicletaMea
        bicicletaMea.setDimensiuneRoti(29.5);
        //apelam metoda prin care afisam informatiile despre obiectul bicicletaMea
        bicicletaMea.afisareInformatiiBicicleta();

        //construim un obiect de tip bicicleta, numit incaOBicicleta
        Bicicleta incaOBicicleta = new Bicicleta();
        //setam atributul de nume pt obiectul incaOBicicleta
        incaOBicicleta.setNume("kona");
        //setam atributul de culoare pt obiectul incaOBicicleta
        incaOBicicleta.setCuloare("rosie");
        //apelam metoda prin care afisam informatiile despre obiectul incaOBicicleta
        incaOBicicleta.afisareInformatiiBicicleta();

        //setam atributul de viteza pt obiectul incaOBicicleta
        incaOBicicleta.setVitezaBicicleta(58);

        //apelam metoda accelerareBicicleta() de 4 ori pe obiectul incaOBicicleta
        incaOBicicleta.accelerareBicicleta();
        incaOBicicleta.accelerareBicicleta();
        incaOBicicleta.accelerareBicicleta();
        incaOBicicleta.accelerareBicicleta();

        //apelam metoda decelerareBicicleta() de 4 ori pe obiectul incaOBicicleta
        incaOBicicleta.decelerareBicicleta();

        //apelam metoda returneazaVitezaBicicleta()
        //si salvam valoarea returnata de aceasta metoda in variabila vitezaBicicleta
        int vitezaBicicleta = incaOBicicleta.returneazaVitezaBicicleta();

        //afisam viteza bicicletei
        System.out.println("Bicicleta merge cu o viteza de "
                + vitezaBicicleta);

        //setam atributul de nume pt obiectul incaOBicicleta
        incaOBicicleta.setNume("velo");
        //afisam numele bicicletei dupa ce acesta a fost schimbat mai sus
        System.out.println(incaOBicicleta.getNume());
    }
}
