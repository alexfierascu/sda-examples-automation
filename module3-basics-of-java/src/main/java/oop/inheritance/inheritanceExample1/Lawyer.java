package oop.inheritance.inheritanceExample1;

public class Lawyer extends Human {

  private String specialisation;

  public String getSpecialisation() {
    return specialisation;
  }

  public void setSpecialisation(String specialisation) {
    this.specialisation = specialisation;
  }

  public Lawyer(String firstName, String lastName, String city, String country,
      String occupation, int age, String specialisation) {
    super(firstName, lastName, city, country, occupation, age);
    this.specialisation = specialisation;
  }


  public void showInformationAboutLawyer() {
    System.out.println("\nThe lawyer called " + getFirstName() + " " + getLastName() +
        " lives in " + getCity() + ", " + getCountry() + ".\nHe is " + getAge()
        + " old and he is a "
        +  getOccupation() + " de " + specialisation + "!");
  }
}
