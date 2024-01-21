package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(getList(arr));
        System.out.println(getListUsingStream(arr));
    }

    public static List<Integer> getList(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < 7 && i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            result.add(arr[i]);
        }
        return result;
    }

    public static List<Integer> getListUsingStream(Integer[] arr) {

        return Arrays.stream(arr)
                .map(x -> x % 2 == 0 ? x + 1 : x)
                .skip(2)
                .limit(5)
                .collect(Collectors.toList());
    }
}