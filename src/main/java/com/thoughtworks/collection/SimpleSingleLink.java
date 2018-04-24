package com.thoughtworks.collection;

import java.util.List;

public class SimpleSingleLink<T> implements SingleLink<T> {

    private LinkNode<T> head = new LinkNode<>();
    private LinkNode<T> tail = head;
    private int size = 0;

    public SimpleSingleLink(List<T> list) {
        LinkNode<T> pNode = head;
        for(T e: list){
            LinkNode<T> node = new LinkNode<T>();
            node.setElement(e);

            pNode.setNext(node);

            size++;
            tail = node;
            pNode = node;
        }
    }

    @Override
    public T getHeaderData() {
        if(head.getNext() == null){
            return null;
        }
        return head.next.getElement();
    }

    @Override
    public T getTailData() {
        return tail.getElement();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean deleteFirst() {
        if(head.next == null){
            return false;
        }
        head.next = head.next.next;
        size --;
        return true;
    }

    @Override
    public boolean deleteLast() {
        if(size == 0){
            return false;
        }
        LinkNode pNode = head;
        while (pNode.next != tail) {
            pNode = pNode.next;
        }
        pNode.next = tail.next;
        size--;
        return true;
    }

    @Override
    public void addHeadPointer(T item) {
        LinkNode<T> node = new LinkNode<T>(item);

        node.next = head.next;
        head.next = node;

        size ++;
    }

    @Override
    public void addTailPointer(T item) {
        LinkNode node = new LinkNode(item);
        tail.next = node;
        tail = node;

        size++;
    }

    @Override
    public T getNode(int index) {
        LinkNode<T> pNode = head;
        for (int i = 0; i < index; i++) {
            pNode = pNode.next;
        }
        return pNode.getElement();
    }

    private class LinkNode<T>{
        private T element;
        private LinkNode<T> next;

        public LinkNode(T element) {
            this.element = element;
        }

        public LinkNode() {
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public LinkNode<T> getNext() {
            return next;
        }

        public void setNext(LinkNode<T> next) {
            this.next = next;
        }
    }
}
