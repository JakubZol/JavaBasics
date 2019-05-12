package com.exercises.java.datastructures;

public class MyLinkedList<D> {

    private ListNode<D> head;
    private int length = 0;


    public MyLinkedList(){}


    public MyLinkedList(D data){

        this.head = new ListNode<>(data);
        this.length = 1;

    }


    public void push(D data){

        if(this.length == 0){
            this.head = new ListNode<>(data);
        }
        else{
            ListNode<D> tmp = this.head;

            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }

            tmp.setNext(new ListNode<>(data));
        }

        this.length += 1;
    }


    public D get(int idx){

        if(idx < length){

            ListNode<D> tmp = this.head;

            for(int i = 0; i < idx; i++){
                tmp = tmp.getNext();
            }

            return tmp.getData();
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }


    public void remove(int idx){

        if(idx < length){

            ListNode<D> tmp = this.head;

            for(int i = 0; i < idx - 1; i++){
                tmp = tmp.getNext();
            }

            ListNode<D> newNext = tmp.getNext().getNext();
            tmp.setNext(newNext);
            this.length -= 1;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }


    public D pop(){

        ListNode<D> tmp = this.head;
        while (tmp.getNext().getNext() != null) {
            tmp = tmp.getNext();
        }

        D output = tmp.getNext().getData();
        tmp.setNext(null);
        this.length -= 1;
        return output;
    }


    public int length(){
        return this.length;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder("[ ");

        ListNode<D> tmp = this.head;

        while(tmp.getNext() != null){
            sb.append(tmp.getData());
            sb.append(" ");
            tmp = tmp.getNext();
        }

        sb.append(tmp.getData());
        sb.append(" ]");

        return sb.toString();

    }

}
