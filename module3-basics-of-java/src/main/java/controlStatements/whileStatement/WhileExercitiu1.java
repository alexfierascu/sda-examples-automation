package controlStatements.whileStatement;

import java.util.Scanner;

public class WhileExercitiu1 {

    public static void main(String[] args) {
        System.out.println("Program care imi calculeaeza cate cadouri" +
                " pot sa cumpar de craciun!");

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int pretCadou;
        int sumaMaximaDisponibila;
        System.out.println("Care este pretul unui cadou?");
        pretCadou = scanner.nextInt();

        System.out.println("Care este suma maxima disponibila in acest an minunat?");
        sumaMaximaDisponibila = scanner1.nextInt();

        int numarulDeCadouriPecareIlPotCumpara = 0;

        while (sumaMaximaDisponibila >= pretCadou) {
            numarulDeCadouriPecareIlPotCumpara++;
            sumaMaximaDisponibila = sumaMaximaDisponibila - pretCadou;
        }
        System.out.println("Anul acesta pot cumpara " +
                numarulDeCadouriPecareIlPotCumpara + " cadouri");
        
        System.out.println("Ti-au mai ramas " + sumaMaximaDisponibila + " lei, bo$$! \n" +
                " Ia-ti si tu ceva dragut!");
    }
}
