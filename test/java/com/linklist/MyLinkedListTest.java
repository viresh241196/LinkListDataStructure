package com.linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumberWhenAddedToLinkedListShouldAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.add(mySecondNode);
        myLinkList.add(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myThirdNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumberWhenAppendedToLinkedListShouldAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenInsertedBetweenLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.append(myThirdNode);
        myLinkList.insertNode(myFirstNode,mySecondNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
