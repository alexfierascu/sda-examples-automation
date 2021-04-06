package oop.inheritance;

import java.util.Scanner;

//clasa human este clasa de baza
//toate celelalte clase din pachetul nostru vor mosteni clasa Human si vor mosteni metodele si atributele declarate publice din clasa human
//eg: clasa Lawyer si clasa Programmer vor mostenii metodele de get si set din clasa human, atributul public fericit, dar si metoda publica esteFericit()
public class Human {

  private String firstName;
  private String lastName;
  private String city;
  private String country;
  private String occupation;
  private int age;
  public boolean fericit;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Human(String firstName, String lastName, String city, String country,
      String occupation, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.city = city;
    this.country = country;
    this.occupation = occupation;
    this.age = age;
  }

  public void showInformationAboutHuman() {
    System.out.println("\nThe human called " + firstName + " " + lastName +
        " lives in " + city + ", " + country + ".\nHe is " + age + " old and he is a "
        + occupation + "!");
  }

  public void esteFericit() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Este " + firstName + " fericit?\n"
        + "Raspunsuri acceptate: true sau false");
    boolean raspuns = scanner.nextBoolean();
    this.fericit = raspuns;
    if (raspuns) {
      System.out.println(firstName + " este \u263A !");
    } else {
      System.out.println(firstName + " este cam \u2639!");

    }
  }
}
