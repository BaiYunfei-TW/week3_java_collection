package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> evenList = new ArrayList<>();
        for (Integer e : array) {
            if (e % 2 == 0) {
                evenList.add(e);
            }
        }
        return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> evenList = new ArrayList<>();
        for (Integer e : array) {
            if (e % 3 == 0) {
                evenList.add(e);
            }
        }
        return evenList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        Set<Integer> firstElementSet = new LinkedHashSet<>(secondList);
        List<Integer> commentElements = new ArrayList<>();
        for (Integer num : firstList) {
            if (firstElementSet.contains(num)) {
                commentElements.add(num);
            }
        }
        return commentElements;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> differentSet = new LinkedHashSet<>();
        for (Integer e : array) {
            differentSet.add(e);
        }
        return new ArrayList<>(differentSet);
    }
}