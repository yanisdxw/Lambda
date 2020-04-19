package com.dxw.guava;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class IOTest {

    @Test
    public void IOTest() throws IOException {
        CharSource charSource = Files.asCharSource(new File("doc/source.txt"), Charsets.UTF_8);
        CharSink charSink = Files.asCharSink(new File("doc/target.txt"), Charsets.UTF_8);
        List<String> sourceTxtList = charSource.readLines();
        sourceTxtList.stream().filter(Objects::nonNull).forEach(System.out::println);
        charSource.copyTo(charSink);
    }

}
