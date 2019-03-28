package com.jason.algorithm.base;

/**
 * 栈的基本操作
 * 栈的特点是先进后出，所以一个线性链表实现的栈只能在一端操作才能满足这个特征
 *
 * @param <T>
 */
public class MyStack<T> {

    //始终指向栈顶的元素
    private MyNode top;
    //元素的个数
    private int size;

    /**
     * 压入操作
     *
     * @param data
     */
    public void push(T data) {
        //next指向当前元素的top，如果是第一个元素next指向null
        MyNode node = new MyNode(data, top);
        //当前的元素指向top
        top = node;
        size++;
    }

    /**
     * 弹出
     *
     * @return
     */
    public T pop() {
        MyNode oldNode = top;
        top = top.next;
        oldNode.next = null;
        return oldNode.data;
    }

    /**
     * 返回栈顶元素，不出栈
     *
     * @return
     */
    public T peek() {
        return top.data;
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    public boolean empty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (empty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (MyNode current = top; current != null; current = current.next) {
            sb.append(current.data.toString() + ", ");
        }
        int len = sb.length();
        return sb.delete(len - 2, len).append("]").toString();
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
