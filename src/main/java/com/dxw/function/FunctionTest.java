package com.dxw.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionTest {

    public static void main(String[] args) {
        consumer("hello world!",s->System.out.println(s));
        String s1 = supplier(()->"hello world!");
        String s2 = function("hello",(s)->s+" world!");
        boolean s3 = predicate("hello world!",(s)->"hello world!".equals(s));
        String s4 = binaryOperator("hello ", "world!", (a,b)->a+b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    public static void consumer(String s, Consumer<String> c){ c.accept(s);}

    public static String supplier(Supplier<String> s){ return s.get();}

    public static String function(String s, Function<String,String> f){ return f.apply(s);}

    public static boolean predicate(String s, Predicate<String> p){ return p.test(s);}

    public static String binaryOperator(String a, String b, BinaryOperator<String> op){return op.apply(a,b);}

}
