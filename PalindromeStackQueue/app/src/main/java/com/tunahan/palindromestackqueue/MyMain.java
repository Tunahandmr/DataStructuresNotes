package com.tunahan.palindromestackqueue;

import java.util.Scanner;

public class MyMain {

    public static void main(String [] args){

        boolean bool = true;

        while (bool){
            System.out.print("Kelimeyi girin...: ");
            Scanner scanner = new Scanner(System.in);
            String vocable = scanner.next();

            StackAndQueue stackAndQueue = new StackAndQueue(vocable);
            System.out.println("---Stack Yapısı---");
            stackAndQueue.stackPrint();

            System.out.println("---Queue Yapısı---");
            stackAndQueue.queuePrint();

            System.out.println(stackAndQueue.palindromeTest());

            System.out.println("Devam etmek istiyor musunuz? e/h ...: ");
            String decision = scanner.next();

            if (decision.equals("h")){
                bool=false;
            }

        }

    }
}
