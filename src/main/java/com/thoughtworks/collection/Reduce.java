package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = arrayList.get(0);
        for (int num : arrayList) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double getMinimum() {
        int min = arrayList.get(0);
        for (int num : arrayList) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public double getAverage() {
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        return sum*1.0 / arrayList.size();
    }

    public double getOrderedMedian() {
        if(arrayList.size() % 2 == 1){
            return arrayList.get(arrayList.size()/2);
        }
        return (arrayList.get(arrayList.size()/2) + arrayList.get(arrayList.size()/2 - 1)) / 2.0;
    }

    public int getFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0){
                return arrayList.get(i);
            }
        }
        return -1;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0){
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (arrayList.size() != this.arrayList.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != this.arrayList.get(i)) {
                return false;
            }
        }
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (int num : arrayList) {
            singleLink.addTailPointer(num);
        }
        int size = arrayList.size();
        if(arrayList.size() % 2 == 1){
            return (Integer)singleLink.getNode(size/2) * 1.0;
        }
        return ((Integer)singleLink.getNode(size/2) + (Integer)singleLink.getNode(size/2 + 1)) / 2.0;
    }

    public int getLastOdd() {
        int odd = -1;
        for (int num : arrayList) {
            if (num % 2 == 1) {
                odd = num;
            }
        }
        return odd;
    }

    public int getIndexOfLastOdd() {
        int oddIndex = -1;
        for (int i = 0; i < arrayList.size() ; i++) {
            if (arrayList.get(i) % 2 == 1) {
                oddIndex = i;
            }
        }
        return oddIndex;
    }
}
