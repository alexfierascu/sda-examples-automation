package oop.classes;

public class King {

  private String lastName;
  private String firstName;
  private String royalDescentName;
  private String specialName;
  private int age = 50;
  private double fortune = 10000000000.99;


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getRoyalDescentName() {
    return royalDescentName;
  }

  public void setRoyalDescentName(String royalDescentName) {
    this.royalDescentName = royalDescentName;
  }

  public String getSpecialName() {
    return specialName;
  }

  public void setSpecialName(String specialName) {
    this.specialName = specialName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getFortune() {
    return fortune;
  }

  public void setFortune(double fortune) {
    this.fortune = fortune;
  }

  //constructor implicit - fara niciun parametru
  King() {
  }

  //constructor explicit cu 2 parametrii de tip String
  King(String numeleDeFamilieARegelui, String prenumeleRegelui) {
    this.lastName = numeleDeFamilieARegelui;
    this.firstName = prenumeleRegelui;
  }


  //constructor explicit cu 3 parametrii: 2 de tip String, 1 de tip double
  King(String numeleDeFamilieARegelui, String prenumeleRegelui, double avereaRegelui) {
    this.lastName = numeleDeFamilieARegelui;
    this.firstName = prenumeleRegelui;
    this.fortune = avereaRegelui;
  }

  //constructor explicit cu 3 parametrii: 2 de tip String, 1 de tip double
  King(String numeleDeFamilieARegelui, double avereaRegelui, String prenumeleRegelui) {
    this.lastName = numeleDeFamilieARegelui;
    this.firstName = prenumeleRegelui;
    this.fortune = avereaRegelui;
  }


  //constructor explicit cu 3 parametrii: 2 de tip String, 1 de tip double
  King(double avereaRegelui, String numeleDeFamilieARegelui, String prenumeleRegelui) {
    this.lastName = numeleDeFamilieARegelui;
    this.firstName = prenumeleRegelui;
    this.fortune = avereaRegelui;
  }

 //constructor explicit cu 6 parametrii
  King(String numeleRegelui,String prenumeleRegelui, String cevaceva, String numeSpecial,
  int varstaRege,double avereRege) {
    this.lastName=numeleRegelui;
    this.firstName=prenumeleRegelui;
    this.royalDescentName=cevaceva;
    this.specialName=numeSpecial;
    this.age=varstaRege;
    this.fortune=avereRege;
  }

  //mai sus am facut overload de constructor pentru ca am construit mai multi constructori
  //care au acelasi nume de metoda(King) dar cu nr diferit de parametrii si implementare diferita

}
