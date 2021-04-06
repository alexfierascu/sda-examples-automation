package oop.polymorphism.override;

public class Execution {

  public static void main(String[] args) {
    Human kindHuman = new Human();
    kindHuman.whatDoesItSoundsLike();

    Alien ET = new Alien();
    ET.whatDoesItSoundsLike();
  }


}
