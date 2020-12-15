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
        String transcationType = scanner.nextLine();
        if (transcationType.equals(transaction.getType()) && transcationType.equals("Retragere")) {
            System.out.println("TRANZACTIE TIP RETRAGERE!");
            transactionRetrievalList.add(transaction);
        } else {
            if (transcationType.equals(transaction.getType()) && transcationType.equals("Depunere")) {
                System.out.println("TRANZACTIE TIP DEPUNERE");
                transactionDepositList.add(transaction);
            }
        }
    }
}
