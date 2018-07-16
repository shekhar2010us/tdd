package shekhar.unit.example1;

import java.util.ArrayList;
import java.util.List;

public class AutoUnitTest {

    private static void assertTrue(boolean condition) throws Exception {
        if (! condition)
            throw new Exception("Test Failed");
    }

    public static void main(String[] args) throws Exception {
        List listOfItemsForShopping = new ArrayList<>();
        try {
            assertTrue(listOfItemsForShopping.size() == 0);

            Object objANewGroceryItem = new Object();
            listOfItemsForShopping.add(objANewGroceryItem);
            assertTrue(listOfItemsForShopping.size() == 1);
        } catch (Exception ex) {
            System.err.println("Exception in size of shopping cart: " + ex);
        }

    }

}
