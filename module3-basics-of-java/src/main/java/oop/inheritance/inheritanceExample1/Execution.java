package oop.inheritance.inheritanceExample1;

public class Execution {

  public static void main(String[] args) {
    Human anotherBrickInTheWall = new Human("Cristi", "Popescu",
        "Ploiesti", "Romania", "nea", 36);
    anotherBrickInTheWall.showInformationAboutHuman();
    anotherBrickInTheWall.esteFericit();

    Lawyer incoruptibilul = new Lawyer("Stefan", "Hotuleac",
        "Bucuresti", "Romania", "avocat", 25, "litigii civile");
    incoruptibilul.showInformationAboutLawyer();
    incoruptibilul.esteFericit();

    Programmer corporatristul = new Programmer("Robert", "Amariei",
        "Cluj Napoca", "Romania", "programator", 23, "JAVA", 3);
    corporatristul.showInformationAboutProgrammer();
    corporatristul.esteFericit();
  }

}
