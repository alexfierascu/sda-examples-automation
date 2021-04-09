package oop.polymorphism.overrideExample2;

import java.util.ArrayList;
import java.util.List;

public class Execution {

  public static void main(String[] args) {
    List<Student> listaMeaDeStudenti = new ArrayList<>();
    Student sef = new Student();
    sef.setNumarCredite(5);

    Student sef2 = new Student();
    sef2.setNumarCredite(4);
    Student eminent = new Student(6);

    NSStudent cristi = new NSStudent();
    cristi.setNumarCredite(4);
    NSStudent mugur = new NSStudent(2);
    NSStudent arthur = new NSStudent(2);
    listaMeaDeStudenti.add(sef);
    listaMeaDeStudenti.add(sef2);
    listaMeaDeStudenti.add(eminent);
    listaMeaDeStudenti.add(cristi);
    listaMeaDeStudenti.add(mugur);
    listaMeaDeStudenti.add(arthur);

    //for-each - un for mai jmecher
    for (Student studentulSinguratic : listaMeaDeStudenti) {
      studentulSinguratic.aTrecutStudentulSauAPicat();
    }
  }


}
