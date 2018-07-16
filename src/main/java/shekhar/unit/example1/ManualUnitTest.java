package shekhar.unit.example1;

import java.util.ArrayList;
import java.util.List;

public class ManualUnitTest {

    public ManualUnitTest() {}

    public static void main(String[] args) {

        List listofItemsForShopping = new ArrayList<>();
        System.out.println("Initial size of list is " + listofItemsForShopping.size());

        Object objANewGroceryItem = new Object();
        listofItemsForShopping.add(objANewGroceryItem);
        System.out.println("After adding one item, new size is " + listofItemsForShopping.size());

    }

}
