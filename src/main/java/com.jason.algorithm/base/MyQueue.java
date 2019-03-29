package com.jason.algorithm.base;

import java.util.Queue;

public class MyQueue<T> {

    private MyNode header;
    private MyNode tail;

    public void enQueue(T data){
        
    }


    private class MyNode {
        private T data;
        private MyNode next;

        public MyNode(T data, MyNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
