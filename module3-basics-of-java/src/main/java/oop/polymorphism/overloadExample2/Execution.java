package oop.polymorphism.overloadExample2;


//aici vom construi mai multe masini apeland constructorii cu 0 sau mai multi parametrii pe care i-am definit in clasa Car
//aici vorbim de overload pt constructori :) frumos, nu-i asa?
public class Execution {


  public static void main(String[] args) {
    Car primaMasina = new Car("Dacie", "berlina", "1310", 1992, 5, "blue");
    primaMasina.afisareInformatiiMasina();

    Car masinaDinPrimaSalariu = new Car("BMW", "berlina", "318i", 2005, 5);
    masinaDinPrimaSalariu.afisareInformatiiMasina();

    Car masinaDupaCeAuCrescutPretentiile = new Car("BMW", "SUV", "X4", 2017);
    masinaDupaCeAuCrescutPretentiile.afisareInformatiiMasina();

    Car masinaDeFiguri = new Car("Mercedes", "coupe", "CLS");
    masinaDeFiguri.afisareInformatiiMasina();

    Car masinaDeFamilie = new Car("Toyota", "suv");
    masinaDeFamilie.afisareInformatiiMasina();

    Car bijuteria = new Car("Ferrari");
    bijuteria.afisareInformatiiMasina();

    Car masinaDeBatranete = new Car();
    masinaDeBatranete.afisareInformatiiMasina();
  }
}
