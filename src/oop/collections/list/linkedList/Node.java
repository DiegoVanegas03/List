package oop.collections.list.linkedList;

public class Node {
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
