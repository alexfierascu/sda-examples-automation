package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MerchandiseTest {
    @Test
    public void checkIfNameIsCorrectlyAssigned() {
        Merchandise merchandise = new Merchandise("Carrot", 1.5);

        assertEquals("Carrot", merchandise.getName());
    }

    @Test
    public void checkIfPriceIsCorrectlyAssigned() {
        Merchandise merchandise = new Merchandise("Carrot", 1.5);

        assertEquals(1.5, merchandise.getBasePrice(), 0.1);
    }

    @Test
    public void checkIfPriceIsCorrectlyChanged() {
        Merchandise merchandise = new Merchandise("Carrot", 1.5);

        merchandise.setNewBasePrice(1.7);

        assertEquals(1.7, merchandise.getBasePrice(), 0.1);
    }
}
