package com.tunahan.linkedlist;

import java.util.Objects;

public class Linked {

    Node root;

    public Linked insert(Linked list, String data) {
        Node newNode = new Node(data);
        if (list.root == null)
            list.root = newNode;
        else {
            Node iter = list.root;
            while (iter.next != null)
                iter = iter.next;
            iter.next = newNode;
        }
        return list;
    }

    public Linked delete(Linked list, String deletedData) {


        if (list.root != null && Objects.equals(list.root.data, deletedData)) {
            list.root = list.root.next;
            return list;
        }

        Node iter = list.root;

        while (iter.next != null && !Objects.equals(iter.next.data, deletedData))
            iter = iter.next;

        if (iter.next == null)
            System.out.println("data not found");
        else
            iter.next = iter.next.next;

        return list;
    }

    public void reverseList() {
        Node current = root;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        root = previous;
    }


    public int searchList(String key) {
        Node current = root;
        int index = 0;
        while (current != null) {
            if (current.data.equals(key)) {
                System.out.println(key + " is present at index " + index);
                return index;
            }
            index++;
            current = current.next;
        }
        System.out.println(key + " is not present in the list.");

        return -1;
    }


    public void print(Linked list) {
        Node iter = list.root;
        while (iter != null) {
            System.out.print(iter.data + " ");
            iter = iter.next;
        }
    }

    public int elementPrint(Linked list) {
        int i = 0;
        Node iter = list.root;
        while (iter != null) {
            i++;
            iter = iter.next;
        }
        return i;
    }
}
