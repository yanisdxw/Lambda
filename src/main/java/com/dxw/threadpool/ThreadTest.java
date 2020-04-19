package com.dxw.threadpool;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

    @Test
    public void handle() throws InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            threadPool.execute(()->{
                System.out.println("开始处理请求");
                try {
                    Thread.sleep(1000L*5);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("请求处理完成");
            });
        }
        Thread.sleep(1000L*1000);
    }

}
