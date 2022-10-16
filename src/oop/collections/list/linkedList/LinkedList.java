package oop.collections.list.linkedList;

import oop.collections.list.Iterator;
import oop.collections.list.List;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    private class LinkedListIterator implements Iterator {
        private Node iterator;

        public LinkedListIterator(){
            this.iterator = head;
        }

        public boolean hasNext(){
            return iterator.getNext() != null;
        }

        public String Next(){
            if(iterator.getNext() != null) {
                String data = iterator.getData();
                iterator = iterator.getNext();
                return data;
            }else{
                return null;
            }
        }
    }

    public void addAtTail(String data){
        Node node = new Node(data);

        node.setPrevious(tail);
        tail = node;

        if(head == null){
            head = node;
        }else{
            node.getPrevious().setNext(node);
        }
        size ++;
    }

    public void addAtFront(String data){
        Node node = new Node(data);

        node.setNext(head);
        head = node;

        if(head == null){
            tail = node;
        }else{
            node.getNext().setPrevious(node);
        }
        size++;
    }

    private static class Node {
        private String data;
        private Node next;
        private Node previous;


        public Node(String data) {
            this.data = data;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Node getNext(){
            return next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getPrevious() {
            return previous;
        }
    }

    public boolean remove(int indexToRemove){
        if(indexToRemove < 0 || indexToRemove >= size){
            return false;
        }

        if (size == 1) {
            System.out.println("Entro al primer if");
            head = null;
            tail = null;
            size = 0;
        } else if(indexToRemove == 0) {
            System.out.println("Entro al segundo if");
            head = head.getNext();
            head.setPrevious(null);
        } else if (indexToRemove == size-1) {
            System.out.println("Entro al tercer if");
            System.out.println(tail.getData());
            tail = tail.getPrevious();
            tail.setNext(null);
        }else{
            System.out.println("Entro al cuarto if");
            Node iteratorNode = findNodeByIndex(indexToRemove);

            iteratorNode.getPrevious().setNext(iteratorNode.getNext());
            iteratorNode.getNext().setPrevious(iteratorNode.getPrevious());
        }
        size--;
        return true;
    }

    public void removeAll(){
        int indexIteratorNode = 0;
        while (indexIteratorNode < size) {
            System.out.println(indexIteratorNode);
            remove(indexIteratorNode);
            indexIteratorNode++;
        }
    }

    public boolean setAt(int index, String data){
        if(index < 0 || index >= size){
            return false;
        }
        Node node = findNodeByIndex(index);

        node.setData(data);
        return true;
    }

    public String getAt(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node node = findNodeByIndex(index);
        return node.getData();
    }

    public void removeAllWithValue(String data){
        Node iteratorNode =  head;
        int indexIteratorNode = 0;

        while(indexIteratorNode < size && iteratorNode.getData() == data){
            indexIteratorNode++;
        }
    }

    public int getSize(){
        return size;
    }

    public LinkedListIterator getIterator(){
        return new LinkedListIterator();
    }

    private Node findNodeByIndex(int index) {
        Node iteratorNode = head;
        int indexIteratorNode = 0;

        while (indexIteratorNode < index){
            iteratorNode = iteratorNode.getNext();
            indexIteratorNode++;
        }
        return iteratorNode;
    }
}
