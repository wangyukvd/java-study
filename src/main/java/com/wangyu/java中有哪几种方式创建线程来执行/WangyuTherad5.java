package com.wangyu.java中有哪几种方式创建线程来执行;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//利用线程池来创建线程
public class WangyuTherad5 implements Runnable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new WangyuTherad5());
    }

    @Override
    public void run() {
        System.out.println("hello wangyu");
    }
    //实习callable接口或者Runnable接口都可以，由ExecutorService来创建线程
}
