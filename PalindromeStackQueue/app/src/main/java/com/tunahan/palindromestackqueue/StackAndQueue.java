package com.tunahan.palindromestackqueue;

public class StackAndQueue {

    int size;
    int top;
    int front;
    int rear;
    String[] stackDatas;
    String[] queueDatas;

    StackAndQueue(String sizeParam) {
        this.size = sizeParam.length();
        this.top = -1;
        this.rear = -1;
        this.front = -1;
        stackDatas = new String[size];
        queueDatas = new String[size];
        for (int i = 0; i < size; i++) {
            this.top++;
            this.rear++;
            stackDatas[this.top] = String.valueOf(sizeParam.charAt(i));
            queueDatas[this.rear] = String.valueOf(sizeParam.charAt(i));
        }
    }

    String palindromeTest() {
        int x = front + 1;
        int y = this.top;
        while (queueDatas[x].equals(stackDatas[y])) {
            if (queueDatas[this.rear].equals(stackDatas[front + 1])) {
                return "palindrome";
            }
            x++;
            y--;
        }

        return "palindrome is not";
    }

    void stackPrint() {
        if (isStackEmpty())
            System.out.println("Stack Boş.");
        else {
            for (int i = this.top; i > -1; i--)
                System.out.println(this.stackDatas[i]);
        }
    }

    void queuePrint() {
        if (isQueueEmpty())
            System.out.println("Stack Boş.");
        else {
            for (int i = front + 1; i <= this.rear; i++)
                System.out.println(this.queueDatas[i]);
        }
    }

    boolean isStackEmpty() {
        if (this.top == -1)
            return true;
        else
            return false;
    }

    boolean isQueueEmpty() {
        return this.rear == this.front;
    }

}
