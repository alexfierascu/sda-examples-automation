package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkingWithExceptionsEx1 {
    public static void main(String[] args) {
        try {
            File myFile = new File("src/exceptions/fisier.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("O eroare a aparut!" +
                    "Fie fisierul nu exista, fie calea catre acesta este gresita!");
            e.printStackTrace();
        }
    }
}
