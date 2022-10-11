import oop.collections.list.ArrayList.ArrayList;
import oop.collections.list.linkedList.LinkedList;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String []args){
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();


        arrayList.addAtTail("Luis");
        arrayList.addAtTail("Mike");
        arrayList.addAtTail("Adan");
        arrayList.addAtFront("Fernanda");
        arrayList.addAtFront("Francisco");
        arrayList.addAtTail("ultimo nombre");

        for (int i = 0;i < arrayList.size(); i++){
            System.out.println(arrayList.getAt(i));
        }
        System.out.println("El tamano del array es: " + arrayList.size());
    }
}
