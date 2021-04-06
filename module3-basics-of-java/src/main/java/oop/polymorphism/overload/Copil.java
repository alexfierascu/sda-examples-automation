package oop.polymorphism.overload;

import java.util.Scanner;


//metoda whatKindOfClothesTheChildWillWear este implementata de 2 ori, odata cu param, odata fara
//de fiecare data, ea are o alta implementare, dar are si o alta semnatura (nr de params), dar numele ramane acelasi
//cand facem acest lucru, vbim despre supraincarcare
public class Copil {

  private String childSex;

  public String getChildSex() {
    return childSex;
  }

  public void setChildSex(String childSex) {
    this.childSex = childSex;
  }

  public void whatKindOfClothesTheChildWillWear() {
    System.out.println("Va rog sa spuneti daca copilul este baietel sau fetita");
    Scanner scanner = new Scanner(System.in);
    String raspuns = scanner.nextLine();
    if (raspuns.equals("baiat") || raspuns.equals("baietel")) {
      System.out.println("Baietelul se va imbraca in albastru!");
    } else {
      System.out.println("Fetita se va imbraca in rosu!");
    }
  }

  public void whatKindOfClothesTheChildWillWear(String childSex) {
    if (childSex.equals("fata") || childSex.equals("fetita")) {
      System.out.println("Fetita se va imbraca in roz!");
    } else {
      System.out.println("Baietelul se va imbraca in verde inchis!");
    }

  }

}
