package oop.inheritance;

public class Programmer extends Human{

  private String specialisation;
  private int yearsOfExperience;

  public String getSpecialisation() {
    return specialisation;
  }

  public void setSpecialisation(String specialisation) {
    this.specialisation = specialisation;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public Programmer(String firstName, String lastName, String city, String country,
      String occupation, int age, String specialisation, int yearsOfXP) {
    super(firstName, lastName, city, country, occupation, age);
    this.specialisation=specialisation;
    this.yearsOfExperience=yearsOfXP;
  }

  public void showInformationAboutProgrammer() {
    System.out.println("\nThe programmer called " + getFirstName() + " " + getLastName() +
        " lives in " + getCity() + "," + getCountry() + ".\nHe is " + getAge()
        + " old and he is a "
        + specialisation + " " + getOccupation() + ".\nHe has more than " + yearsOfExperience + " years of experience!");
  }
}
