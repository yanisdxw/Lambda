package com.dxw.threadpool;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class SubmitTest {

    private static final ExecutorService threadpool = Executors.newCachedThreadPool();

    @Test
    public void test() throws ExecutionException, InterruptedException {
        Future<Integer> rst = threadpool.submit(()->{
            Thread.sleep(1000*5);
            return 5;
        });
        log.info("结果为:");
        /**阻塞方法*/
        log.info("rst:{}",rst.get());
    }

    @Test
    public void test2() throws InterruptedException {
        threadpool.execute(()->{
            try {
                Thread.sleep(1000*5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("rst:5");
        });
        log.info("结果为:");
//        Thread.sleep(1000L*1000);
    }
}
