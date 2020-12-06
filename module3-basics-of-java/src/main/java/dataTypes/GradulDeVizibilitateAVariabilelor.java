package dataTypes;

public class GradulDeVizibilitateAVariabilelor {

    //variabila globala - explicatie
    //variabila locala - explicatie

    //variabila globala
   static int x=99;

   //functia main
    public static void main(String[] args) {
        //variabila locala
        int a=5;int b=9;
        System.out.println("valoarea lui a este " + a);
        System.out.println("valoarea lui b este " + b);

        //afisez x -variabila globala in clasa dataTypes.GradulDeVizibilitateAVariabilelor - posibil
        System.out.println(x);
    }

    //functia cevaExemplu
   static public void cevaExemplu() {

        //variabile locala
        int a1=1;int b1=2;

        //afisez a -variabila locala in fct main - imposibil
        //System.out.println(a);

       //afisez a1, b2 -variabila locala in fct cevaExemplu - posibil
        System.out.println(a1);
        System.out.println(b1);

       //afisez x -variabila globala in clasa dataTypes.GradulDeVizibilitateAVariabilelor - posibil
        System.out.println(x);
    }


}
