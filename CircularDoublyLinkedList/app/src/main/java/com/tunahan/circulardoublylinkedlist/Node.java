package com.tunahan.circulardoublylinkedlist;

public class Node {

    int data;
    Node next;
    Node previous;

    public Node(int dataParametre)
    {
        this.data=dataParametre;
        this.next=null;
        this.previous=null;
    }
}
