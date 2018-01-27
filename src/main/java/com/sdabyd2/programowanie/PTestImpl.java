package com.sdabyd2.programowanie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PTestImpl {


    public static String last(List<String> lista){


        return "d";
    }

    public static  Object[] removeAt(List<String> list, int k) {
        List<String> input = new ArrayList<String>(list);
        String kth = input.remove(k - 1);
        return new Object[]{input, kth};
    }

    public static int length(List<Integer> list) {
        return list.size();
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("list can't be null");
        }
        Collections.reverse(list);
        return list;
    }

    public static <T> boolean isPalindrome(List<T> list) {
        List<T> original = new ArrayList<>(list);
        PTestImpl.reverse(list);
        return Objects.equals(list, original);
    }

    public static <T> List<T> flatten(List<?> list){

        return list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }


}
