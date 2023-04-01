package com.tunahan.stack;

public class Stack {

    int size;
    int top;
    int[] datas;

    Stack(int sizeParam) {
        this.size = sizeParam;
        this.top = -1;
        datas = new int[size];
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Dolu.");
        } else {
            this.top++;
            this.datas[this.top] = data;
        }
    }


    int pop(int data) {
        if (isEmpty()) {
            System.out.println("Stack Boş.");
            return -1;
        } else {
            int[] popData = new int[size];
            int i = 0;

            while (this.datas[this.top] != data) {
                popData[i] = this.datas[this.top];
                this.top--;
                i++;
            }
            this.top--;
            int x = 1;
            for (int a = i - 1; a > -1; a--) {
                this.top++;
                this.datas[this.top] = popData[a];
                x++;

            }

            return data;
        }

    }

    void replaceElement(){
        int myTop = this.datas[0];
        this.datas[0]=this.datas[this.top];
        this.datas[this.top] = myTop;
    }


    void print() {
        if (isEmpty())
            System.out.println("Stack Boş.");
        else {
            for (int i = this.top; i > -1; i--)
                System.out.println(this.datas[i]);
        }
    }

    boolean isFull() {
        if (this.top == (this.size - 1))
            return true;
        else
            return false;
    }

    boolean isEmpty() {
        if (this.top == -1)
            return true;
        else
            return false;
    }

}
