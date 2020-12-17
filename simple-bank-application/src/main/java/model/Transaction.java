package model;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class Transaction {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);


    private int id;
    private String type;
    private double value;

    public Transaction() {
        this.id = ID_GENERATOR.getAndIncrement();
    }
}
