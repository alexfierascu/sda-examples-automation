package oop.polymorphism.overloadExample2;


//clasa Car contine mai multe atribute
//am creat mai multi constructori pentru clasa noastra cu numar diferit de parametrii
//astfel putem construi mai multe instante ale clasei Car in moduri diferite
//a se vedea clasa Execution
public class Car {

  private String brand;
  private String type;
  private String model;
  private int yearLaunched;
  private int numberOfDoors;
  private String carColor;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYearLaunched() {
    return yearLaunched;
  }

  public void setYearLaunched(int yearLaunched) {
    this.yearLaunched = yearLaunched;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  public String getCarColor() {
    return carColor;
  }

  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  public Car(String brand, String type, String model, int yearLaunched, int numberOfDoors,
      String carColor) {
    this.brand = brand;
    this.type = type;
    this.model = model;
    this.yearLaunched = yearLaunched;
    this.numberOfDoors = numberOfDoors;
    this.carColor = carColor;
  }

  public Car(String brand, String type, String model, int yearLaunched, int numberOfDoors) {
    this.brand = brand;
    this.type = type;
    this.model = model;
    this.yearLaunched = yearLaunched;
    this.numberOfDoors = numberOfDoors;
  }

  public Car(String brand, String type, String model, int yearLaunched) {
    this.brand = brand;
    this.type = type;
    this.model = model;
    this.yearLaunched = yearLaunched;

  }

  public Car(String brand, String type, String model) {
    this.brand = brand;
    this.type = type;
    this.model = model;

  }

  public Car(String brand, String type) {
    this.brand = brand;
    this.type = type;
  }

  public Car(String brand) {
    this.brand = brand;
  }

  public Car() {
  }

  public void afisareInformatiiMasina() {
    System.out.println(
        "Masina " + brand + " este o masina buna. Ea este de tip " + type + " si este modelul "
            + model + " din anul " + yearLaunched +
            "\nMasina are " + numberOfDoors + " usi si are culoarea " + carColor + "\n");

  }

}
