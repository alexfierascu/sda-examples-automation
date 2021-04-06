package oop.polymorphism.overload;

public class Execution {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.sumaNumerelor(2, 3));
    System.out.println(calc.sumaNumerelor(9, 6, 3.3, 99, 24));

    System.out.println("=============================\n"
        + "=============================");
    Copil x = new Copil();
    Copil y = new Copil();
    x.setChildSex("baiat");
    x.whatKindOfClothesTheChildWillWear();

    y.whatKindOfClothesTheChildWillWear("fetita");
  }

}
