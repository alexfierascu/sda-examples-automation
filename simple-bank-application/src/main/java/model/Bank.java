package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Bank {
    private double totalAmount;
    private String bankName;
    private Transaction transaction;
    private List<Transaction> transactionDepositList;
    private List<Transaction> transactionRetrievalList;
    private List<Transaction> transactionHistoryList;

    public Bank(String name) {
        this.bankName = name;
        transactionDepositList = new ArrayList<>();
        transactionRetrievalList = new ArrayList<>();
        transactionHistoryList = new ArrayList<>();
    }

    public void makeTransaction(Transaction transaction) {
        transactionHistoryList.add(transaction);
        System.out.println("Enter transaction type");
        Scanner scanner = new Scanner(System.in);
        String transactionType = scanner.nextLine();
        if (transactionType.equals(transaction.getType()) && transactionType.equals("Retragere")) {
            System.out.println("TRANZACTIE TIP RETRAGERE!");
            transactionRetrievalList.add(transaction);
        } else {
            if (transactionType.equals(transaction.getType()) && transactionType.equals("Depunere")) {
                System.out.println("TRANZACTIE TIP DEPUNERE");
                transactionDepositList.add(transaction);
            }
        }
    }

    public void displayAllTransactions() {
        transactionHistoryList.forEach(transaction -> {
            System.out.println("The transaction with ID:" + transaction.getId() + " was of type " + transaction.getType() +
                    " and had a value of " + transaction.getValue());
        });
    }

    private void displayTransactionInformation(Transaction transaction) {
        System.out.println("The transaction with ID:" + transaction.getId() + " was of type " + transaction.getType() +
                " and had a value of " + transaction.getValue());
    }

    public void displayTransactionsAboveLimit() {
        System.out.println("\nWhat is the limit for your transactions?");
        Scanner scanner = new Scanner(System.in);
        double limit = scanner.nextDouble();
        for (Transaction singleTransaction : transactionHistoryList) {
            if (singleTransaction.getValue() >= limit) {
                displayTransactionInformation(singleTransaction);
            }
        }
    }

    private void displayAllTransactionsHistory() {
        for (Transaction transaction : transactionHistoryList) {
            displayTransactionInformation(transaction);
        }
    }

    private void displayRetrievalTransactions() {
        for (Transaction transaction : transactionRetrievalList)
            displayTransactionInformation(transaction);
    }

    private void displayDepositTransactions() {
        for (Transaction transaction : transactionDepositList)
            displayTransactionInformation(transaction);
    }

    public void displayTransactionsType() {
        System.out.println("\nWhat kind of transactions do you want to display?");
        System.out.println("Options are: 1(Deposit) \t\t 2(Retrieval) \t\t 3(All transactions history)");
        Scanner scanner = new Scanner(System.in);
        int transactionType = scanner.nextInt();
        switch (transactionType) {
            case 1:
                displayDepositTransactions();
                break;
            case 2:
                displayRetrievalTransactions();
                break;
            case 3:
                displayAllTransactionsHistory();
                break;
            default:
                System.out.println("Type not recognised");
        }

    }

}
