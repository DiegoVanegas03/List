import oop.collections.list.ArrayList.ArrayList;
import oop.collections.list.List;
import oop.collections.list.linkedList.LinkedList;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String []args){
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();

        linkedList.addAtTail("Luis");
        linkedList.addAtTail("Mike");
        linkedList.addAtTail("Adan");
        linkedList.addAtFront("Fernanda");
        linkedList.addAtFront("Francisco");
        linkedList.addAtTail("ultimo nombre");

        for (int i = 0;i < linkedList.getSize(); i++){
            System.out.println(linkedList.getAt(i));
        }
        System.out.println("El tamano de la lista es: " + linkedList.getSize());

        arrayList.addAtTail("Luis");
        arrayList.addAtTail("Mike");
        arrayList.addAtTail("Adan");
        arrayList.addAtFront("Fernanda");
        arrayList.addAtFront("Francisco");
        arrayList.addAtTail("ultimo nombre");

        for (int i = 0;i < arrayList.getSize(); i++){
            System.out.println(arrayList.getAt(i));
        }
        System.out.println("El tamano del array es: " + arrayList.getSize());
    }
}
