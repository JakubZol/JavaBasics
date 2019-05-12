package com.exercises.java.datastructures;

public class ListNode<D> {

    private ListNode<D> next;
    private D data;

    public ListNode(D data){
        this.data = data;
        this.next = null;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public ListNode<D> getNext() {
        return next;
    }

    public void setNext(ListNode<D> next) {
        this.next = next;
    }
}
