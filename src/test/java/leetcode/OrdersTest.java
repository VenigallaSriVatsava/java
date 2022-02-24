package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrdersTest {

    @Test
    void maximumProfit() {
        ArrayList<Integer> inventories = new ArrayList<>();


        inventories.clear();
        inventories.add(10);
        inventories.add(10);
        int actual = Orders.maximumProfit(inventories, 5);
        int expected = 46;
        assertEquals(expected, actual);


    }

    @Test
    void multipleProfits_fetch_MultipleInventories() {
        ArrayList<Integer> inventories = new ArrayList<>();
        inventories.add(4);
        inventories.add(6);
        inventories.add(6);
        inventories.add(6);
        inventories.add(9);

        int actual = Orders.maximumProfit(inventories, 5);
        int expected = 40;
        assertEquals(expected, actual);

    }
}