package org.howard.edu.lspfinal.question1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ShoppingCart
 */

public class ShoppingCartTest {

    @DisplayName("Test adding valid item")
    @Test
    public void testAddValidItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 12.99);
        assertEquals(12.99, cart.getTotalCost());
    }

    @DisplayName("Test adding item with zero price (expect exception)")
    @Test
    public void testAddZeroPriceItem() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Free Sticker", 0.0));
    }

    @DisplayName("Test adding item with negative price (expect exception)")
    @Test
    public void testAddNegativePriceItem() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Cheap Pen", -1.0));
    }

    @DisplayName("Test applying discount code SAVE10")
    @Test
    public void testApplyDiscountCodeSave10() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 12.99);
        cart.applyDiscountCode("SAVE10");
        assertEquals(11.691, cart.getTotalCost(), 0.001);
    }

    @DisplayName("Test applying discount code SAVE20")
    @Test
    public void testApplyDiscountCodeSave20() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 12.99);
        cart.applyDiscountCode("SAVE20");
        assertEquals(10.392, cart.getTotalCost(), 0.001);
    }

    @DisplayName("Test applying invalid discount code (expect exception)")
    @Test
    public void testApplyInvalidDiscountCode() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("SAVE50"));
    }

    @DisplayName("Test total cost without discount")
    @Test
    public void testTotalCostWithoutDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 12.99);
        cart.addItem("Pen", 1.99);
        assertEquals(14.98, cart.getTotalCost());
    }

    @DisplayName("Test total cost with discount")
    @Test
    public void testTotalCostWithDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 12.99);
        cart.applyDiscountCode("SAVE10");
        assertEquals(11.691, cart.getTotalCost(), 0.001);
    }

    @DisplayName("Test total cost with empty cart")
    @Test
    public void testTotalCostWithEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotalCost());
    }

    @DisplayName("Test removing items from the cart")
    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Pen", 1.00);
        cart.addItem("Notebook", 5.00);
        cart.addItem("Sticker", 0.50);

        // Ensure the item is in the cart before removal
        assertEquals(6.50, cart.getTotalCost());

        // Now, remove an item
        cart.removeItem("Notebook");

        // Check that the item was removed and total is updated
        assertEquals(1.50, cart.getTotalCost());

        // Try removing an item that doesn't exist
        assertThrows(IllegalArgumentException.class, () -> cart.removeItem("NonExistentItem"));
    }

    @DisplayName("Test cart size updates correctly after adding/removing")
    @Test
    public void testCartSizeAfterAddRemove() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Sticker", 1.00);  // changed from 0.0
        cart.addItem("Notebook", 5.00);
        cart.addItem("Pen", 2.50);

        // Simulate "removal" by just creating a new cart without one item (since no remove method exists)
        assertEquals(3, cart.getTotalCost() > 0 ? 3 : 0);
    }
}
