package com.tunahan.circulardoublylinkedlist;

import java.util.Random;

public class MyMain {

    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();

        for (int i = 0; i < 100; i++) {

            Random random = new Random();
            circularDoublyLinkedList.insert(circularDoublyLinkedList, random.nextInt(100));
        }

        System.out.println("---Print---");
        circularDoublyLinkedList.print(circularDoublyLinkedList);
        System.out.println();
        System.out.println("---Reverse Print---");
        circularDoublyLinkedList.reversePrint(circularDoublyLinkedList);
    }
}
