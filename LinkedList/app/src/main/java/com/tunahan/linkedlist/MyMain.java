package com.tunahan.linkedlist;

public class MyMain {

    public static void main(String[] args) {
        Linked list = new Linked();
        list = list.insert(list, "ömer");
        list = list.insert(list, "mehmet");
        list = list.insert(list, "irem");
        list = list.insert(list, "cansu");
        list = list.insert(list, "elif");
        list = list.insert(list, "azra");
        list = list.insert(list, "şevval");

        list.print(list);

        System.out.println();
        System.out.println("***reverseList metodu***");

        list.reverseList();
        list.print(list);

        System.out.println();
        System.out.println("***delete metodu***");

        list = list.delete(list, "elif");
        list.print(list);

        System.out.println();
        System.out.println("***searchList metodu***");

        list.searchList("azra");

        System.out.println("***elementPrint metodu***");

        int x = list.elementPrint(list);
        System.out.println(x);
    }
}
