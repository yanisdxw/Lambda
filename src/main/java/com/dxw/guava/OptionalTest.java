package com.dxw.guava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Optional.ofNullable(list).map(List::stream);
    }
}
