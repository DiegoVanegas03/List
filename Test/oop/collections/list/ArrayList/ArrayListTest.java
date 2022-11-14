package oop.collections.list.ArrayList;

import oop.collections.list.Iterator;
import oop.collections.list.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.Array;

public class ArrayListTest {
    @Test
    public void givenANewArray_thenSizeIsZero(){
        //Given:
        List arrayList = new ArrayList();

        //When:
        int size = arrayList.getSize();

        //Then:
        Assertions.assertEquals(0,size);
    }
    @Test
    public void givenANewArray_whenAddTail_thenSizeIsOne(){
        //Given:
        List arrayList = new ArrayList();

        //When:
        arrayList.addAtTail("Uno");

        //Then:
        Assertions.assertEquals(1,arrayList.getSize());
    }

    @Test
    public void givenANewArray_whenAddFront_thenSizeIsOne(){
        //Given:
        List arrayList = new ArrayList();

        //When:
        arrayList.addAtFront("Uno");

        //Then:
        Assertions.assertEquals(1,arrayList.getSize());
    }

    @Test
    public void ArrayWithOneElement_WhenAddFront_thenSizeIsTwo(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtFront("Uno");
        //When:
        arrayList.addAtFront("Dos");

        //Then:
        Assertions.assertEquals(2,arrayList.getSize());
    }

    @Test
    public void ArrayWithTwoElement_WhenAddFront_thenSizeIs3(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtFront("Uno");
        arrayList.addAtFront("Dos");
        //When:
        arrayList.addAtFront("Tres");
        //Then:
        Assertions.assertEquals(3,arrayList.getSize());
    }

    @Test
    public void ArrayWithTwoElement_WhenRemoveAll_thenReturnTrue(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        //When:
        arrayList.removeAll();

        //Then:
        Assertions.assertEquals(0,arrayList.getSize());
    }

    @Test
    public void ArrayWith3Element_WhenRemoveWithValue_thenReturnTrue(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        arrayList.removeAllWithValue("Dos");

        //Then:
        Assertions.assertEquals(2,arrayList.getSize());
        Assertions.assertEquals("Uno",arrayList.getAt(0));
    }

    @Test
    public void ArrayWith3Element_WhenRemoveWithIndexLess0_thenReturnFalse(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        boolean result = arrayList.remove(-1);

        //Then:
        Assertions.assertEquals(3,arrayList.getSize());
        Assertions.assertFalse(result);
    }

    @Test
    public void ArrayWith3Element_WhenRemoveWithIndexMoreSize_thenReturnFalse(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        boolean result = arrayList.remove(3);

        //Then:
        Assertions.assertEquals(3,arrayList.getSize());
        Assertions.assertFalse(result);
    }

    @Test
    public void ArrayWith3Element_WhenRemoveWithIndex0_thenReturnTrue(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        boolean result = arrayList.remove(0);

        //Then:
        Assertions.assertEquals(2,arrayList.getSize());
        Assertions.assertTrue(result);
    }

    @Test
    public void ArrayWith3Element_WhenSetAtWithIndexLess0_thenReturnFalse(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        boolean result = arrayList.setAt(-1,"Cuatro");

        //Then:
        Assertions.assertFalse(result);
    }

    @Test
    public void ArrayWith3Element_WhenSetAtWithIndex2_thenReturnTrue(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        boolean result = arrayList.setAt(2,"Cuatro");

        //Then:
        Assertions.assertTrue(result);
        Assertions.assertEquals("Cuatro",arrayList.getAt(2));
    }

    @Test
    public void ArrayWith3Element_WhenGetAtWithIndexLess0_thenReturnFalse(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        boolean result = Boolean.parseBoolean(arrayList.getAt(-1));

        //Then:
        Assertions.assertFalse(result);
    }

    @Test
    public void ArrayTestIterator_WhenHasNext_thenReturnTrue(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        Iterator iterator = arrayList.getIterator();
        boolean result = iterator.hasNext();
        //Then:
        Assertions.assertTrue(result);
    }

    @Test
    public void ArrayTestIterator_WhenNext_thenReturnString(){
        //Given:
        List arrayList = new ArrayList();
        arrayList.addAtTail("Uno");
        arrayList.addAtTail("Dos");
        arrayList.addAtTail("Tres");
        //When:
        Iterator iterator = arrayList.getIterator();
        String result = iterator.Next();
        //Then:
        Assertions.assertEquals("Uno",result);
    }

    @Test
    public void ArrayTestArrayIterator_WhenHasNext_thenReturnTrue(){
        //Given:
        List arraylist = new ArrayList();
        arraylist.addAtTail("Uno");
        ArrayListIterator Iterator = new ArrayListIterator((ArrayList) arraylist);
        //When:
        boolean result = Iterator.hasNext();
        //Then:
        Assertions.assertTrue(result);
    }

    @Test
    public void ArrayTestArrayIterator_WhenNext_thenReturnTrue(){
        //Given:
        List arraylist = new ArrayList();
        arraylist.addAtTail("Uno");
        ArrayListIterator Iterator = new ArrayListIterator((ArrayList) arraylist);
        //When:
        String result = Iterator.Next();
        //Then:
        Assertions.assertEquals("Uno",result);
    }
}
