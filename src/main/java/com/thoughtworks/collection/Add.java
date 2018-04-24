package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int count = 0;
        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            if(i % 2 == 0){
                count += i;
            }
        }
        return count;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int count = 0;
        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            if(i % 2 == 1){
                count += i;
            }
        }
        return count;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for (Integer i : arrayList) {
            result += i * 3 + 2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            int num = arrayList.get(i);
            if(num % 2 == 1){
                num = 3 * num + 2;
            }
            arrayList.set(i, num);
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for (int i : arrayList) {
            if(i % 2 == 1){
                result += i * 3 + 5;
            }
        }
        return result;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : arrayList) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        int evenCount = evenList.size();
        if (evenCount % 2 == 0) {
            return (evenList.get(evenCount / 2 - 1) + evenList.get(evenCount / 2)) / 2;
        } else {
            return evenList.get(evenCount/2);
        }
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int sum = 0;
        int count = 0;
        for (int num: arrayList){
            if(num % 2 == 0){
                sum += num;
                count++;
            }
        }
        return sum/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        //如果是奇数，直接返回false，因为偶数组成的数组中不可能有奇数
        if(specialElment % 2 == 1){
            return false;
        }

        for (int num : arrayList) {
            if (num == specialElment) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        HashSet<Integer> unrepeatedSet = new HashSet<>();
        for (int num : arrayList) {
            if (num % 2 == 0) {
                unrepeatedSet.add(num);
            }
        }
        return new ArrayList<Integer>(unrepeatedSet);
    }

    /**
     * 排序数组 结果使数组偶数在递增在前，奇数递减在后
     * @param arrayList
     * @return
     */
    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        PriorityQueue<Integer> evenQueue = new PriorityQueue<>((num1, num2) -> { return num1 - num2; });
        PriorityQueue<Integer> oddQueue = new PriorityQueue<>((num1, num2) -> {return num2 - num1; });
        for (int num : arrayList) {
            if (num % 2 == 1) {
                oddQueue.add(num);
            } else {
                evenQueue.add(num);
            }
        }
        List<Integer> sortedList = new ArrayList<>(arrayList.size());
        while (!evenQueue.isEmpty()) {
            sortedList.add(evenQueue.poll());
        }
        while (!oddQueue.isEmpty()) {
            sortedList.add(oddQueue.poll());
        }
        return sortedList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> processedList = new ArrayList<>(arrayList.size() - 1);
        for (int i = 0; i < arrayList.size() - 1; i++) {
            processedList.add((arrayList.get(i) + arrayList.get(i+1))*3);
        }
        return processedList;
    }
}
