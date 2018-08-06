package com.leo.testpro.ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 利用线程池控制方法执行时间
 *
 * @author leo
 */
public class TestFurther {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        FutureTask<Boolean> futureTask = new FutureTask<>(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("不告诉你。");
                Thread.sleep(1000 * 3);
                return Boolean.FALSE;
            }
        });

        try {
            executorService.submit(futureTask).get(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("超时了吧~~~");
            e.printStackTrace();
            executorService.shutdownNow();
        }
    }
}
