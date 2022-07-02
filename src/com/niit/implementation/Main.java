package com.niit.implementation;

import com.niit.queuedemo.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.dequeue() = " + myQueue.dequeue());
        System.out.println("myQueue.peek() = " + myQueue.peek());

    }
}
