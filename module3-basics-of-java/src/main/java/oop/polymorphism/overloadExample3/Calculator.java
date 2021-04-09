package oop.polymorphism.overloadExample3;

public class Calculator {

  public int suma(int a, int b) {
    return a + b;
  }

  public int suma(int a, int b, int c) {
    return a + b + c;
  }

  public int suma(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public int suma(int a, int b, int c, int d, int e) {
    return a + b + c + d + e;
  }
}
