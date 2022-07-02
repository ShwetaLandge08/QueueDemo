package com.niit.queuedemo;

public class MyQueue {
    Node front;
    Node rear;
    //Insert at the end
    public void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            front = node;
            rear = node;
        }
        else{
            rear.setNext(node);
            rear = node;
        }
    }
    //Delete from beginning
    public int dequeue(){
        int deletedData = 0;
        if(!(isEmpty())){
            deletedData = front.getData();
            front = front.getNext();
            // if front become null, we will update rear
            if(isEmpty()){
                rear = null;
            }
        }
        return deletedData;
    }
    public int peek(){
        if(!(isEmpty())){
            return front.getData();
        }
      return  0;
    }
    private boolean isEmpty() {
        return front == null;
    }
}
