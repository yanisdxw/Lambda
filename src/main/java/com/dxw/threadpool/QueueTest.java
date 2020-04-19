package com.dxw.threadpool;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

@Slf4j
public class QueueTest {

    @Test
    public void test() throws InterruptedException {
        ArrayBlockingQueue queue = new ArrayBlockingQueue<Integer>(10);
        for (int i = 0; i < 20; i++) {
            System.out.println("向队列添加值："+i);
            queue.put(i);
        }
    }

    @Test
    public void test2() throws InterruptedException {
        LinkedBlockingQueue queue = new LinkedBlockingQueue<Integer>(10);
        for (int i = 0; i < 20; i++) {
            System.out.println("向队列添加值："+i);
            queue.put(i);
        }
    }

    @Test
    public void test3() {
        SynchronousQueue queue = new SynchronousQueue<Integer>();
        //插入值
        new Thread(()->{
            try {
                queue.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        //删除值
        new Thread(()->{
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
