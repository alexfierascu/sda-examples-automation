import model.Bank;
import model.Transaction;

public class BankExecution {

    //todo 1: create method to display all transactions from the bank
    //todo 2: create method to display all "depunere" transactions from the bank
    //todo 3: create method to display all "retragere" transactions from the bank
    //todo 4: create method to display how many transactions have been made with the value above 5000


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
    }
}
