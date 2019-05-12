package com.exercises.java.datastructures;

public class BidirectionalListNode<D> extends ListNode<D> {

    private BidirectionalListNode<D> next;
    private BidirectionalListNode<D> previous;

    BidirectionalListNode(D data){
        super(data);
        this.previous = null;
    }

    @Override
    public BidirectionalListNode<D> getNext() {
        return next;
    }

    public BidirectionalListNode<D> getPrevious() {
        return previous;
    }


    public void setNext(BidirectionalListNode<D> next) {
        this.next = next;
    }

    public void setPrevious(BidirectionalListNode<D> previous) {
        this.previous = previous;
    }


}
