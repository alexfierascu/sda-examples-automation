import model.Bank;
import model.Transaction;

public class BankExecution {

    public static void main(String[] args) {
        Bank myBank = new Bank("Piscoteala");

        Transaction firstTransaction = new Transaction();
        firstTransaction.setType("Depunere");
        firstTransaction.setValue(2005.9);
        myBank.makeTransaction(firstTransaction);

        Transaction secondTransaction = new Transaction();
        secondTransaction.setType("Retragere");
        secondTransaction.setValue(5001);
        myBank.makeTransaction(secondTransaction);

        Transaction thirdTransaction = new Transaction();
        thirdTransaction.setType("Depunere");
        thirdTransaction.setValue(5844.69);
        myBank.makeTransaction(thirdTransaction);

        Transaction fourthTransaction = new Transaction();
        fourthTransaction.setType("Depunere");
        fourthTransaction.setValue(87845.54);
        myBank.makeTransaction(fourthTransaction);

        Transaction fifthTransaction = new Transaction();
        fifthTransaction.setType("Retragere");
        fifthTransaction.setValue(90000);
        myBank.makeTransaction(fifthTransaction);

        myBank.displayTransactionsAboveLimit();


        myBank.displayTransactionsType();
    }
}
