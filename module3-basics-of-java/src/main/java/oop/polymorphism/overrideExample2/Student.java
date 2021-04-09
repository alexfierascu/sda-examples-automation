package oop.polymorphism.overrideExample2;

public class Student {

  private int numarCredite;

  Student() {
  }

  Student(int numarCreditePrimit) {
    this.numarCredite = numarCreditePrimit;
  }

  public int getNumarCredite() {
    return numarCredite;
  }

  public void setNumarCredite(int numarCredite) {
    this.numarCredite = numarCredite;
  }

  public boolean pass() {
    if (numarCredite == 6) {
      return true;
    } else {
      return false;
    }
  }

  public void aTrecutStudentulSauAPicat() {
    if (pass()) {
      System.out.println("Studentul a trecut");
    } else {
      System.out.println("Studentul nu a trecut");
    }
  }
}
