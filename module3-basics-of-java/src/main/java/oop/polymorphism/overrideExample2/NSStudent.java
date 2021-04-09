package oop.polymorphism.overrideExample2;

public class NSStudent extends Student {

  NSStudent() {

  }

  NSStudent(int numarCreditePrimit) {
    super(numarCreditePrimit);
  }

  @Override
  public boolean pass() {
    if (getNumarCredite() == 4) {
      return true;
    } else {
      return false;
    }
  }
}
