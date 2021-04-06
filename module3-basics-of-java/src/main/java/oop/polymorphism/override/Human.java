package oop.polymorphism.override;

//clasa principala(parinte) este Human, iar clasa Alien mosteneste clasa Human
//pt ca vorbim iar de mostenire, e clar ca clasa Alien va mostenii metoda whatDoesItSoundsLike(), dar!!!
//pt clasa Alien vrem ca metoda whatDoesItSoundsLike() sa aiba o alta implementare, dar sa-si pastreze numele
//in acest moment vorbim de suprascriere
public class Human {

  public void whatDoesItSoundsLike() {
    System.out.println("The human sounds familiar!\n");
  }

}
