package com.tunahan.stack;

public class MyMain {

    public static void main(String[] args) {

        Stack stackOrnek=new Stack(5);
        stackOrnek.push(39);
        stackOrnek.push(30);
        stackOrnek.push(25);
        stackOrnek.push(10);
        stackOrnek.push(61);
        System.out.println("---initial state---");
        stackOrnek.print();
        System.out.println("---pop---");
        System.out.println("Çıkarılacak Sayı:"+ stackOrnek.pop(30));
        stackOrnek.print();
        System.out.println("---replace---");
        stackOrnek.replaceElement();
        stackOrnek.print();
    }

}
