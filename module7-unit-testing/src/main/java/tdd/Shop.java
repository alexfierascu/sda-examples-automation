package tdd;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Shop {
    private String shopName;
    private List<Merchandise> stock;

    public Shop(String shopName) {
        this.shopName = shopName;
        stock = new ArrayList<>();
    }

    /**
     * Adds merchandise to the list
     *
     * @param merchandiseName merchandise name
     * @param basePrice       base price without any sales
     */
    public void addMerchandise(String merchandiseName, double basePrice) {
        Merchandise merchandise = findMerchandiseByName(merchandiseName);

        if (merchandise == null) {
            stock.add(new Merchandise(merchandiseName, basePrice));
        } else {
            merchandise.setNewBasePrice(basePrice);
        }
    }

    /**
     * Check if merchandise is on stock
     *
     * @param merchandiseName merchandise name
     * @return true - is on stock, false - not on stock
     */
    public boolean isOnStock(String merchandiseName) {
        return findMerchandiseByName(merchandiseName) != null;
    }

    /**
     * Returns the price of merchandise
     *
     * @param merchandiseName merchandise name
     * @return price of merchandise
     */
    public double getMerchandisePrice(String merchandiseName) {
        Merchandise merchandise = findMerchandiseByName(merchandiseName);

        if (merchandise != null) {
            return merchandise.getBasePrice();
        }
        return 0.0;
    }

    /**
     * Looks for merchandise by name
     *
     * @param merchandiseName searched merchandise
     * @return merchandise object, if found, null if not found
     */
    private Merchandise findMerchandiseByName(String merchandiseName) {
        for (Merchandise merchandise : stock) {
            if (merchandise.getName().toUpperCase().equals(merchandiseName.toUpperCase()))
                return merchandise;
        }
        return null;
    }
}
