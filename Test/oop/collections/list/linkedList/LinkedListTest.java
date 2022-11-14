package oop.collections.list.linkedList;
import oop.collections.list.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTest {
    @Test
    public void givenANewList_thenSizeIsZero(){
        //Given:
        List linkedList = new LinkedList();

        //When:
        int size = linkedList.getSize();

        //Then:
        Assertions.assertEquals(0,size);
    }

    @Test
    public void givenANewList_whenAddAtTail_thenSizeIsOne(){
        //Given:
        List linkedList = new LinkedList();

        //When:
        linkedList.addAtTail("Uno");

        //Then:
        Assertions.assertEquals(1,linkedList.getSize());
        Assertions.assertEquals("Uno",linkedList.getAt(0));
    }

    @Test
    public void givenANonEmptyList_whenAddAtTail_thenSizeIsIncreased(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        //When:
        linkedList.addAtTail("Dos");

        //Then:
        Assertions.assertEquals(2,linkedList.getSize());
        Assertions.assertEquals("Uno",linkedList.getAt(0));
        Assertions.assertEquals("Dos",linkedList.getAt(1));
    }

    @Test
    public void givenANewList_whenAddAtFront_thenSizeIsOne(){
        //Given:
        List linkedList = new LinkedList();

        //When:
        linkedList.addAtFront("Uno");

        //Then:
        Assertions.assertEquals(1,linkedList.getSize());
        Assertions.assertEquals("Uno",linkedList.getAt(0));
    }

    @Test
    public void givenANonList_whenAddAtFront_thenSizeIsIncreased(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtFront("Uno");
        //When:
        linkedList.addAtFront("Dos");

        //Then:
        Assertions.assertEquals(2,linkedList.getSize());
        Assertions.assertEquals("Dos",linkedList.getAt(0));
        Assertions.assertEquals("Uno",linkedList.getAt(1));
    }

    @Test
    public void givenAList_whenRemoveLessThanZero_thenReturnFalse(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtFront("Uno");
        //When:
        boolean result = linkedList.remove(-1);

        //Then:
        Assertions.assertFalse(result);
    }

    @Test
    public void givenAList_whenRemoveGreaterThanSize_thenReturnFalse(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtFront("Uno");
        //When:
        boolean result = linkedList.remove(1);

        //Then:
        Assertions.assertFalse(result);
    }

    @Test
    public void givenAListWithOneElement_whenRemove0_thenReturnTrue(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtFront("Uno");
        //When:
        boolean result = linkedList.remove(0);

        //Then:
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,linkedList.getSize());
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveHead_thenReturnTrue(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtFront("Uno");
        linkedList.addAtFront("Dos");
        //When:
        boolean result = linkedList.remove(0);

        //Then:
        Assertions.assertTrue(result);
        Assertions.assertEquals(1,linkedList.getSize());
        Assertions.assertEquals("Uno",linkedList.getAt(0));
    }

    @Test
    public void givenAListWithOneElement_whenRemoveTail_thenReturnTrue(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        linkedList.addAtTail("Dos");
        //When:
        boolean result = linkedList.remove(1);

        //Then:
        Assertions.assertTrue(result);
        Assertions.assertEquals(1,linkedList.getSize());
        Assertions.assertEquals("Uno",linkedList.getAt(0));
    }

    @Test
    public void givenAListWith3Elements_whenRemoveMiddle_thenReturnTrue(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        linkedList.addAtFront("Dos");
        linkedList.addAtTail("Tres");
        //When:
        boolean result = linkedList.remove(1);

        //Then:
        Assertions.assertTrue(result);
        Assertions.assertEquals(2,linkedList.getSize());
        Assertions.assertEquals("Dos",linkedList.getAt(0));
        Assertions.assertEquals("Tres",linkedList.getAt(1));
    }

    @Test
    public void givenAListWith3Elements_whenRemoveAll_thenSizeIsZero(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        linkedList.addAtFront("Dos");
        linkedList.addAtTail("Tres");
        //When:
        linkedList.removeAll();

        //Then:
        Assertions.assertEquals(0,linkedList.getSize());
    }

    @Test
    public void givenAListWith3Elements_whenSetAt1_thenElementISModified(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        linkedList.addAtFront("Dos");
        linkedList.addAtTail("Tres");
        //When:
        linkedList.setAt(1,"Cuatro");

        //Then:
        Assertions.assertEquals(3,linkedList.getSize());
        Assertions.assertEquals("Cuatro",linkedList.getAt(1));
    }

    @Test
    public void givenAListWith3Elements_whenSetAtLessThanZero_thenReturnFalse(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        linkedList.addAtFront("Dos");
        linkedList.addAtTail("Tres");
        //When:
        boolean result = linkedList.setAt(-1,"Cuatro");

        //Then:
        Assertions.assertEquals(3,linkedList.getSize());
        Assertions.assertFalse(result);
    }

    @Test
    public void givenAListWith3Elements_whenSetAtIndex3_thenReturnFalse(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        linkedList.addAtFront("Dos");
        linkedList.addAtTail("Tres");
        //When:
        boolean result = linkedList.setAt(3,"Cuatro");

        //Then:
        Assertions.assertEquals(3,linkedList.getSize());
        Assertions.assertFalse(result);
    }

    @Test
    public void givenAListWith3Elements_whenRemoveWithValue_thenReturnTrue(){
        //Given:
        List linkedList = new LinkedList();
        linkedList.addAtTail("Uno");
        linkedList.addAtFront("Dos");
        linkedList.addAtTail("Tres");
        //When:
        linkedList.removeAllWithValue("Uno");

        //Then:
        Assertions.assertEquals(2,linkedList.getSize());
        Assertions.assertEquals("Tres",linkedList.getAt(1));
    }
}
