package controlStatements.switchStatement;

/*.using switch. Have int x =10; y=15; Write a flowchart that will do
     the following: If the difference between x and y is 3 print out the value of y; If the difference between x and y
     is 9 print out the value of x;
     If the difference between x and y is -5 print out the value of x+y; else print out "sorry...try again"*/

public class SwitchExercitiu2 {

    public static void main(String[] args) {

        int x, y, rezultat;
        x = 10;
        y = 15;
        rezultat = x - y;
        switch (rezultat) {
            case 3:
                System.out.println(y);
                break;
            case 9:
                System.out.println(x);
                break;
            case -5:
                System.out.println(x + y);
                break;
            default:
                System.out.println("sorry...try again");
                break;
        }
    }
}
