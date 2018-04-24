package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int count = Math.abs(left - right) + 1;
        Integer[] list = new Integer[count];

        int step = left < right ? 1 : -1;
        for (int i = 0; i < count; i++){
            list[i] = left;
            left = left + step;
        }
        return Arrays.asList(list);
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int count = Math.abs(left - right) + 1;
        List<Integer> list = new ArrayList<>();

        int step = left < right ? 1 : -1;
        for (int i = 0; i < count; i++){
            if(left % 2 == 0) {
                list.add(left);
            }
            left = left + step;
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenElements = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                evenElements.add(num);
            }
        }
        return evenElements;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        HashSet<Integer> firstSet = new HashSet<>();
        for (int num : firstArray) {
            firstSet.add(num);
        }

        List<Integer> commentElements = new ArrayList<>();
        for (int num : secondArray) {
            if (firstSet.contains(num)) {
                commentElements.add(num);
            }
        }
        return commentElements;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : firstArray) {
            set.add(num);
        }
        for (int num : secondArray) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
