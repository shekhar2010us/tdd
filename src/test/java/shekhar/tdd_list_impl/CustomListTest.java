package shekhar.tdd_list_impl;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.List;

public class CustomListTest {

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        List<Object> list = new CustomList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
        List<Object> list = new CustomList<>();
        Object obj = new Object();
        list.add(obj);
        assertFalse(list.isEmpty());
    }


}
