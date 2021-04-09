package oop.classes;

public class Execution {

  public static void main(String[] args) {
    //sintaxa pe care o folosim cand vrem sa construim un obiect nou
    //sintaxa pe care o folosim cand vrem sa construim o instanta a unui clase
    //clasa numeleObiectuluiPeCareIlConstruim = new constructor al clasei
    //constructor este o functie speciala!!!
    //constructorul clasei are acelasi nume precum clasa

    //acest constructor are 0 parametrii - constructor default/ implict
    King carolIntai = new King();
    carolIntai.setFirstName("Hohenzollern");
    carolIntai.setLastName("Carol I");
    carolIntai.setAge(58);
    carolIntai.setFortune(9999999);
    carolIntai.setRoyalDescentName("Hohenzollern");
    carolIntai.setSpecialName("leul");

    //acest constructor are 2 params
    King Hohenzollern = new King("Hohenzollern", "Carol al 2lea");
    Hohenzollern.getLastName(); // va returna Hohenzollern pentru ca am mentionat numele parametrului in constructor
    Hohenzollern.getAge(); // va returna 50 (default din clasa)

    //acest constructor are 3 params
    King Eduard = new King("Smarandescu", "Eduard-Mihai", 999999999.99);

    //acest constructor are 3 params dar in alta ordine fata de cel de mai sus
    King Bobita = new King("Cristescu", 89898989890.58, "Bobita");

    //acest constructor are 3 params dar in alta ordine fata de cel de mai sus
    King Bobita99 = new King(89898989890.58, "Leordescu", "Bobita");

    //acest constructor are 6 params
    King kingosu = new King("Iliescu", "Ion", "sefu", "vampiru", 180, 999999999);
  }

}
