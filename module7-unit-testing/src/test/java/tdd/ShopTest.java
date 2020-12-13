package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    @Test
    public void checkIfShopNameIsCorrectlyAssigned() {
        Shop shop = new Shop("O'Briens Veggies");

        assertEquals("O'Briens Veggies", shop.getShopName());
    }

    @Test
    public void addMerchandiseAndCheckOnStockSuccess() {
        Shop shop = new Shop("test");

        shop.addMerchandise("Onion", 2.1);
        boolean isOnStock = shop.isOnStock("Onion");

        assertTrue(isOnStock);
    }

    @Test
    public void addMerchandiseAndCheckOnStockFail() {
        Shop shop = new Shop("test");

        shop.addMerchandise("Onion", 2.1);
        boolean isOnStock = shop.isOnStock("Carrot");

        assertFalse(isOnStock);
    }

    @Test
    public void addMerchandiseAndCheckOnStockCaseInsensitiveSuccess() {
        Shop shop = new Shop("test");

        shop.addMerchandise("Onion", 2.1);
        boolean isOnStock = shop.isOnStock("onion");

        assertTrue(isOnStock);
    }

    @Test
    public void addMerchandiseAndCheckItsPrice() {
        Shop shop = new Shop("test");
        shop.addMerchandise("Onion", 2.1);

        double amount = shop.getMerchandisePrice("Onion");

        assertEquals(2.1, amount, 0.1);
    }

    @Test
    public void updateMerchandisePrice() {
        Shop shop = new Shop("test");
        shop.addMerchandise("Onion", 2.1);
        shop.addMerchandise("Onion", 2.6);

        double amount = shop.getMerchandisePrice("Onion");

        assertEquals(2.6, amount,0.1);
    }
}
