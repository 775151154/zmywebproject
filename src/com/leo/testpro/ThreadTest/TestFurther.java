package com.leo.testpro.ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * �����̳߳ؿ��Ʒ���ִ��ʱ��
 *
 * @author leo
 */
public class TestFurther {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        FutureTask<Boolean> futureTask = new FutureTask<>(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("�������㡣");
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
            System.out.println("��ʱ�˰�~~~");
            e.printStackTrace();
            executorService.shutdownNow();
        }
    }
}
