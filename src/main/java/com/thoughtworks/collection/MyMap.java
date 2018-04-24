package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            array.set(i, num * 3);
        }
        return array;
    }

    public List<String> mapLetter() {
        List<String> letterList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            letterList.add(letters[i]);
        }
        return letterList;
    }

    public List<String> mapLetters() {
        List<String>  letterList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            int value = array.get(i);
            String result = "";
            while (--value >= 0)
            {
                result = letters[value % 26] + result;
                value /= 26;
            }
            letterList.add(result);
        }
        return letterList;
    }

    public List<Integer> sortFromBig() {
        for (int i = 1; i < array.size(); i++) {
            for (int j = 0; j < array.size() - i; j++) {
                if(array.get(j) < array.get(j+1)){
                    int tmp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j + 1, tmp);
                }
            }
        }
        return array;
    }

    public List<Integer> sortFromSmall() {
        for (int i = 1; i < array.size(); i++) {
            for (int j = 0; j < array.size() - i; j++) {
                if(array.get(j) > array.get(j+1)){
                    int tmp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j + 1, tmp);
                }
            }
        }
        return array;
    }
}
