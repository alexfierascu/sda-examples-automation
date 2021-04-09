package oop.encapsulation;

public class Execution {

  public static void main(String[] args) {
    Om x1 = new Om();
    x1.setNumeOm("Popescu");
    x1.setPrenumeOm("Cristi");
    x1.setVarstaOm(41);
    System.out.println(x1.getSalariuGeneral());

    Om x2 = new Om();
    x2.setNumeOm("Valorosu'");
    x2.setPrenumeOm("Albert");
    x2.setVarstaOm(23);
    x2.setSalariuGeneral(8000);
    System.out.println(x2.getSalariuGeneral());
  }

}
