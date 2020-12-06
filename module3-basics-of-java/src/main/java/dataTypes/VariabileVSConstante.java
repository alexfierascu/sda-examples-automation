package dataTypes;

public class VariabileVSConstante {

    final static int constantaMea = 9;
    final static String masinaVietiiMele = "bemveu";

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println(a);
        System.out.println(b);
        a = 99;
        System.out.println(a);

        System.out.println(masinaVietiiMele);
        //constantaMea=4;
    }

    public static void incaOFunctie() {
        System.out.println(masinaVietiiMele);
    }
}
