package com.dxw.guava;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class OptionalTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Optional.ofNullable(list).map(List::stream).orElseGet(Stream::empty).forEach(System.out::println);

        Set<Integer> set1 = Sets.newHashSet(1,2,3);
        Set<Integer> set2 = Sets.newHashSet(2,3,4);
        Set<Integer> set3 = Sets.union(set1,set2);
        Set<Integer> set4 = Sets.intersection(set1,set2);
        Set<Integer> set5 = Sets.difference(set1,set2);
        Set<Integer> set6 = Sets.symmetricDifference(set1,set2);
        Set<Integer> set7 = Sets.symmetricDifference(set2,set1);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        System.out.println(set4);
        System.out.println(set5);
        System.out.println(set6);
        System.out.println(set7);
    }
}
