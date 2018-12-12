## 1 Overview
We will walk through a custom List implementation using the Test-Driven Development (TDD) process.

TDD is a design tool, enabling us to drive our implementation with the help of tests.

A quick disclaimer – we’re not focusing on creating efficient implementation here - just using it to display TDD practices.

## 2 Getting Started
First, let’s define the skeleton for our class.

The CustomList class implements the List interface, hence it must contain implementations for all the methods declared in that interface.

<b>CustomList Class</b>
```code
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomList<E> implements List<E> {
    private Object[] internal = {};
    
    // empty implementation methods

    @Override
    public int size() {return 0;}
    
    @Override
    public boolean isEmpty() {return false;}
    
    @Override
    public boolean contains(Object o) {return false;}

    @Override
    public Iterator<E> iterator() {return null;}

    @Override
    public Object[] toArray() {return new Object[0];}

    @Override
    public <T> T[] toArray(T[] a) {return null;}

    @Override
    public boolean add(E e) {return false;}

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {return false;}

    @Override
    public boolean addAll(Collection<? extends E> c) {return false;}

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {return false;}

    @Override
    public boolean removeAll(Collection<?> c) {return false;}

    @Override
    public boolean retainAll(Collection<?> c) {return false;}

    @Override
    public void clear() {}

    @Override
    public E get(int index) {return null;}

    @Override
    public E set(int index, E element) {return null;}

    @Override
    public void add(int index, E element) {}

    @Override
    public E remove(int index) {return null;}

    @Override
    public int indexOf(Object o) {return 0;}

    @Override
    public int lastIndexOf(Object o) {return 0;}

    @Override
    public ListIterator<E> listIterator() {return null;}

    @Override
    public ListIterator<E> listIterator(int index) {return null;}

    @Override
    public List<E> subList(int fromIndex, int toIndex) {return null;}

}
```

<b>CustomListTest Class</b>
```code
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.List;

public class CustomListTest {
}
```

## 3 TDD Cycles
Developing our implementation with TDD means that we need to create test cases first, thereby defining requirements for our implementation. Only then we’ll create or fix the implementation code to make those tests pass.

In a very simplified manner, the three main steps in each cycle are:

##### Writing tests –
Define requirements in the form of tests

##### Implementing features –
Make the tests pass without focusing too much on the elegance of the code

##### Refactoring – 
Improve the code to make it easier to read and maintain while still passing the tests

<p>
We’ll go through these TDD cycles for some methods of the List interface, starting with the simplest ones.
</p>


## 4 The isEmpty Method

The <b>isEmpty</b> method is probably the most straightforward method defined in the List interface. Here’s our starting implementation.
```code
@Override
    public boolean isEmpty() {return false;}
```

This initial method definition is enough to compile. The body of this method will be “forced” to improve when more and more tests are added.

#### 4.1 The First Cycle
Let’s write the first test case which makes sure that the isEmpty method returns true when the list doesn’t contain any element:

```
@Test
public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
    List<Object> list = new CustomList<>();
    assertTrue(list.isEmpty());
}
```

The given test fails since the isEmpty method always returns false. We can make it pass just by flipping the return value:

```
@Override
public boolean isEmpty() {
    return true;
}
```