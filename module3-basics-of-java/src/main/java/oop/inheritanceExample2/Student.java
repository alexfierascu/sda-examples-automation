package oop.inheritanceExample2;

public class Student {

  private String nume;
  private String prenume;
  private int aniStudii;
  private String specializare;

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public String getPrenume() {
    return prenume;
  }

  public void setPrenume(String prenume) {
    this.prenume = prenume;
  }

  public int getAniStudii() {
    return aniStudii;
  }

  public void setAniStudii(int aniStudii) {
    this.aniStudii = aniStudii;
  }

  public String getSpecializare() {
    return specializare;
  }

  public void setSpecializare(String specializare) {
    this.specializare = specializare;
  }

  public Student(String nume, String prenume, int aniStudii, String specializare) {
    this.nume = nume;
    this.prenume = prenume;
    this.aniStudii = aniStudii;
    this.specializare = specializare;
  }

  public void afisareInformatiiStudent() {
    System.out.println(
        "Studentul " + prenume + " " + nume + " este inscris la specializarea " + specializare
            + " unde va studia timp de " + aniStudii + " ani!\n"
            + "Mult succes, " + prenume);
  }
}
