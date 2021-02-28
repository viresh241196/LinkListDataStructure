package com.linklist;

public class MyNode<K> implements INode<K> {
    private K key;
    private MyNode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;

    }

    public MyNode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyNode<K>) next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
