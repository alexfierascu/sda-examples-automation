package tdd;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Merchandise {
    private String name;
    private double basePrice;

    public Merchandise(String name, double price) {
        this.name = name;
        this.basePrice = price;
    }

    public void setNewBasePrice(double newBasePrice) {
        basePrice = newBasePrice;
    }
}
