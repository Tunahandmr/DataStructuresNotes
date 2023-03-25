package com.tunahan.circulardoublylinkedlist;

public class CircularDoublyLinkedList {

    Node root;


    CircularDoublyLinkedList insert(CircularDoublyLinkedList liste, int data) {

        Node newNode = new Node(data);
        if (liste.root == null) {
            liste.root = newNode;
            liste.root.next = liste.root;
            liste.root.previous = liste.root;
        } else {
            Node iter = liste.root;
            while (iter.next != liste.root)
                iter = iter.next;

            iter.next = newNode;
            newNode.next = liste.root;
            newNode.previous = iter;


        }

        return liste;
    }

    void print(CircularDoublyLinkedList liste) {
        Node iter = liste.root;
        System.out.print(iter.data + " ");
        iter = iter.next;

        while (iter != liste.root) {
            System.out.print(iter.data + " ");
            iter = iter.next;
        }
    }

    void reversePrint(CircularDoublyLinkedList liste) {
        Node iter = findLastNode(liste);


        while (iter != liste.root) {
            System.out.print(iter.data + " ");
            iter = iter.previous;
        }

        System.out.println(liste.root.data);
    }

    Node findLastNode(CircularDoublyLinkedList liste) {
        Node iter = liste.root;
        while (iter.next != liste.root)
            iter = iter.next;

        return iter;
    }

}
