package com.dxw.lombok;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
@EqualsAndHashCode
public class lombokTest {

    @Getter(lazy = true)
    private final String key = "xxss";

    @Getter(value = AccessLevel.PRIVATE, onMethod_ = {@NonNull})
    public String name;

    public void nonNull(@NonNull String s){
        System.out.println(s);
    }

    @Test
    public void nonNullTest(){
        nonNull("null");
    }

    public void valTest(){
        val v = "xxx";
    }

}
