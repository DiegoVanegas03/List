package oop.collections.list.linkedList;

public class LinkedListIterator {
    private Node iterator;

    public LinkedListIterator(Node node){
        this.iterator = node;
    }

    public boolean hasNext(){
        return iterator.getNext() != null;
    }

    public String next(){
            if(iterator.getNext() != null) {
                String data = iterator.getData();
                iterator = iterator.getNext();
                return data;
            }else{
                return null;
            }
    }
}
