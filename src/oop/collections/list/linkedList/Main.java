package oop.collections.list.linkedList;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String []args){
        LinkedList  linkedList = new LinkedList();

        linkedList.addAtTail("Luis");
        linkedList.addAtTail("Mike");
        linkedList.addAtTail("Adan");
        linkedList.addAtFront("Fernanda");
        linkedList.addAtFront("Francisco");
        linkedList.addAtTail("ultimo nombre");


        int indexIterator = 0;
        while (indexIterator < linkedList.size()){
            System.out.println(indexIterator + linkedList.getAt(indexIterator));
            indexIterator++;
        }
        System.out.println(" ");
        linkedList.remove(2);
        indexIterator = 0;
        while (indexIterator < linkedList.size()){
            System.out.println(linkedList.getAt(indexIterator));
            indexIterator++;
        }
        System.out.println(linkedList.size());
        linkedList.removeAll();
        System.out.println(" ");
        indexIterator = 0;

        while (indexIterator < linkedList.size()){
            System.out.println(linkedList.getAt(indexIterator));
            indexIterator++;
        }


    }
}
