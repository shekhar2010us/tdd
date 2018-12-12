## 1 Overview
We will walk through a custom List implementation using the Test-Driven Development (TDD) process.

TDD is a design tool, enabling us to drive our implementation with the help of tests.

A quick disclaimer – we’re not focusing on creating efficient implementation here - just using it to display TDD practices.

## 2 Getting Started
First, let’s define the skeleton for our class.

The CustomList class implements the List interface, hence it must contain implementations for all the methods declared in that interface.

<b>CustomList Class</b>
```code
import java.util.*;

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
import static org.junit.Assert.assertEquals;
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
---- This is already in our class
@Override
    public boolean isEmpty() {return false;}
```

This initial method definition is enough to compile. The body of this method will be “forced” to improve when more and more tests are added.

#### 4.1 The First Cycle
Let’s write the first test case which makes sure that the isEmpty method returns true when the list doesn’t contain any element.

Let's write below code in our <b>CustomListTest </b> Class

```
@Test
public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
    List<Object> list = new CustomList<>();
    assertTrue(list.isEmpty());
}
```

> The given test fails since the <b>isEmpty</b> method always returns false. We can make it pass just by flipping the return value:

Let's change the isEmpty code in our <b>CustomList </b> Class
```
@Override
public boolean isEmpty() {
    return true;    <---- this is changed
}
```

> Now the test will pass

#### 4.2 The Second Cycle
To confirm that the isEmpty method returns false when the list isn’t empty, we need to add at least one element:

Let's add this code to our <b>CustomListTest</b> Class.

```code
@Test
public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
    List<Object> list = new CustomList<>();
    Object obj = new Object();
    list.add(obj);
    assertFalse(list.isEmpty());
}
```

An implementation of the add method is now required. Here’s the add method we start with:

```code
---- This is already in our class, we will change it in the next code block
@Override
public boolean add(E e) {
    return false;
}
```

This method implementation doesn’t work as no changes to the internal data structure of the list are made. Let’s update it to store the added element:

Let's add the below code to our <b>CustomList</b> Class.

```code
@Override
public boolean add(E e) {
    internal = new Object[] { e };
    return false;
}
```

Our test still fails since the <b>isEmpty</b> method hasn’t been enhanced. Let’s do that:

Let's add the below code to our <b>CustomList</b> Class.

```code
@Override
public boolean isEmpty() {
    if (internal.length != 0) {
        return false;
    } else {
        return true;
    }
}
```
The non-empty test passes at this point.
> Run the test and verify


#### 4.3 Refactoring
Both test cases we’ve seen so far pass, but the code of the isEmpty method could be more elegant.

Let’s refactor it:

```code
@Override
public boolean isEmpty() {
    return internal.length == 0;
}
```

We can see that tests pass, so the implementation of the isEmpty method is complete now.
> Run the test and verify


## 5 The size Method
This is our starting implementation of the size method enabling the <b>CustomList</b> class to compile:

```code
---- This is already in our class
@Override
public int size() {
    return 0;
}
```

#### 5.1 The First Cycle
Using the existing add method, we can create the first test for the size method, verifying that the size of a list with a single element is 1:

Let's add this to our <b>CustomListTest</b> class.

```code
@Test
public void givenListWithAnElement_whenSize_thenOneIsReturned() {
    List<Object> list = new CustomList<>();
    list.add(null);
    assertEquals(1, list.size());
}
```

The test fails as the size method is returning 0. Let’s make it pass with a new implementation:

Let's add this to our <b>CustomList</b> class.


```code
@Override
public int size() {
    if (isEmpty()) {
        return 0;
    } else {
        return internal.length;
    }
}
```

#### 5.2 Refactoring
We can refactor the size method to make it more elegant:

```code
@Override
public int size() {
    return internal.length;
}
```

The implementation of this method is now complete.
> Run the test and verify


## 6 The get Method
Here’s the starting implementation of get:

```code
---- This is already in our class
@Override
public E get(int index) {
    return null;
}
```

#### 6.1 The first cycle
Let’s take a look at the first test for this method, which verifies the value of the single element in the list:

Let's add this to our <b>CustomListTest</b> class.

```code
@Test
public void givenListWithAnElement_whenGet_thenThatElementIsReturned() {
    List<Object> list = new CustomList<>();
    list.add("baeldung");
    Object element = list.get(0);
 
    assertEquals("baeldung", element);
}
```

The test will pass with this implementation of the get method:

Let's add this to our <b>CustomList</b> class.

```code
@Override
public E get(int index) {
    return (E) internal[0];
}
```

#### 6.2 Improvement
Usually, we’d add more tests before making additional improvements to the get method. Those tests would need other methods of the List interface to implement proper assertions.

However, these other methods aren’t mature enough, yet, so we break the TDD cycle and create a complete implementation of the get method, which is, in fact, not very hard.

It’s easy to imagine that get must extract an element from the internal array at the specified location using the index parameter:

Let's change to our <b>CustomList</b> class.

```code
@Override
public E get(int index) {
    return (E) internal[index];
}
```
> Run the test and verify


## 7. The add Method
This is the add method we created in section 4:

```
---- This is already in our class
@Override
public boolean add(E e) {
    internal = new Object[] { e };
    return false;
}
```

#### 7.1 The First Cycle
The following is a simple test that verifies the return value of add:

Let's add this to our <b>CustomListTest</b> class.

```
@Test
public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement() {
    List<Object> list = new CustomList<>();
    boolean succeeded = list.add(null);
 
    assertTrue(succeeded);
}
```

We must modify the add method to return true for the test to pass:

Let's add this to our <b>CustomList</b> class.

```
@Override
public boolean add(E element) {
    internal = new Object[] { element };
    return true;
}
```

Although the test passes, the add method doesn’t cover all cases yet. If we add a second element to the list, the existing element will be lost.

#### 7.2 The Second Cycle
Here’s another test adding the requirement that the list can contain more than one element:

Let's add this to our <b>CustomListTest</b> class.

```
@Test
public void givenListWithAnElement_whenAnotherIsAdded_thenGetReturnsBoth() {
    List<Object> list = new CustomList<>();
    list.add("baeldung");
    list.add(".com");
    Object element1 = list.get(0);
    Object element2 = list.get(1);
 
    assertEquals("baeldung", element1);
    assertEquals(".com", element2);
}
```

The test will fail since the add method in its current form doesn’t allow more than one element to be added.

Let's add this to our <b>CustomList</b> class.

```
@Override
    public boolean add(E e) {
        Object[] temp = Arrays.copyOf(internal, internal.length + 1);
        temp[internal.length] = e;
        internal = temp;
        return true;
    }
```

The implementation is elegant enough, hence we don’t need to refactor it.

## 8. Conclusion
We went through a test-driven development process to create part of a custom List implementation.

Using TDD, we can implement requirements step by step, while keeping the test coverage at a very high level.

Also, the implementation is guaranteed to be testable, since it was created to make the tests pass.

