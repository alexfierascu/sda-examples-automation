package controlStatements.doWhileStatement;

public class HowManyChocolatesCanYouBuy {
    public static void main(String[] args) {
        int amountOfMoney = 9;

        int chocolatePrice = 3;
        int contor = 0;

        while (amountOfMoney > 0) {
            contor++;
            amountOfMoney = amountOfMoney - chocolatePrice;
        }
        System.out.println("Cu while: " + contor);


        int amountOfMoneyFromBank = 0;
        int chocolatePriceInHeaven = 0;
        int secondContor = 0;
        do {
            secondContor++;
            amountOfMoneyFromBank = amountOfMoneyFromBank - chocolatePriceInHeaven;
        } while (amountOfMoneyFromBank > 0);
        System.out.println("Cu do-while: " + secondContor);
    }
}
