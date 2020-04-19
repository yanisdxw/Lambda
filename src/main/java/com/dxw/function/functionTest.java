package com.dxw.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functionTest {
    public static void main(String[] args) {
        consumer("hello world!",s->System.out.println(s));
        String s1 = supplier(()->"hello world!");
        String s2 = function("hello",(s)->s+" world!");
        boolean s3 = predicate("hello world!",(s)->"hello world!".equals(s));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static void consumer(String s, Consumer<String> c){ c.accept(s);}

    public static String supplier(Supplier<String> s){ return s.get();}

    public static String function(String s, Function<String,String> f){ return f.apply(s);}

    public static boolean predicate(String s, Predicate<String> p){ return p.test(s);}
}
