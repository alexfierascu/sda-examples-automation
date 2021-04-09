package oop.encapsulation;

public class Om {

  //mi-am declarat proprietatile de mai jos de tip private
  private String numeOm;
  private String prenumeOm;
  private int varstaOm;

  private int salariuGeneral = 1000;

  //mi-am construit metode publice pentru a seta si prelua datele despre obiectele mele
  public String getNumeOm() {
    return numeOm;
  }

  public void setNumeOm(String numeOm) {
    this.numeOm = numeOm;
  }

  public String getPrenumeOm() {
    return prenumeOm;
  }

  public void setPrenumeOm(String prenumeOm) {
    this.prenumeOm = prenumeOm;
  }

  public int getVarstaOm() {
    return varstaOm;
  }

  public void setVarstaOm(int varstaOm) {
    this.varstaOm = varstaOm;
  }

  public int getSalariuGeneral() {
    return salariuGeneral;
  }

  public void setSalariuGeneral(int salariuGeneral) {
    this.salariuGeneral = salariuGeneral;
  }
}
