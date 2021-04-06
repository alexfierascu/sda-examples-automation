package oop.polymorphism.overload;


//clasa Calculator are mai multe metode, dar toate au aceeasi nume, dar alt numar de parametrii, sau tipuri de parametrii
//conceptul asta se numeste supraincarcare
//bineinteles, fiecare metoda are o alta implementare. pentru o intelegere mai clara a conceptului, va rog sa va uitati in clasa copil din acest pachet
public class Calculator {

  public int sumaNumerelor(int a, int b) {
    return a + b;
  }

  public double sumaNumerelor(int a, double b, double c) {
    return a + b + c;
  }

  public int sumaNumerelor(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public double sumaNumerelor(double... numbers) {
    double sum = 0;
    for (double i : numbers) {
      sum += i;
    }
    return sum;
  }


}
