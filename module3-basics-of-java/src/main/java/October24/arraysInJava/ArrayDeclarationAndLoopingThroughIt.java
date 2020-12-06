package october24.arraysInJava;

public class ArrayDeclarationAndLoopingThroughIt {

    public static void main(String[] args) {
        //declararea unui vector
        int[] vector;
        int[] myLuckyNumbers = {12, 3, 5, 34, 7, 8};

        int[] someGuysLuckyNumbers = new int[8];
        String[] elevi = new String[4];


        // primaValoarea    a2Valoarea      a3aValoare      a4aValoare
        // index            index               index        index

        //Cristi            null        null        Florin
        //0                1            2           3
        elevi[0] = "Cristi";
        elevi[3] = "Florin";
        //elevi[4] = "nicu"; - ArrayIndexOutOfBoundsException
        for (int i = 0; i < elevi.length; i++) {
            System.out.println(elevi[i]);
        }


    }
}
